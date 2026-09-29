package com.google.android.gms.internal.play_billing;

import ae.C0062b;

/* JADX INFO: loaded from: classes.dex */
final class zzaf extends zzx {

    /* JADX INFO: renamed from: g */
    public static final zzx f14581g = new zzaf(0, null, new Object[0]);

    /* JADX INFO: renamed from: d */
    public final transient Object f14582d;

    /* JADX INFO: renamed from: e */
    public final transient Object[] f14583e;

    /* JADX INFO: renamed from: f */
    public final transient int f14584f;

    public zzaf(int i10, Object obj, Object[] objArr) {
        this.f14582d = obj;
        this.f14583e = objArr;
        this.f14584f = i10;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0004  */
    @Override // com.google.android.gms.internal.play_billing.zzx, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f14583e;
            if (this.f14584f == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f14582d;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int iM255C2 = C0062b.m255C2(obj.hashCode());
                        while (true) {
                            int i10 = iM255C2 & length;
                            int i11 = bArr[i10] & 255;
                            if (i11 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i11])) {
                                obj2 = objArr[i11 ^ 1];
                            } else {
                                iM255C2 = i10 + 1;
                            }
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int iM255C3 = C0062b.m255C2(obj.hashCode());
                        while (true) {
                            int i12 = iM255C3 & length2;
                            char c10 = (char) sArr[i12];
                            if (c10 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c10])) {
                                obj2 = objArr[c10 ^ 1];
                            } else {
                                iM255C3 = i12 + 1;
                            }
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int iM255C4 = C0062b.m255C2(obj.hashCode());
                        while (true) {
                            int i13 = iM255C4 & length3;
                            int i14 = iArr[i13];
                            if (i14 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i14])) {
                                obj2 = objArr[i14 ^ 1];
                            } else {
                                iM255C4 = i13 + 1;
                            }
                        }
                    }
                }
                obj2 = null;
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f14584f;
    }
}
