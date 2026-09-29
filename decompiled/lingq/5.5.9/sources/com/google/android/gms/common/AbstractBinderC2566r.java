package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.common.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2566r extends AbstractBinderC2564p {

    /* JADX INFO: renamed from: d */
    public static final WeakReference f13993d = new WeakReference(null);

    /* JADX INFO: renamed from: c */
    public WeakReference f13994c;

    public AbstractBinderC2566r(byte[] bArr) {
        super(bArr);
        this.f13994c = f13993d;
    }

    /* JADX INFO: renamed from: b1 */
    public abstract byte[] mo7612b1();

    @Override // com.google.android.gms.common.AbstractBinderC2564p
    /* JADX INFO: renamed from: h0 */
    public final byte[] mo7616h0() {
        byte[] bArrMo7612b1;
        synchronized (this) {
            bArrMo7612b1 = (byte[]) this.f13994c.get();
            if (bArrMo7612b1 == null) {
                bArrMo7612b1 = mo7612b1();
                this.f13994c = new WeakReference(bArrMo7612b1);
            }
        }
        return bArrMo7612b1;
    }
}
