package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class bf1 extends xe1 {

    /* JADX INFO: renamed from: c */
    public final boolean f8449c;

    public bf1(C3126ix c3126ix, boolean z) {
        super(c3126ix);
        this.f8449c = z;
    }

    @Override // p000.xe1
    /* JADX INFO: renamed from: d */
    public final void mo3678d(byte b) {
        if (this.f8449c) {
            mo339j(String.valueOf(b & 255));
        } else {
            m24472h(String.valueOf(b & 255));
        }
    }

    @Override // p000.xe1
    /* JADX INFO: renamed from: f */
    public final void mo3679f(int i) {
        boolean z = this.f8449c;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            mo339j(unsignedString);
        } else {
            m24472h(unsignedString);
        }
    }

    @Override // p000.xe1
    /* JADX INFO: renamed from: g */
    public final void mo3680g(long j) {
        boolean z = this.f8449c;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            mo339j(unsignedString);
        } else {
            m24472h(unsignedString);
        }
    }

    @Override // p000.xe1
    /* JADX INFO: renamed from: i */
    public final void mo3681i(short s) {
        if (this.f8449c) {
            mo339j(String.valueOf(s & 65535));
        } else {
            m24472h(String.valueOf(s & 65535));
        }
    }
}
