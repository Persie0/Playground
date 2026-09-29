package p000;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final class ef0 {

    /* JADX INFO: renamed from: a */
    public final List f37159a;

    /* JADX INFO: renamed from: b */
    public final boolean f37160b;

    public ef0(List list, boolean z) {
        this.f37159a = list;
        this.f37160b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef0)) {
            return false;
        }
        ef0 ef0Var = (ef0) obj;
        return fa4.m11650l(this.f37159a, ef0Var.f37159a) && this.f37160b == ef0Var.f37160b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37160b) + (this.f37159a.hashCode() * 31);
    }

    public final String toString() {
        return "BookChallengeState(books=" + this.f37159a + ", multiBookEnabled=" + this.f37160b + ")";
    }

    public /* synthetic */ ef0() {
        this(EmptyList.f47638a, false);
    }
}
