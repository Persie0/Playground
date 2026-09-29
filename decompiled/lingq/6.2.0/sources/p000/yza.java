package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yza {

    /* JADX INFO: renamed from: a */
    public final List f70717a;

    public yza(List list) {
        list.getClass();
        this.f70717a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yza) && fa4.m11650l(this.f70717a, ((yza) obj).f70717a);
    }

    public final int hashCode() {
        return this.f70717a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("VocabularyFilterState(settings=", ")", this.f70717a);
    }
}
