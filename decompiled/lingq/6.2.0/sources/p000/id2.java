package p000;

import kotlin.collections.builders.MapBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class id2 extends kd2 {

    /* JADX INFO: renamed from: a */
    public final MapBuilder f43958a;

    public id2(MapBuilder mapBuilder) {
        this.f43958a = mapBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof id2) && this.f43958a.equals(((id2) obj).f43958a);
    }

    public final int hashCode() {
        return this.f43958a.hashCode();
    }

    public final String toString() {
        return "SetTags(tags=" + this.f43958a + ')';
    }
}
