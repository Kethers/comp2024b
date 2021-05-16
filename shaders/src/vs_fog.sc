
#include <bgfx_shader.sh>

void main() {
    vec2 vertices[3] = {
        vec2(-1, 1),
        vec2(-1, -3),
        vec2(3, 1)
    };

    gl_Position = vec4(vertices[gl_VertexID], 0.0f, 1.0f);
}
