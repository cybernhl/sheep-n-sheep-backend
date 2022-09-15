package sps;

import lombok.AllArgsConstructor;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/9/15 12:58
 */
@lombok.Data
@AllArgsConstructor
public class Data {
    String id;
    Integer map_id;
    String updated_at;
    String map_data;
    String created_at;
}
