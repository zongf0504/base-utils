package org.zongf.base.utils.common.util;


import org.zongf.base.utils.common.exception.AssertException;

import java.util.Collection;
import java.util.Map;

/**断言工具类
 * @since 1.0
 * @author zongf
 * @created 2019-07-01
 */
public class AssertUtil {

    /**判断对象非空
     * @param object 要判断的对象, 可为任意类型
     * @exception AssertException 对象为空
     * @since 1.0
     * @author zongf
     * @created 2019-07-01
     */
    public static void notNull(Object object) {
        notNull("不能为null");
    }

    /**校验字符串非空, null和一组空格均视为空
     * @param str 字符串
     * @exception AssertException 字符串为空
     * @since 1.0
     * @author zongf
     * @created 2019-07-01
     */
    public static void notEmpty(String str) {
        notEmpty("不能为空字符串");
    }

    /**校验集合非空, null和0个元素均视为空
     * @param collection 集合对象, 可为List, Set, Collection等
     * @exception AssertException 集合为空
     * @since 1.0
     * @author zongf
     * @created 2019-07-01
     */
    public static void notEmpty(Collection collection) {
        notEmpty(collection, "不能为空集合");
    }

    /**校验Map非空, null和0个元素均视为空
     * @param map map对象
     * @exception AssertException map为空
     * @since 1.0
     * @author zongf
     * @created 2019-07-01
     */
    public static void notEmpty(Map map) {
        notEmpty(map, "不能为空map");
    }

    /**校验数组非空, null和0个元素均视为空
     * @param array 任意类型数组,非int[],long[]等基本类型数组
     * @exception AssertException 数组为空
     * @since 1.0
     * @author zongf
     * @created 2019-07-01
     */
    public static void notEmpty(Object[] array) {
        notEmpty(array, "不能为空数组");
    }

    //************************************** 自定义异常信息 *****************************************

    /**判断对象非空
     * @param object 要判断的对象, 可为任意类型
     * @param exDesc 异常描述信息
     * @exception AssertException 自定义异常描述exDesc
     * @since 1.0
     * @author zongf
     * @created 2019-07-01
     */
    public static void notNull(Object object, String exDesc) {
        if (object == null) {
            throw new AssertException(exDesc);
        }
    }

    /**校验字符串非空, null和一组空格均视为空
     * @param str 字符串
     * @param exDesc 异常描述信息
     * @exception AssertException 自定义异常描述exDesc
     * @since 1.0
     * @author zongf
     * @created 2019-07-01
     */
    public static void notEmpty(String str, String exDesc) {
        if (str == null || "".equals(str.trim())) {
            throw new AssertException(exDesc);
        }
    }

    /**校验集合非空, null和0个元素均视为空
     * @param collection 集合对象, 可为List, Set, Collection等
     * @param exDesc 异常描述信息
     * @exception AssertException 自定义异常描述exDesc
     * @since 1.0
     * @author zongf
     * @created 2019-07-01
     */
    public static void notEmpty(Collection collection, String exDesc) {
        if (collection == null || collection.size() == 0) {
            throw new AssertException(exDesc);
        }
    }

    /**校验Map非空, null和0个元素均视为空
     * @param map map对象
     * @param exDesc 异常描述信息
     * @exception AssertException 自定义异常描述exDesc
     * @since 1.0
     * @author zongf
     * @created 2019-07-01
     */
    public static void notEmpty(Map map, String exDesc) {
        if (map == null || map.size() == 0) {
            throw new AssertException(exDesc);
        }
    }

    /**校验数组非空, null和0个元素均视为空
     * @param array 任意类型数组,非int[],long[]等基本类型数组
     * @param exDesc 异常描述信息
     * @exception AssertException 自定义异常描述exDesc
     * @since 1.0
     * @author zongf
     * @created 2019-07-01
     */
    public static void notEmpty(Object[] array, String exDesc) {
        if (array == null || array.length == 0) {
            throw new AssertException(exDesc);
        }
    }

}
