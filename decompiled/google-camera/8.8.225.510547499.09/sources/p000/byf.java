package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import com.google.android.material.behavior.iWN.zuAgeeF;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byf implements bqt {

    /* JADX INFO: renamed from: c */
    private static final bko f4738c = new bko((char[]) null);

    /* JADX INFO: renamed from: a */
    private final Context f4739a;

    /* JADX INFO: renamed from: b */
    private final List f4740b;

    /* JADX INFO: renamed from: d */
    private final bko f4741d;

    /* JADX INFO: renamed from: e */
    private final dsx f4742e;

    public byf(Context context, List list, bti btiVar, btg btgVar) {
        bko bkoVar = f4738c;
        this.f4739a = context.getApplicationContext();
        this.f4740b = list;
        this.f4742e = new dsx(btiVar, btgVar);
        this.f4741d = bkoVar;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01f2 A[Catch: all -> 0x02b3, TryCatch #0 {, blocks: (B:4:0x000f, B:6:0x0013, B:8:0x001c, B:82:0x01f7, B:84:0x01fb, B:87:0x0201, B:89:0x020d, B:91:0x0212, B:95:0x0225, B:97:0x0239, B:100:0x023e, B:101:0x0275, B:102:0x0276, B:105:0x0282, B:94:0x0221, B:90:0x0210, B:9:0x0021, B:12:0x002a, B:13:0x0035, B:15:0x0043, B:25:0x00a2, B:27:0x00a8, B:29:0x00ae, B:30:0x00b6, B:31:0x00b9, B:77:0x01e8, B:32:0x00bd, B:34:0x00c3, B:35:0x00ca, B:39:0x010a, B:41:0x010e, B:43:0x0118, B:45:0x0130, B:42:0x0115, B:46:0x0140, B:47:0x0145, B:48:0x0148, B:49:0x014d, B:52:0x015a, B:53:0x0165, B:55:0x0172, B:57:0x017b, B:58:0x018a, B:60:0x018e, B:63:0x0196, B:64:0x019b, B:65:0x01a0, B:67:0x01bb, B:68:0x01bd, B:72:0x01c4, B:75:0x01d0, B:76:0x01e3, B:78:0x01ec, B:80:0x01f2, B:81:0x01f4, B:16:0x0048, B:20:0x0065, B:22:0x0088, B:24:0x008e, B:110:0x02ab, B:111:0x02b2), top: B:118:0x000f, outer: #1 }] */
    @Override // p000.bqt
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ bsz mo2930a(Object obj, int i, int i2, bqr bqrVar) {
        bqb bqbVar;
        bqb bqbVar2;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        bqc bqcVarM2608b = this.f4741d.m2608b(byteBuffer);
        try {
            SystemClock.elapsedRealtimeNanos();
            if (bqcVarM2608b.f4158b == null) {
                throw new IllegalStateException("You must call setData() before parseHeader()");
            }
            byj byjVar = null;
            int iHighestOneBit = 0;
            if (bqcVarM2608b.m2910e()) {
                bqbVar = bqcVarM2608b.f4159c;
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < 6; i3++) {
                    sb.append((char) bqcVarM2608b.m2906a());
                }
                if (sb.toString().startsWith("GIF")) {
                    bqcVarM2608b.f4159c.f4149f = bqcVarM2608b.m2907b();
                    bqcVarM2608b.f4159c.f4150g = bqcVarM2608b.m2907b();
                    int iM2906a = bqcVarM2608b.m2906a();
                    bqb bqbVar3 = bqcVarM2608b.f4159c;
                    bqbVar3.f4151h = (iM2906a & 128) != 0;
                    bqbVar3.f4152i = (int) Math.pow(2.0d, (iM2906a & 7) + 1);
                    bqcVarM2608b.f4159c.f4153j = bqcVarM2608b.m2906a();
                    bqcVarM2608b.f4159c.f4154k = bqcVarM2608b.m2906a();
                    if (bqcVarM2608b.f4159c.f4151h && !bqcVarM2608b.m2910e()) {
                        bqb bqbVar4 = bqcVarM2608b.f4159c;
                        bqbVar4.f4144a = bqcVarM2608b.m2911f(bqbVar4.f4152i);
                        bqb bqbVar5 = bqcVarM2608b.f4159c;
                        bqbVar5.f4155l = bqbVar5.f4144a[bqbVar5.f4153j];
                    }
                } else {
                    bqcVarM2608b.f4159c.f4145b = 1;
                }
                if (!bqcVarM2608b.m2910e()) {
                    while (!bqcVarM2608b.m2910e()) {
                        int i4 = bqcVarM2608b.f4159c.f4146c;
                        switch (bqcVarM2608b.m2906a()) {
                            case 33:
                                switch (bqcVarM2608b.m2906a()) {
                                    case 1:
                                        bqcVarM2608b.m2909d();
                                        break;
                                    case 249:
                                        bqcVarM2608b.f4159c.f4147d = new bqa();
                                        bqcVarM2608b.m2906a();
                                        int iM2906a2 = bqcVarM2608b.m2906a();
                                        bqa bqaVar = bqcVarM2608b.f4159c.f4147d;
                                        int i5 = (iM2906a2 & 28) >> 2;
                                        bqaVar.f4139g = i5;
                                        if (i5 == 0) {
                                            bqaVar.f4139g = 1;
                                        }
                                        bqaVar.f4138f = 1 == (iM2906a2 & 1);
                                        int iM2907b = bqcVarM2608b.m2907b();
                                        if (iM2907b < 2) {
                                            iM2907b = 10;
                                        }
                                        bqa bqaVar2 = bqcVarM2608b.f4159c.f4147d;
                                        bqaVar2.f4141i = iM2907b * 10;
                                        bqaVar2.f4140h = bqcVarM2608b.m2906a();
                                        bqcVarM2608b.m2906a();
                                        break;
                                    case 254:
                                        bqcVarM2608b.m2909d();
                                        break;
                                    case 255:
                                        bqcVarM2608b.m2908c();
                                        StringBuilder sb2 = new StringBuilder();
                                        for (int i6 = 0; i6 < 11; i6++) {
                                            sb2.append((char) bqcVarM2608b.f4157a[i6]);
                                        }
                                        if (sb2.toString().equals(zuAgeeF.WOAs)) {
                                            do {
                                                bqcVarM2608b.m2908c();
                                                byte[] bArr = bqcVarM2608b.f4157a;
                                                if (bArr[0] == 1) {
                                                    bqcVarM2608b.f4159c.f4156m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
                                                }
                                                if (bqcVarM2608b.f4160d <= 0) {
                                                }
                                            } while (!bqcVarM2608b.m2910e());
                                        } else {
                                            bqcVarM2608b.m2909d();
                                            continue;
                                        }
                                        break;
                                    default:
                                        bqcVarM2608b.m2909d();
                                        break;
                                }
                                break;
                            case 44:
                                bqb bqbVar6 = bqcVarM2608b.f4159c;
                                if (bqbVar6.f4147d == null) {
                                    bqbVar6.f4147d = new bqa();
                                }
                                bqbVar6.f4147d.f4133a = bqcVarM2608b.m2907b();
                                bqcVarM2608b.f4159c.f4147d.f4134b = bqcVarM2608b.m2907b();
                                bqcVarM2608b.f4159c.f4147d.f4135c = bqcVarM2608b.m2907b();
                                bqcVarM2608b.f4159c.f4147d.f4136d = bqcVarM2608b.m2907b();
                                int iM2906a3 = bqcVarM2608b.m2906a();
                                int i7 = iM2906a3 & 128;
                                int iPow = (int) Math.pow(2.0d, (iM2906a3 & 7) + 1);
                                bqa bqaVar3 = bqcVarM2608b.f4159c.f4147d;
                                bqaVar3.f4137e = (iM2906a3 & 64) != 0;
                                if (i7 != 0) {
                                    bqaVar3.f4143k = bqcVarM2608b.m2911f(iPow);
                                } else {
                                    bqaVar3.f4143k = null;
                                }
                                bqcVarM2608b.f4159c.f4147d.f4142j = bqcVarM2608b.f4158b.position();
                                bqcVarM2608b.m2906a();
                                bqcVarM2608b.m2909d();
                                if (bqcVarM2608b.m2910e()) {
                                    continue;
                                } else {
                                    bqb bqbVar7 = bqcVarM2608b.f4159c;
                                    bqbVar7.f4146c++;
                                    bqbVar7.f4148e.add(bqbVar7.f4147d);
                                }
                                break;
                            case 59:
                                break;
                            default:
                                bqcVarM2608b.f4159c.f4145b = 1;
                                continue;
                        }
                        bqbVar2 = bqcVarM2608b.f4159c;
                        if (bqbVar2.f4146c < 0) {
                            bqbVar2.f4145b = 1;
                        }
                    }
                    bqbVar2 = bqcVarM2608b.f4159c;
                    if (bqbVar2.f4146c < 0) {
                        bqbVar2.f4145b = 1;
                    }
                }
                bqbVar = bqcVarM2608b.f4159c;
            }
            if (bqbVar.f4146c > 0 && bqbVar.f4145b == 0) {
                Bitmap.Config config = bqrVar.m2927b(byo.f4775a) == bqe.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iMin = Math.min(bqbVar.f4150g / i2, bqbVar.f4149f / i);
                if (iMin != 0) {
                    iHighestOneBit = Integer.highestOneBit(iMin);
                }
                bqd bqdVar = new bqd(this.f4742e, bqbVar, byteBuffer, Math.max(1, iHighestOneBit), null, null, null);
                if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
                    throw new IllegalArgumentException("Unsupported format: " + String.valueOf(config) + ", must be one of " + String.valueOf(Bitmap.Config.ARGB_8888) + JrxsYuVZZqnFC.SxY + String.valueOf(Bitmap.Config.RGB_565));
                }
                bqdVar.f4169i = config;
                bqdVar.mo2904b();
                Bitmap bitmapMo2903a = bqdVar.mo2903a();
                if (bitmapMo2903a != null) {
                    byjVar = new byj(new byh(new byg(new byn(box.m2826b(this.f4739a), bqdVar, i, i2, bwg.f4650b, bitmapMo2903a))));
                }
            }
            this.f4741d.m2609c(bqcVarM2608b);
            return byjVar;
        } catch (Throwable th) {
            this.f4741d.m2609c(bqcVarM2608b);
            throw th;
        }
    }

    @Override // p000.bqt
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo2931b(Object obj, bqr bqrVar) {
        return !((Boolean) bqrVar.m2927b(byo.f4776b)).booleanValue() && bzq.m3228A(this.f4740b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }
}
