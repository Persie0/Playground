package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import ae.C0062b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public enum AnnotationUseSiteTarget {
    FIELD(null, 1, null),
    FILE(null, 1, null),
    PROPERTY(null, 1, null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null, 1, null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");

    private final String renderName;

    AnnotationUseSiteTarget(String str) {
        this.renderName = str == null ? C0062b.m387q2(name()) : str;
    }

    /* synthetic */ AnnotationUseSiteTarget(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }

    public final String getRenderName() {
        return this.renderName;
    }
}
