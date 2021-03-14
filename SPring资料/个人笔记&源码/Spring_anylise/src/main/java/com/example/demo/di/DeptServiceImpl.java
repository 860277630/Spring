package com.example.demo.di;

//service组件
public class DeptServiceImpl implements DeptService {

    //需要DAO组件对象 依赖DAO组件
    private DeptDAO deptDAO;
    //公开的SET方法   但是代码层面是没有地方调用的
    public void setDeptDAO(DeptDAO deptDAO) {
        this.deptDAO = deptDAO;
    }

    @Override
    public void save(String name) {
        System.out.println("deptService name: "+name);
        deptDAO.save(name);
    }
}
