package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ug5 {

    /* JADX INFO: renamed from: a */
    public final Object f63886a;

    /* JADX INFO: renamed from: b */
    public xe1 f63887b = new xe1();

    /* JADX INFO: renamed from: c */
    public boolean f63888c;

    /* JADX INFO: renamed from: d */
    public boolean f63889d;

    public ug5(Object obj) {
        this.f63886a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ug5.class != obj.getClass()) {
            return false;
        }
        return this.f63886a.equals(((ug5) obj).f63886a);
    }

    public final int hashCode() {
        return this.f63886a.hashCode();
    }
}
