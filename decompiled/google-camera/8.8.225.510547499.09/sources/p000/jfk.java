package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jfk {

    /* JADX INFO: renamed from: a */
    public final jev f33882a;

    /* JADX INFO: renamed from: b */
    public final jcw f33883b;

    public jfk(jev jevVar, jcw jcwVar) {
        this.f33882a = jevVar;
        this.f33883b = jcwVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof jfk)) {
            jfk jfkVar = (jfk) obj;
            if (jib.m13209n(this.f33882a, jfkVar.f33882a) && jib.m13209n(this.f33883b, jfkVar.f33883b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33882a, this.f33883b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        jib.m13211p("key", this.f33882a, arrayList);
        jib.m13211p("feature", this.f33883b, arrayList);
        return jib.m13210o(arrayList, this);
    }
}
