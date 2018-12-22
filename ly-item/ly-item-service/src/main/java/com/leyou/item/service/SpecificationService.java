package com.leyou.item.service;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.item.mapper.SpecGroupMapper;
import com.leyou.item.mapper.SpecParamMapper;
import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.pojo.SpecParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author zhangwei
 * @date 2018/12/20 19:21
 */
@Service
public class SpecificationService {

    @Autowired
    private SpecGroupMapper groupMapper;
    @Autowired
    private SpecParamMapper paramMapper;

    public List<SpecGroup> querySpecGroups(Long cid) {
        SpecGroup specGroup = new SpecGroup();
        specGroup.setCid(cid);
        List<SpecGroup> list = groupMapper.select(specGroup);
        if (CollectionUtils.isEmpty(list)) {
            //没找到
            throw new LyException(ExceptionEnum.SPEC_GROUP_NOT_FOUND);
        }
        return  list;
    }

    public List<SpecParam> queryParamList(Long gid,Long cid,Boolean searching) {
        SpecParam specParam = new SpecParam();
        specParam.setGroupId(gid);
        specParam.setCid(cid);
        specParam.setSearching(searching);
        List<SpecParam> list = paramMapper.select(specParam);
        if (CollectionUtils.isEmpty(list)) {
            //没找到
            throw new LyException(ExceptionEnum.SPEC_PARAM_NOT_FOUND);
        }
        return  list;
    }
}
