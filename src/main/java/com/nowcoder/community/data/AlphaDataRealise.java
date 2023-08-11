package com.nowcoder.community.data;

import org.springframework.stereotype.Repository;

@Repository
public class AlphaDataRealise  implements AlphaData{
    @Override
    public String select(){
        return "Realise Methode";
    }
}
