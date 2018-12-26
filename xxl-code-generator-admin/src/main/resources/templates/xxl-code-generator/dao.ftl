import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* ${classInfo.classComment}
* Created  by miaohq
* DateTime on ${.now?string('yyyy-MM-dd HH:mm:ss')}
*/
public interface ${classInfo.className}Dao {

    /**
    * 新增
    */
    public int insert(@Param("${classInfo.className?uncap_first}") ${classInfo.className} ${classInfo.className?uncap_first});

    /**
    * 删除
    */
    public int delete(@Param("id") String id);

    /**
    * 更新
    */
    public int update(@Param("${classInfo.className?uncap_first}") ${classInfo.className} ${classInfo.className?uncap_first});

    /**
    * Load查询
    */
    public ${classInfo.className} load(@Param("id") String id);

    /**
    * Load查询
    */
    public List<${classInfo.className}> getAll();


    /**
    * 分页查询Data
    */
	public List<${classInfo.className}> pageList(@Param("offset") int offset,
                                                 @Param("pagesize") int pagesize);

    /**
    * 分页查询Count
    */
    public int pageListCount(@Param("offset") int offset,
                             @Param("pagesize") int pagesize);

}
