package com.xzp.smartcampus.system.web;


import com.xzp.smartcampus.common.vo.PageResult;
import com.xzp.smartcampus.system.model.AuthorityGroupModel;
import com.xzp.smartcampus.system.service.IAuthorityGroupService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 权限组
 */
@RestController
@RequestMapping("/authority-group")
public class AuthorityGroupController {

    @Resource
    private IAuthorityGroupService authorityGroupService;

    /**
     * 分页查询教育局数据
     *
     * @param searchValue 搜索条件
     * @param current     当前页
     * @param pageSize    页容量
     * @return ResponseEntity<PageResult>
     */
    @GetMapping("/gets/page")
    public ResponseEntity<PageResult> getAuthorityGroupPage(AuthorityGroupModel searchValue,
                                                            @RequestParam(value = "current") Integer current,
                                                            @RequestParam(value = "pageSize") Integer pageSize) {

        return ResponseEntity.ok(authorityGroupService.getAuthorityGroupPage(searchValue, current, pageSize));
    }


}