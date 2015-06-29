//package immutable;
//
//import com.google.common.collect.ImmutableMap;
//import concepts.immutable.ImmutableMapHelper;
//import foundation.json.JsonMagic;
//import junit.framework.TestCase;
//
//import java.util.Map;
//
///**
// * @author yushaoen
// */
//public class ImmutableMapHelperTest extends TestCase {
//
//    @SuppressWarnings("unchecked")
//    public void testConvertReturnsNestedImmutableMap() throws Exception {
//        String testJsonString = "{a:{a:{a:{a:{a:{a:{a:1}}}}}}}";
//        Map<String, Object> map = JsonMagic.fromJson(testJsonString);
//        Map<String, Object> immutableMap = ImmutableMapHelper.build(map);
//
//        for (int i = 0; i < 6; i++) {
//            immutableMap = (Map<String, Object>) immutableMap.get("a");
//            assertTrue(immutableMap instanceof ImmutableMap);
//        }
//
//        assertEquals(1, immutableMap.get("a"));
//    }
//}