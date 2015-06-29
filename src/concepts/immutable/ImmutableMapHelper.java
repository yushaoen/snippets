package concepts.immutable;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
 * @author yushaoen
 */
public class ImmutableMapHelper {

    @SuppressWarnings("unchecked")
    public static ImmutableMap<String, Object> build(Map<String, Object> map) {
        ImmutableMap.Builder<String, Object> builder = ImmutableMap.builder();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() instanceof Map) {
                builder.put(entry.getKey(), build((Map<String, Object>) entry.getValue()));
            }
            else {
                builder.put(entry.getKey(), entry.getValue());
            }
        }
        return builder.build();
    }
}
