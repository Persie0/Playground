package kotlin.reflect.jvm.internal.impl.renderer;

import dm.C5207g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mo.C7661i;

/* JADX INFO: loaded from: classes2.dex */
public enum RenderingFormat {
    PLAIN { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.PLAIN
        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        public final String escape(String str) {
            C5207g.m11111f(str, "string");
            return str;
        }
    },
    HTML { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML
        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        public final String escape(String str) {
            C5207g.m11111f(str, "string");
            return C7661i.m15254T2(C7661i.m15254T2(str, "<", "&lt;"), ">", "&gt;");
        }
    };

    /* synthetic */ RenderingFormat(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String escape(String str);
}
