package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum pam implements nxt {
    UNKNOWN(0),
    CREDENTIAL_ENCRYPTED(1),
    DEVICE_ENCRYPTED(2);


    /* JADX INFO: renamed from: d */
    public final int f47233d;

    pam(int i) {
        this.f47233d = i;
    }

    @Override // p000.nxt
    /* JADX INFO: renamed from: a */
    public final int mo14936a() {
        return this.f47233d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f47233d);
    }
}
