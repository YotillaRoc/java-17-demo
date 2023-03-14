package com.yotilla.bilbao.demos.record;

import lombok.Builder;

@Builder
public record Point(
        Integer x,
        Integer y
) {
}
