package p000;

import androidx.wear.ambient.AmbientDelegate;

/* JADX INFO: renamed from: ue */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1035ue extends C0747jn {

    /* JADX INFO: renamed from: a */
    public final AmbientDelegate f47727a;

    public C1035ue(AmbientDelegate ambientDelegate, byte[] bArr) {
        this.f47727a = ambientDelegate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1035ue) && ooc.m18737c(this.f47727a, ((C1035ue) obj).f47727a);
    }

    public final int hashCode() {
        return this.f47727a.hashCode();
    }

    public final String toString() {
        return "RequestClose(activeCamera=" + this.f47727a + ')';
    }
}
