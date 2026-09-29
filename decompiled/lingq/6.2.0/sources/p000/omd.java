package p000;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.lazy.layout.C0134c;
import androidx.compose.foundation.lazy.layout.C0135d;
import androidx.compose.foundation.lazy.layout.C0139h;
import androidx.compose.foundation.lazy.staggeredgrid.C0144d;
import androidx.compose.foundation.pager.AbstractC0150d;
import androidx.compose.material3.AbstractC0262s;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0422b;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.spatial.C0429a;
import androidx.compose.p002ui.window.AbstractC0454b;
import androidx.compose.runtime.internal.C0282a;
import com.google.android.gms.common.Feature;
import com.google.crypto.tink.shaded.protobuf.AbstractC1144s;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C1141p;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.components.DependencyCycleException;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.feature.onboarding.R$drawable;
import com.lingq.feature.onboarding.R$string;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public abstract class omd {

    /* JADX INFO: renamed from: a */
    public static final C0282a f54596a = new C0282a(-714894670, false, new C2914d4(14));

    /* JADX INFO: renamed from: b */
    public static final C0282a f54597b = new C0282a(144526889, false, new C2914d4(15));

    /* JADX INFO: renamed from: c */
    public static final nj0 f54598c = new nj0(16);

    /* JADX INFO: renamed from: d */
    public static final Feature f54599d;

    /* JADX INFO: renamed from: e */
    public static final Feature f54600e;

    /* JADX INFO: renamed from: f */
    public static final Feature[] f54601f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f54602g = 0;

    static {
        Feature feature = new Feature("CLIENT_TELEMETRY", 1L);
        f54599d = feature;
        Feature feature2 = new Feature("CLIENT_NOTIFICATION_TELEMETRY", 1L);
        f54600e = feature2;
        f54601f = new Feature[]{feature, feature2};
    }

    /* JADX INFO: renamed from: A */
    public static int m18113A(byte[] bArr, int i, C3846zu c3846zu) throws InvalidProtocolBufferException {
        int iM18116D = m18116D(bArr, i, c3846zu);
        int i2 = c3846zu.f72164a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.m6419e();
        }
        if (i2 == 0) {
            c3846zu.f72166c = "";
            return iM18116D;
        }
        c3846zu.f72166c = AbstractC1144s.f13628a.m6660a(bArr, iM18116D, i2);
        return iM18116D + i2;
    }

    /* JADX INFO: renamed from: B */
    public static int m18114B(int i, byte[] bArr, int i2, int i3, C1141p c1141p, C3846zu c3846zu) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.m6415a();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM18118F = m18118F(bArr, i2, c3846zu);
            c1141p.m6656d(i, Long.valueOf(c3846zu.f72165b));
            return iM18118F;
        }
        if (i4 == 1) {
            c1141p.m6656d(i, Long.valueOf(m18168x(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM18116D = m18116D(bArr, i2, c3846zu);
            int i5 = c3846zu.f72164a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.m6419e();
            }
            if (i5 > bArr.length - iM18116D) {
                throw InvalidProtocolBufferException.m6421g();
            }
            if (i5 == 0) {
                c1141p.m6656d(i, ByteString.f13555b);
            } else {
                c1141p.m6656d(i, ByteString.m6408g(bArr, iM18116D, i5));
            }
            return iM18116D + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw InvalidProtocolBufferException.m6415a();
            }
            c1141p.m6656d(i, Integer.valueOf(m18167w(bArr, i2)));
            return i2 + 4;
        }
        C1141p c1141pM6653c = C1141p.m6653c();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (i2 < i3) {
            int iM18116D2 = m18116D(bArr, i2, c3846zu);
            i7 = c3846zu.f72164a;
            if (i7 == i6) {
                i2 = iM18116D2;
                break;
            }
            i2 = m18114B(i7, bArr, iM18116D2, i3, c1141pM6653c, c3846zu);
        }
        if (i2 > i3 || i7 != i6) {
            throw InvalidProtocolBufferException.m6420f();
        }
        c1141p.m6656d(i, c1141pM6653c);
        return i2;
    }

    /* JADX INFO: renamed from: C */
    public static int m18115C(int i, byte[] bArr, int i2, C3846zu c3846zu) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c3846zu.f72164a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c3846zu.f72164a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c3846zu.f72164a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c3846zu.f72164a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c3846zu.f72164a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: D */
    public static int m18116D(byte[] bArr, int i, C3846zu c3846zu) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m18115C(b, bArr, i2, c3846zu);
        }
        c3846zu.f72164a = b;
        return i2;
    }

    /* JADX INFO: renamed from: E */
    public static int m18117E(int i, byte[] bArr, int i2, int i3, l94 l94Var, C3846zu c3846zu) {
        t74 t74Var = (t74) l94Var;
        int iM18116D = m18116D(bArr, i2, c3846zu);
        t74Var.addInt(c3846zu.f72164a);
        while (iM18116D < i3) {
            int iM18116D2 = m18116D(bArr, iM18116D, c3846zu);
            if (i != c3846zu.f72164a) {
                break;
            }
            iM18116D = m18116D(bArr, iM18116D2, c3846zu);
            t74Var.addInt(c3846zu.f72164a);
        }
        return iM18116D;
    }

    /* JADX INFO: renamed from: F */
    public static int m18118F(byte[] bArr, int i, C3846zu c3846zu) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c3846zu.f72165b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        c3846zu.f72165b = j2;
        return i3;
    }

    /* JADX INFO: renamed from: G */
    public static void m18119G(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (yx1 yx1Var : (Set) it2.next()) {
                        for (lb2 lb2Var : yx1Var.f70613a.f42155c) {
                            if (lb2Var.f49392c == 0) {
                                Set<yx1> set = (Set) map.get(new zx1(lb2Var.f49390a, lb2Var.f49391b == 2));
                                if (set != null) {
                                    for (yx1 yx1Var2 : set) {
                                        yx1Var.f70614b.add(yx1Var2);
                                        yx1Var2.f70615c.add(yx1Var);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<yx1> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (yx1 yx1Var3 : hashSet) {
                    if (yx1Var3.f70615c.isEmpty()) {
                        hashSet2.add(yx1Var3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    yx1 yx1Var4 = (yx1) hashSet2.iterator().next();
                    hashSet2.remove(yx1Var4);
                    i++;
                    for (yx1 yx1Var5 : yx1Var4.f70614b) {
                        yx1Var5.f70615c.remove(yx1Var4);
                        if (yx1Var5.f70615c.isEmpty()) {
                            hashSet2.add(yx1Var5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (yx1 yx1Var6 : hashSet) {
                    if (!yx1Var6.f70615c.isEmpty() && !yx1Var6.f70614b.isEmpty()) {
                        arrayList2.add(yx1Var6.f70613a);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
            hc1 hc1Var = (hc1) it.next();
            yx1 yx1Var7 = new yx1(hc1Var);
            for (rp7 rp7Var : hc1Var.f42154b) {
                boolean z = hc1Var.f42157e == 0;
                zx1 zx1Var = new zx1(rp7Var, !z);
                if (!map.containsKey(zx1Var)) {
                    map.put(zx1Var, new HashSet());
                }
                Set set2 = (Set) map.get(zx1Var);
                if (!set2.isEmpty() && z) {
                    ij6.m13965w("Multiple components provide ", rp7Var, ".");
                    return;
                }
                set2.add(yx1Var7);
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public static Integer m18120H(Context context, int i) {
        TypedValue typedValueM24748U = xwc.m24748U(context.getTheme(), i);
        if (typedValueM24748U != null) {
            return Integer.valueOf(m18142c0(context, typedValueM24748U));
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public static final float m18121J(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: L */
    public static final int m18122L(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: M */
    public static int m18123M(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (-2147483647 <= i4 && i4 < i2) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: N */
    public static boolean m18124N(int i) {
        return i != 0 && ya1.m25012e(i) > 0.5d;
    }

    /* JADX INFO: renamed from: O */
    public static final boolean m18125O(long j) {
        return (j & 2) != 0;
    }

    /* JADX INFO: renamed from: P */
    public static final boolean m18126P(long j) {
        return (j & 1) != 0;
    }

    /* JADX INFO: renamed from: Q */
    public static final boolean m18127Q(LibraryItem libraryItem, String str) {
        libraryItem.getClass();
        String str2 = libraryItem.f19412M;
        str.getClass();
        return (vk9.m23391n0(str) || str2 == null || vk9.m23391n0(str2) || cl9.m4834Q(str2, str, true)) ? false : true;
    }

    /* JADX INFO: renamed from: R */
    public static final boolean m18128R(mi8 mi8Var) {
        long j = mi8Var.f51364e;
        return (j >>> 32) == (4294967295L & j) && j == mi8Var.f51365f && j == mi8Var.f51366g && j == mi8Var.f51367h;
    }

    /* JADX INFO: renamed from: S */
    public static vx8 m18129S(zi3 zi3Var) {
        vx8 vx8Var = new vx8();
        vx8Var.f66063d = AbstractC3584sr.m21647z(zi3Var, vx8Var, vx8Var);
        return vx8Var;
    }

    /* JADX INFO: renamed from: T */
    public static int m18130T(int i, float f, int i2) {
        return ya1.m25014g(ya1.m25016i(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    /* JADX INFO: renamed from: U */
    public static final int m18131U(int[] iArr, long j) {
        int i = (int) (j & 4294967295L);
        int iMax = Integer.MIN_VALUE;
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            iMax = Math.max(iMax, iArr[i2]);
        }
        return iMax;
    }

    /* JADX WARN: Code duplicated, block: B:263:0x0520  */
    /* JADX WARN: Code duplicated, block: B:272:0x053c A[LOOP:22: B:271:0x053a->B:272:0x053c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:275:0x054a  */
    /* JADX WARN: Code duplicated, block: B:277:0x054d  */
    /* JADX WARN: Code duplicated, block: B:279:0x0558  */
    /* JADX WARN: Code duplicated, block: B:281:0x0570  */
    /* JADX WARN: Code duplicated, block: B:282:0x0572  */
    /* JADX WARN: Code duplicated, block: B:293:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:295:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:297:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:299:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:301:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:303:0x05db  */
    /* JADX WARN: Code duplicated, block: B:306:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:317:0x0630  */
    /* JADX WARN: Code duplicated, block: B:319:0x0633  */
    /* JADX WARN: Code duplicated, block: B:321:0x063d  */
    /* JADX WARN: Code duplicated, block: B:322:0x0640  */
    /* JADX WARN: Code duplicated, block: B:324:0x0643 A[LOOP:42: B:318:0x0631->B:324:0x0643, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:328:0x0653  */
    /* JADX WARN: Code duplicated, block: B:332:0x0671 A[LOOP:25: B:307:0x05fc->B:332:0x0671, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:333:0x0680  */
    /* JADX WARN: Code duplicated, block: B:335:0x068e  */
    /* JADX WARN: Code duplicated, block: B:338:0x0694 A[LOOP:26: B:337:0x0692->B:338:0x0694, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:342:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:346:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:348:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:349:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:351:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:358:0x0702  */
    /* JADX WARN: Code duplicated, block: B:360:0x0706  */
    /* JADX WARN: Code duplicated, block: B:362:0x070f  */
    /* JADX WARN: Code duplicated, block: B:365:0x071e A[LOOP:30: B:364:0x071c->B:365:0x071e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:367:0x0737 A[LOOP:28: B:341:0x06a2->B:367:0x0737, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:370:0x0765  */
    /* JADX WARN: Code duplicated, block: B:371:0x0769  */
    /* JADX WARN: Code duplicated, block: B:424:0x085b A[LOOP:32: B:393:0x07d3->B:424:0x085b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:427:0x0870  */
    /* JADX WARN: Code duplicated, block: B:431:0x0883  */
    /* JADX WARN: Code duplicated, block: B:433:0x0891  */
    /* JADX WARN: Code duplicated, block: B:435:0x0897 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:436:0x0899  */
    /* JADX WARN: Code duplicated, block: B:438:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:441:0x08b1 A[LOOP:35: B:437:0x08a0->B:441:0x08b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:443:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:446:0x08c3  */
    /* JADX WARN: Code duplicated, block: B:452:0x08d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:455:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:457:0x08dd A[LOOP:36: B:454:0x08d5->B:457:0x08dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:460:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:465:0x090f  */
    /* JADX WARN: Code duplicated, block: B:468:0x0924  */
    /* JADX WARN: Code duplicated, block: B:471:0x0948  */
    /* JADX WARN: Code duplicated, block: B:473:0x0958  */
    /* JADX WARN: Code duplicated, block: B:476:0x0963  */
    /* JADX WARN: Code duplicated, block: B:478:0x0966 A[LOOP:37: B:474:0x095f->B:478:0x0966, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:480:0x096c  */
    /* JADX WARN: Code duplicated, block: B:483:0x0997  */
    /* JADX WARN: Code duplicated, block: B:485:0x09a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:486:0x09a7  */
    /* JADX WARN: Code duplicated, block: B:487:0x09a9  */
    /* JADX WARN: Code duplicated, block: B:490:0x09c4  */
    /* JADX WARN: Code duplicated, block: B:491:0x09c7  */
    /* JADX WARN: Code duplicated, block: B:493:0x09cb  */
    /* JADX WARN: Code duplicated, block: B:495:0x09d2 A[LOOP:38: B:494:0x09d0->B:495:0x09d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:497:0x09e7  */
    /* JADX WARN: Code duplicated, block: B:500:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:503:0x09f5 A[LOOP:39: B:499:0x09ec->B:503:0x09f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:506:0x09fe  */
    /* JADX WARN: Code duplicated, block: B:508:0x0a04 A[LOOP:40: B:505:0x09fc->B:508:0x0a04, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:514:0x0a67  */
    /* JADX WARN: Code duplicated, block: B:612:0x0599 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x068c A[EDGE_INSN: B:613:0x068c->B:334:0x068c BREAK  A[LOOP:25: B:307:0x05fc->B:332:0x0671], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x06da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x074d A[EDGE_INSN: B:616:0x074d->B:368:0x074d BREAK  A[LOOP:27: B:340:0x06a1->B:617:0x06a1, LOOP_LABEL: LOOP:27: B:340:0x06a1->B:617:0x06a1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:0x06a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x06ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:0x0866 A[EDGE_INSN: B:630:0x0866->B:425:0x0866 BREAK  A[LOOP:32: B:393:0x07d3->B:424:0x085b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x08fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x08b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x0893 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x08ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:0x0969 A[EDGE_INSN: B:641:0x0969->B:479:0x0969 BREAK  A[LOOP:37: B:474:0x095f->B:478:0x0966], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:0x09fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x0a0e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x0a0e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x0a07 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x0646 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x062a A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: V */
    public static final dw4 m18132V(final zv4 zv4Var, int i, int[] iArr, int[] iArr2, boolean z) {
        EmptyList emptyList;
        C0825bv[] c0825bvArr;
        boolean z2;
        int iM20843k0;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr3;
        int i8;
        int i9;
        boolean z3;
        int[] iArr4;
        int i10;
        int i11;
        C0144d c0144d;
        float fFloatValue;
        float f;
        float f2;
        float f3;
        int[] iArrCopyOf;
        int length;
        int i12;
        int i13;
        int[] iArr5;
        float f4;
        int i14;
        long j;
        int iM10429g;
        int i15;
        int iM3800h;
        int i16;
        int i17;
        int i18;
        int iMin;
        int i19;
        int size;
        int i20;
        List list;
        uv4 uv4Var;
        int[] iArr6;
        List arrayList;
        int i21;
        int i22;
        ArrayList arrayList2;
        int i23;
        float f5;
        C3047gq c3047gq;
        int i24;
        int i25;
        fw4 fw4Var;
        int i26;
        int i27;
        int i28;
        int[] iArr7;
        int i29;
        ArrayList arrayList3;
        int size2;
        ArrayList arrayList4;
        int i30;
        ArrayList arrayList5;
        Object obj;
        int i31;
        final ArrayList arrayList6;
        C0135d c0135d;
        int i32;
        yv4 yv4Var;
        C0139h c0139h;
        boolean z4;
        int i33;
        boolean zMo211f0;
        boolean z5;
        int[] iArr8;
        int i34;
        int length2;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int length3;
        int i40;
        boolean z6;
        int i41;
        long jM1010b;
        int i42;
        int iM10429g2;
        int iM10428f;
        int i43;
        int size3;
        int i44;
        int i45;
        int i46;
        int i47;
        int iIntValue;
        int i48;
        int i49;
        C3047gq c3047gq2;
        int iM12806j;
        ArrayList arrayList7;
        int length4;
        int i50;
        ArrayList arrayList8;
        int size4;
        int i51;
        int i52;
        List list2;
        fw4 fw4Var2;
        int i53;
        int iMin2;
        List list3;
        Object obj2;
        int i54;
        int i55;
        int i56;
        fw4 fw4Var3;
        int i57;
        int iM18131U;
        int[] iArr9;
        int i58;
        int i59;
        int i60;
        int i61;
        int i62;
        int i63;
        fw4 fw4Var4;
        int i64;
        int i65;
        int i66;
        int i67;
        int iIntValue2;
        int iM12806j2;
        int i68;
        fw4 fw4Var5;
        int i69;
        int iM12235n;
        int i70;
        C0825bv c0825bv;
        int iMo4182d;
        int[] iArr10;
        int i71;
        int i72;
        float f6;
        int[] iArrM12805i;
        int i73;
        int i74;
        int i75;
        int[] iArrM12805i2;
        xs4 xs4Var = zv4Var.f72260d;
        List list4 = zv4Var.f72258b;
        int i76 = zv4Var.f72267k;
        List list5 = zv4Var.f72271o;
        int i77 = zv4Var.f72268l;
        boolean z7 = zv4Var.f72262f;
        C0144d c0144d2 = zv4Var.f72257a;
        int i78 = zv4Var.f72275s;
        int i79 = zv4Var.f72264h;
        yv4 yv4Var2 = zv4Var.f72273q;
        int i80 = zv4Var.f72266j;
        List list6 = list5;
        long j2 = zv4Var.f72261e;
        C3047gq c3047gq3 = zv4Var.f72274r;
        cu4 cu4Var = zv4Var.f72263g;
        xs4 xs4Var2 = xs4Var;
        qm9 qm9Var = cu4Var.f34541b;
        cu4 cu4Var2 = cu4Var;
        uv4 uv4Var2 = zv4Var.f72259c;
        int iMo15745a = uv4Var2.mo15745a();
        List list7 = list4;
        long j3 = j2;
        EmptyList emptyList2 = EmptyList.f47638a;
        char c = ' ';
        if (iMo15745a <= 0 || i78 == 0) {
            int iM3803k = bk1.m3803k(j3);
            int iM3802j = bk1.m3802j(j3);
            C0135d c0135d2 = c0144d2.f2617t;
            ArrayList arrayList9 = new ArrayList();
            yv4 yv4Var3 = zv4Var.f72273q;
            c0135d2.m1011d(0, iM3803k, iM3802j, arrayList9, yv4Var3.f70548c.f64402c, yv4Var3, zv4Var.f72262f, qm9Var.mo211f0(), zv4Var.f72275s, zv4Var.f72270n, 0, 0, zv4Var.f72269m, zv4Var.f72272p);
            if (!qm9Var.mo211f0()) {
                long jM1010b2 = c0144d2.f2617t.m1010b();
                if (!n84.m17279a(jM1010b2, 0L)) {
                    iM3803k = dk1.m10429g((int) (jM1010b2 >> 32), j3);
                    iM3802j = dk1.m10428f((int) (jM1010b2 & 4294967295L), j3);
                }
            }
            it5 it5VarMo9895M0 = cu4Var2.mo9895M0(iM3803k, iM3802j, AbstractC3194a.m15360M(), new C2951e4(29));
            boolean z8 = zv4Var.f72262f;
            long jM3803k = (((long) bk1.m3803k(j3)) << 32) | (((long) bk1.m3802j(j3)) & 4294967295L);
            int i81 = zv4Var.f72266j;
            int i82 = zv4Var.f72267k;
            return new dw4(iArr, iArr2, 0.0f, it5VarMo9895M0, 0.0f, false, z8, false, zv4Var.f72260d, uv4Var2.f64401b.f62946b, cu4Var2, iMo15745a, emptyList2, jM3803k, -i81, i82 + i79, i81, i82, zv4Var.f72268l, zv4Var.f72269m);
        }
        int[] iArrCopyOf2 = Arrays.copyOf(iArr, iArr.length);
        int[] iArrCopyOf3 = Arrays.copyOf(iArr2, iArr2.length);
        int length5 = iArrCopyOf2.length - 1;
        if (length5 >= 0) {
            while (true) {
                int i83 = length5 - 1;
                while (true) {
                    int i84 = iArrCopyOf2[length5];
                    if (i84 < iMo15745a && c3047gq3.m12800c(i84, length5)) {
                        break;
                    }
                    EmptyList emptyList3 = emptyList2;
                    C0144d c0144d3 = c0144d2;
                    iArrCopyOf2[length5] = c3047gq3.m12803g(iArrCopyOf2[length5], length5);
                    emptyList2 = emptyList3;
                    c0144d2 = c0144d3;
                }
                int i85 = iArrCopyOf2[length5];
                emptyList = emptyList2;
                if (i85 >= 0 && !uv4Var2.f64401b.f62946b.m4517s(i85)) {
                    if (c3047gq3.m12806j(i85) == -2) {
                        int length6 = iArrCopyOf2.length;
                        int i86 = 0;
                        while (true) {
                            if (i86 >= length6) {
                                i86 = -1;
                                break;
                            }
                            int i87 = length6;
                            if (iArrCopyOf2[i86] == i85) {
                                break;
                            }
                            i86++;
                            length6 = i87;
                        }
                        int i88 = i86 + 1;
                        int i89 = i86;
                        if (i88 <= length5) {
                            while (true) {
                                if (iArrCopyOf2[i88] == i85) {
                                    iArrCopyOf2[i88] = c3047gq3.m12803g(i85, i88);
                                }
                                if (i88 == length5) {
                                    break;
                                }
                                i88++;
                            }
                        }
                        length5 = i89;
                    }
                    c3047gq3.m12811p(i85, length5);
                }
                if (i83 < 0) {
                    break;
                }
                length5 = i83;
                emptyList2 = emptyList;
                c0144d2 = c0144d2;
            }
        } else {
            emptyList = emptyList2;
            c0144d2 = c0144d2;
        }
        m18136Z(iArrCopyOf3, -i);
        C0825bv[] c0825bvArr2 = new C0825bv[i78];
        for (int i90 = 0; i90 < i78; i90++) {
            c0825bvArr2[i90] = new C0825bv(16);
        }
        m18136Z(iArrCopyOf3, -i80);
        boolean z9 = false;
        loop5: while (true) {
            int length7 = iArrCopyOf2.length;
            int i91 = 0;
            while (true) {
                if (i91 >= length7) {
                    c0825bvArr = c0825bvArr2;
                    z2 = z9;
                    iM20843k0 = -1;
                    break loop5;
                }
                int i92 = iArrCopyOf2[i91];
                c0825bvArr = c0825bvArr2;
                z2 = z9;
                if (iArrCopyOf3[i91] >= Math.max(-i77, 0) || i92 <= 0) {
                    i91++;
                    z9 = z2;
                    i78 = i78;
                    i79 = i79;
                    c0825bvArr2 = c0825bvArr;
                }
            }
            iM20843k0 = m18122L(iArrCopyOf2);
            int i93 = iArrCopyOf2[iM20843k0];
            int length8 = iArrCopyOf3.length;
            int i94 = 0;
            while (i94 < length8) {
                int i95 = length8;
                if (iArrCopyOf2[i94] != iArrCopyOf2[iM20843k0]) {
                    int i96 = iArrCopyOf3[i94];
                    int i97 = iArrCopyOf3[iM20843k0];
                    if (i96 < i97) {
                        iArrCopyOf3[i94] = i97;
                    }
                }
                i94++;
                length8 = i95;
            }
            int iM12803g = c3047gq3.m12803g(i93, iM20843k0);
            if (iM12803g < 0) {
                break;
            }
            long jM25810a = zv4Var.m25810a(uv4Var2, iM12803g, iM20843k0);
            int i98 = i78;
            int i99 = (int) (jM25810a & 4294967295L);
            int i100 = i79;
            int i101 = (int) (jM25810a >> 32);
            int i102 = i99 - i101;
            c3047gq3.m12811p(iM12803g, i102 != 1 ? -2 : i101);
            fw4 fw4VarM25358E = yv4Var2.m25358E(iM12803g, jM25810a);
            int iM18131U2 = m18131U(iArrCopyOf3, jM25810a);
            int[] iArrM12805i3 = i102 != 1 ? c3047gq3.m12805i(iM12803g) : null;
            boolean z10 = z2;
            while (i101 < i99) {
                iArrCopyOf2[i101] = iM12803g;
                int iM12235n2 = fw4VarM25358E.m12235n() + iM18131U2 + (iArrM12805i3 == null ? 0 : iArrM12805i3[i101]);
                iArrCopyOf3[i101] = iM12235n2;
                if (i100 + iM12235n2 <= 0) {
                    z10 = true;
                }
                i101++;
            }
            i78 = i98;
            z9 = z10;
            i79 = i100;
            c0825bvArr2 = c0825bvArr;
        }
        int i103 = i78;
        int i104 = i79;
        int i105 = -i80;
        int i106 = iArrCopyOf3[0];
        if (i106 < i105) {
            int i107 = i105 - i106;
            m18136Z(iArrCopyOf3, i107);
            i2 = i - i107;
        } else {
            i2 = i;
        }
        m18136Z(iArrCopyOf3, i80);
        int i108 = -1;
        if (iM20843k0 == -1) {
            iM20843k0 = AbstractC3550rv.m20843k0(iArrCopyOf2, 0);
        }
        if (iM20843k0 != -1 && m18133W(iArrCopyOf2, zv4Var, iArrCopyOf3, iM20843k0) && z) {
            c3047gq3.m12810n();
            int length9 = iArrCopyOf2.length;
            int[] iArr11 = new int[length9];
            int i109 = 0;
            while (i109 < length9) {
                iArr11[i109] = i108;
                i109++;
                i108 = -1;
            }
            int length10 = iArrCopyOf3.length;
            int[] iArr12 = new int[length10];
            for (int i110 = 0; i110 < length10; i110++) {
                iArr12[i110] = iArrCopyOf3[iM20843k0];
            }
            return m18132V(zv4Var, i2, iArr11, iArr12, false);
        }
        int[] iArrCopyOf4 = Arrays.copyOf(iArrCopyOf2, iArrCopyOf2.length);
        int length11 = iArrCopyOf3.length;
        int[] iArr13 = new int[length11];
        for (int i111 = 0; i111 < length11; i111++) {
            iArr13[i111] = -iArrCopyOf3[i111];
        }
        int i112 = i77 + i105;
        int i113 = i76 + i104;
        if (i113 < 0) {
            i113 = 0;
        }
        int i114 = i2;
        int iM18123M = m18123M(iArrCopyOf4);
        boolean z11 = z2;
        int i115 = i105;
        int i116 = 0;
        while (true) {
            iArrCopyOf2 = iArrCopyOf2;
            if (iM18123M == -1) {
                i3 = i103;
                break;
            }
            i3 = i103;
            if (i116 >= i3) {
                break;
            }
            int i117 = i116;
            int i118 = iArrCopyOf4[iM18123M];
            i80 = i80;
            int length12 = iArrCopyOf4.length;
            iArrCopyOf3 = iArrCopyOf3;
            i77 = i77;
            int i119 = Integer.MAX_VALUE;
            int i120 = 0;
            iM18123M = -1;
            while (i120 < length12) {
                int i121 = i120;
                int i122 = i118 + 1;
                int i123 = length12;
                int i124 = iArrCopyOf4[i121];
                if (i122 <= i124 && i124 < i119) {
                    i119 = i124;
                    iM18123M = i121;
                }
                i120 = i121 + 1;
                length12 = i123;
            }
            int i125 = i117 + 1;
            if (i118 >= 0) {
                int i126 = iMo15745a;
                long jM25810a2 = zv4Var.m25810a(uv4Var2, i118, iM18123M);
                fw4 fw4VarM25358E2 = yv4Var2.m25358E(i118, jM25810a2);
                yv4 yv4Var4 = yv4Var2;
                int i127 = (int) (jM25810a2 & 4294967295L);
                uv4 uv4Var3 = uv4Var2;
                int i128 = (int) (jM25810a2 >> 32);
                int i129 = i127 - i128;
                c3047gq3.m12811p(i118, i129 != 1 ? -2 : i128);
                int iM18131U3 = m18131U(iArr13, jM25810a2);
                for (int i130 = i128; i130 < i127; i130++) {
                    iArr13[i130] = fw4VarM25358E2.m12235n() + iM18131U3;
                    iArrCopyOf4[i130] = i118;
                    c0825bvArr[i130].addLast(fw4VarM25358E2);
                }
                if (iM18131U3 < i112 && iArr13[i128] <= i112) {
                    fw4VarM25358E2.f39796l = false;
                    z11 = true;
                }
                if (i129 != 1) {
                    i103 = i3;
                    i116 = i103;
                } else {
                    i116 = i125;
                    i103 = i3;
                }
                yv4Var2 = yv4Var4;
                uv4Var2 = uv4Var3;
                iMo15745a = i126;
            } else {
                i116 = i125;
                i103 = i3;
            }
        }
        int[] iArr14 = iArrCopyOf3;
        int i131 = iMo15745a;
        int i132 = i77;
        yv4 yv4Var5 = yv4Var2;
        int i133 = i80;
        uv4 uv4Var4 = uv4Var2;
        loop15: while (true) {
            int i134 = 0;
            while (true) {
                if (i134 >= length11) {
                    for (int i135 = 0; i135 < i3; i135++) {
                        if (!c0825bvArr[i135].isEmpty()) {
                            i4 = i131;
                            i5 = 1;
                            break loop15;
                        }
                    }
                    break;
                }
                int i136 = iArr13[i134];
                if (i136 < i113 || i136 <= 0) {
                    break;
                }
                i134++;
            }
            int iM18123M2 = m18123M(iArr13);
            i5 = 1;
            int iM20846n0 = AbstractC3550rv.m20846n0(iArrCopyOf4) + 1;
            i4 = i131;
            if (iM20846n0 >= i4) {
                break;
            }
            int[] iArr15 = iArrCopyOf2;
            int i137 = length11;
            C0144d c0144d4 = c0144d2;
            i131 = i4;
            List list8 = list7;
            yv4 yv4Var6 = yv4Var5;
            uv4 uv4Var5 = uv4Var4;
            int[] iArr16 = iArr13;
            C3047gq c3047gq4 = c3047gq3;
            long j4 = j3;
            int i138 = i114;
            int i139 = i115;
            int[] iArr17 = iArrCopyOf4;
            cu4 cu4Var3 = cu4Var2;
            xs4 xs4Var3 = xs4Var2;
            char c2 = c;
            int i140 = i113;
            long jM25810a3 = zv4Var.m25810a(uv4Var5, iM20846n0, iM18123M2);
            int i141 = (int) (jM25810a3 & 4294967295L);
            int i142 = (int) (jM25810a3 >> c2);
            int i143 = i141 - i142;
            c3047gq4.m12811p(iM20846n0, i143 != 1 ? -2 : i142);
            fw4 fw4VarM25358E3 = yv4Var6.m25358E(iM20846n0, jM25810a3);
            int iM18131U4 = m18131U(iArr16, jM25810a3);
            if (i143 != 1) {
                iArrM12805i2 = c3047gq4.m12805i(iM20846n0);
                if (iArrM12805i2 == null) {
                    iArrM12805i2 = new int[i3];
                }
            } else {
                iArrM12805i2 = null;
            }
            int i144 = i142;
            while (i144 < i141) {
                if (iArrM12805i2 != null) {
                    iArrM12805i2[i144] = iM18131U4 - iArr16[i144];
                }
                iArr17[i144] = iM20846n0;
                iArr16[i144] = fw4VarM25358E3.m12235n() + iM18131U4;
                c0825bvArr[i144].addLast(fw4VarM25358E3);
                i144++;
                i3 = i3;
            }
            int i145 = i3;
            C0825bv c0825bv2 = (C0825bv) c3047gq4.f41173d;
            int iM12797o = C3047gq.m12797o(iM20846n0, c0825bv2);
            if (iM12797o < 0) {
                if (iArrM12805i2 != null) {
                    c0825bv2.add(-(iM12797o + 1), new xv4(iArrM12805i2, iM20846n0));
                }
            } else if (iArrM12805i2 == null) {
                c0825bv2.mo4183f(iM12797o);
            } else {
                ((xv4) c0825bv2.get(iM12797o)).f68844b = iArrM12805i2;
            }
            if (iM18131U4 < i112 && iArr16[i142] <= i112) {
                fw4VarM25358E3.f39796l = false;
            }
            c0144d2 = c0144d4;
            length11 = i137;
            iArrCopyOf2 = iArr15;
            i3 = i145;
            uv4Var4 = uv4Var5;
            i115 = i139;
            i113 = i140;
            list7 = list8;
            yv4Var5 = yv4Var6;
            c = c2;
            xs4Var2 = xs4Var3;
            cu4Var2 = cu4Var3;
            iArrCopyOf4 = iArr17;
            i114 = i138;
            j3 = j4;
            c3047gq3 = c3047gq4;
            iArr13 = iArr16;
        }
        int i146 = 0;
        while (i146 < i3) {
            C0825bv c0825bv3 = c0825bvArr[i146];
            while (c0825bv3.mo4182d() > i5 && !((fw4) c0825bv3.first()).f39796l) {
                fw4 fw4Var6 = (fw4) c0825bv3.removeFirst();
                int[] iArrM12805i4 = fw4Var6.f39790f != i5 ? c3047gq3.m12805i(fw4Var6.f39785a) : null;
                iArr14[i146] = iArr14[i146] - (fw4Var6.m12235n() + (iArrM12805i4 == null ? 0 : iArrM12805i4[i146]));
                i5 = 1;
            }
            fw4 fw4Var7 = (fw4) c0825bv3.m4186i();
            iArrCopyOf2[i146] = fw4Var7 != null ? fw4Var7.f39785a : -1;
            i146++;
            i5 = 1;
        }
        int length13 = iArrCopyOf4.length;
        int i147 = 0;
        while (true) {
            if (i147 >= length13) {
                i6 = i132;
                break;
            }
            if (iArrCopyOf4[i147] == i4 - 1) {
                i6 = i132;
                m18136Z(iArr13, -i6);
                break;
            }
            i147++;
        }
        int i148 = 0;
        while (true) {
            if (i148 >= length11) {
                i7 = i104;
                int i149 = i7 - iArr13[m18122L(iArr13)];
                iArr3 = iArr14;
                m18136Z(iArr3, -i149);
                m18136Z(iArr13, i149);
                boolean z12 = false;
                loop43: while (true) {
                    int length14 = iArr3.length;
                    int i150 = 0;
                    while (true) {
                        if (i150 >= length14) {
                            i8 = i149;
                            i9 = i133;
                            z3 = z12;
                            iArr4 = iArrCopyOf2;
                            break loop43;
                        }
                        int i151 = length14;
                        i11 = i133;
                        if (iArr3[i150] < i11) {
                            break;
                        }
                        i150++;
                        i114 = i114;
                        length14 = i151;
                        iArrCopyOf2 = iArrCopyOf2;
                        z12 = z12;
                        i133 = i11;
                        yv4Var5 = yv4Var5;
                        i6 = i6;
                    }
                    int iM18123M3 = m18123M(iArr3);
                    int iM18122L = m18122L(iArrCopyOf2);
                    i8 = i149;
                    if (iM18123M3 != iM18122L) {
                        z3 = z12;
                        if (iArr3[iM18123M3] == iArr3[iM18122L]) {
                            iM18123M3 = iM18122L;
                        } else {
                            z3 = true;
                        }
                    } else {
                        z3 = z12;
                    }
                    int i152 = iArrCopyOf2[iM18123M3];
                    if (i152 == -1) {
                        i152 = i4;
                    }
                    int iM12803g2 = c3047gq3.m12803g(i152, iM18123M3);
                    if (iM12803g2 < 0) {
                        iArr4 = iArrCopyOf2;
                        if ((!z3 && !m18133W(iArr4, zv4Var, iArr3, iM18123M3)) || !z) {
                            i9 = i11;
                            break;
                        }
                        c3047gq3.m12810n();
                        int length15 = iArr4.length;
                        int[] iArr18 = new int[length15];
                        for (int i153 = 0; i153 < length15; i153++) {
                            iArr18[i153] = -1;
                        }
                        int length16 = iArr3.length;
                        int[] iArr19 = new int[length16];
                        for (int i154 = 0; i154 < length16; i154++) {
                            iArr19[i154] = iArr3[iM18123M3];
                        }
                        return m18132V(zv4Var, i114, iArr18, iArr19, false);
                    }
                    int i155 = i114;
                    int i156 = i7;
                    int i157 = i4;
                    int[] iArr20 = iArrCopyOf2;
                    int i158 = length11;
                    long jM25810a4 = zv4Var.m25810a(uv4Var4, iM12803g2, iM18123M3);
                    int i159 = i6;
                    int i160 = (int) (jM25810a4 & 4294967295L);
                    int i161 = i113;
                    int i162 = (int) (jM25810a4 >> c);
                    int i163 = i160 - i162;
                    c3047gq3.m12811p(iM12803g2, i163 != 1 ? -2 : i162);
                    yv4 yv4Var7 = yv4Var5;
                    fw4 fw4VarM25358E4 = yv4Var7.m25358E(iM12803g2, jM25810a4);
                    int iM18131U5 = m18131U(iArr3, jM25810a4);
                    int[] iArrM12805i5 = i163 != 1 ? c3047gq3.m12805i(iM12803g2) : null;
                    while (i162 < i160) {
                        if (iArr3[i162] != iM18131U5) {
                            z3 = true;
                        }
                        c0825bvArr[i162].addFirst(fw4VarM25358E4);
                        iArr20[i162] = iM12803g2;
                        iArr3[i162] = fw4VarM25358E4.m12235n() + iM18131U5 + (iArrM12805i5 == null ? 0 : iArrM12805i5[i162]);
                        i162++;
                    }
                    i113 = i161;
                    i149 = i8;
                    i114 = i155;
                    length11 = i158;
                    i7 = i156;
                    i6 = i159;
                    i4 = i157;
                    iArrCopyOf2 = iArr20;
                    z12 = z3;
                    i133 = i11;
                    yv4Var5 = yv4Var7;
                }
                if (!z3 || !z) {
                    i10 = i114 + i8;
                    int i164 = iArr3[m18123M(iArr3)];
                    if (i164 >= 0) {
                        break;
                    }
                    i10 += i164;
                    m18136Z(iArr13, i164);
                    m18136Z(iArr3, -i164);
                    break;
                }
                c3047gq3.m12810n();
                return m18132V(zv4Var, i114, iArr4, iArr3, false);
            }
            int i165 = i104;
            if (iArr13[i148] >= i165) {
                i10 = i114;
                i114 = i10;
                i6 = i6;
                i4 = i4;
                i113 = i113;
                iArr4 = iArrCopyOf2;
                iArr3 = iArr14;
                yv4Var5 = yv4Var5;
                length11 = length11;
                i7 = i165;
                i9 = i133;
                break;
            }
            i148++;
            i104 = i165;
        }
        if (!qm9Var.mo211f0()) {
            c0144d = c0144d2;
            if (c0144d.f2598a) {
                fFloatValue = ((Number) ((xc9) c0144d.f2620w.f2565b.f8704b).getValue()).floatValue();
            }
            if (Integer.signum(Math.round(fFloatValue)) == Integer.signum(i10) || Math.abs(Math.round(fFloatValue)) < Math.abs(i10)) {
                f = fFloatValue;
            } else {
                f = i10;
            }
            f2 = fFloatValue - f;
            f3 = 0.0f;
            if (qm9Var.mo211f0() && i10 > i114 && f2 <= 0.0f) {
                f3 = (i10 - i114) + f2;
            }
            iArrCopyOf = Arrays.copyOf(iArr3, iArr3.length);
            length = iArrCopyOf.length;
            for (i12 = 0; i12 < length; i12++) {
                iArrCopyOf[i12] = -iArrCopyOf[i12];
            }
            i13 = i9;
            if (i13 > i6) {
                i70 = 0;
                while (i70 < i3) {
                    c0825bv = c0825bvArr[i70];
                    iMo4182d = c0825bv.mo4182d();
                    iArr10 = iArr4;
                    i71 = 0;
                    while (true) {
                        if (i71 < iMo4182d) {
                            i72 = i70;
                            f6 = f3;
                            break;
                        }
                        i72 = i70;
                        fw4 fw4Var8 = (fw4) c0825bv.get(i71);
                        f6 = f3;
                        iArrM12805i = c3047gq3.m12805i(fw4Var8.f39785a);
                        int iM12235n3 = fw4Var8.m12235n();
                        if (iArrM12805i == null) {
                            i73 = 0;
                        } else {
                            i73 = iArrM12805i[i72];
                        }
                        i74 = iM12235n3 + i73;
                        if (i71 == c0825bv.size() - 1 || (i75 = iArr3[i72]) == 0 || i75 < i74) {
                            break;
                        }
                        iArr3[i72] = i75 - i74;
                        i71++;
                        iArr10[i72] = ((fw4) c0825bv.get(i71)).f39785a;
                        f3 = f6;
                        i70 = i72;
                    }
                    i70 = i72 + 1;
                    f3 = f6;
                    iArr4 = iArr10;
                }
            }
            iArr5 = iArr4;
            f4 = f3;
            i14 = i76 + i13;
            if (z7) {
                iM10429g = bk1.m3801i(j3);
                j = j3;
            } else {
                j = j3;
                iM10429g = dk1.m10429g(AbstractC3550rv.m20846n0(iArr13) + i14, j);
            }
            i15 = iM10429g;
            if (z7) {
                iM3800h = dk1.m10428f(AbstractC3550rv.m20846n0(iArr13) + i14, j);
            } else {
                iM3800h = bk1.m3800h(j);
            }
            i16 = iM3800h;
            if (z7) {
                i17 = i16;
            } else {
                i17 = i15;
            }
            i18 = i7;
            iMin = i76 + (Math.min(i17, i18) - i13);
            i19 = iArrCopyOf[0];
            size = list7.size() - 1;
            if (size >= 0) {
                i65 = size;
                arrayList = null;
                while (true) {
                    i66 = i65 - 1;
                    i67 = i19;
                    list = list7;
                    iIntValue2 = ((Number) list.get(i65)).intValue();
                    iArr6 = iArr13;
                    iM12806j2 = c3047gq3.m12806j(iIntValue2);
                    i20 = i18;
                    if (iM12806j2 != -2 || iM12806j2 == -1) {
                        i68 = 0;
                        while (true) {
                            if (i68 >= i3) {
                                uv4Var = uv4Var4;
                                long jM25810a5 = zv4Var.m25810a(uv4Var, iIntValue2, 0);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                List list9 = arrayList;
                                fw4 fw4VarM25358E5 = yv4Var5.m25358E(iIntValue2, jM25810a5);
                                iM12235n = i67 - fw4VarM25358E5.m12235n();
                                fw4VarM25358E5.m12236o(iM12235n, 0, iMin);
                                list9.add(fw4VarM25358E5);
                                arrayList = list9;
                            } else {
                                fw4Var5 = (fw4) c0825bvArr[i68].m4186i();
                                if (fw4Var5 != null) {
                                    i69 = fw4Var5.f39785a;
                                } else {
                                    i69 = -1;
                                }
                                if (i69 > iIntValue2) {
                                    i68++;
                                } else {
                                    iM12235n = i67;
                                    uv4Var = uv4Var4;
                                }
                            }
                        }
                    } else {
                        fw4 fw4Var9 = (fw4) c0825bvArr[iM12806j2].m4186i();
                        if ((fw4Var9 != null ? fw4Var9.f39785a : -1) > iIntValue2) {
                            uv4Var = uv4Var4;
                            long jM25810a6 = zv4Var.m25810a(uv4Var, iIntValue2, 0);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            List list10 = arrayList;
                            fw4 fw4VarM25358E6 = yv4Var5.m25358E(iIntValue2, jM25810a6);
                            iM12235n = i67 - fw4VarM25358E6.m12235n();
                            fw4VarM25358E6.m12236o(iM12235n, 0, iMin);
                            list10.add(fw4VarM25358E6);
                            arrayList = list10;
                        } else {
                            iM12235n = i67;
                            uv4Var = uv4Var4;
                        }
                    }
                    if (i66 < 0) {
                        break;
                    }
                    uv4Var4 = uv4Var;
                    iArr13 = iArr6;
                    i65 = i66;
                    i18 = i20;
                    list7 = list;
                    i19 = iM12235n;
                    j = j;
                }
            } else {
                i20 = i18;
                j = j;
                list = list7;
                uv4Var = uv4Var4;
                iArr6 = iArr13;
                arrayList = null;
            }
            if (arrayList == null) {
                arrayList = emptyList;
            }
            i22 = 0;
            for (i21 = 0; i21 < i3; i21++) {
                i22 += c0825bvArr[i21].f9041c;
            }
            arrayList2 = new ArrayList(i22);
            loop27: while (true) {
                i23 = 0;
                while (true) {
                    if (i23 < i3) {
                        break loop27;
                    }
                    if (!c0825bvArr[i23].isEmpty()) {
                        break;
                    }
                    i23++;
                    c3047gq3 = c3047gq3;
                    f = f;
                    xs4Var2 = xs4Var2;
                }
                i54 = Integer.MAX_VALUE;
                i55 = -1;
                i56 = 0;
                while (i56 < i3) {
                    i63 = i56;
                    fw4Var4 = (fw4) c0825bvArr[i56].m4186i();
                    if (fw4Var4 != null) {
                        i64 = fw4Var4.f39785a;
                    } else {
                        i64 = Integer.MAX_VALUE;
                    }
                    if (i54 > i64) {
                        i54 = i64;
                        i55 = i63;
                    }
                    i56 = i63 + 1;
                }
                fw4Var3 = (fw4) c0825bvArr[i55].removeFirst();
                i57 = fw4Var3.f39789e;
                if (i57 != i55) {
                    int i166 = i55;
                    float f7 = f;
                    C3047gq c3047gq5 = c3047gq3;
                    long j5 = (((long) i57) << c) | (((long) (fw4Var3.f39790f + i57)) & 4294967295L);
                    iM18131U = m18131U(iArrCopyOf, j5);
                    xs4 xs4Var4 = xs4Var2;
                    iArr9 = iArrCopyOf;
                    i58 = xs4Var4.f68644a[i166];
                    i59 = i115;
                    if (fw4Var3.f39797m + iM18131U >= i59) {
                        i60 = i113;
                        if (iM18131U <= i60) {
                            fw4Var3.m12236o(iM18131U, i58, iMin);
                            arrayList2.add(fw4Var3);
                        }
                    } else {
                        i60 = i113;
                    }
                    i61 = (int) (j5 & 4294967295L);
                    for (i62 = (int) (j5 >> c); i62 < i61; i62++) {
                        iArr9[i62] = fw4Var3.m12235n() + iM18131U;
                    }
                    i113 = i60;
                    i115 = i59;
                    iArrCopyOf = iArr9;
                    c3047gq3 = c3047gq5;
                    f = f7;
                    xs4Var2 = xs4Var4;
                }
            }
            f5 = f;
            c3047gq = c3047gq3;
            xs4 xs4Var5 = xs4Var2;
            i24 = i113;
            int i167 = i115;
            i25 = iArrCopyOf[0];
            fw4Var = (fw4) u91.m22598P0(arrayList2);
            if (fw4Var != null) {
                i26 = fw4Var.f39785a;
            } else {
                i26 = -1;
            }
            if (!qm9Var.mo211f0() && list6 != null && !list6.isEmpty()) {
                int size5 = list6.size() - 1;
                while (true) {
                    if (-1 >= size5) {
                        i27 = i25;
                        list2 = list6;
                        fw4Var2 = null;
                        break;
                    }
                    list2 = list6;
                    i27 = i25;
                    if (((fw4) list2.get(size5)).f39785a > i26 && (size5 == 0 || ((fw4) list2.get(size5 - 1)).f39785a <= i26)) {
                        fw4Var2 = (fw4) list2.get(size5);
                        break;
                    }
                    size5--;
                    i25 = i27;
                    list6 = list2;
                }
                fw4 fw4Var10 = (fw4) u91.m22597O0(list2);
                if (fw4Var2 != null && (i53 = fw4Var2.f39785a) <= (iMin2 = Math.min(fw4Var10.f39785a, i4 - 1))) {
                    int iM12235n4 = i27;
                    arrayList3 = null;
                    while (true) {
                        i28 = i167;
                        if (arrayList3 != null) {
                            int size6 = arrayList3.size();
                            iArr7 = iArr3;
                            int i168 = 0;
                            while (true) {
                                if (i168 < size6) {
                                    ArrayList arrayList10 = arrayList3;
                                    if (((fw4) arrayList3.get(i168)).f39785a == i53) {
                                        arrayList3 = arrayList10;
                                        list3 = list2;
                                    } else {
                                        i168++;
                                        arrayList3 = arrayList10;
                                    }
                                }
                                if (i53 != iMin2) {
                                    break;
                                }
                                i53++;
                                arrayList2 = arrayList2;
                                iArr3 = iArr7;
                                list2 = list3;
                                i167 = i28;
                            }
                        } else {
                            iArr7 = iArr3;
                        }
                        ArrayList arrayList11 = arrayList3;
                        ArrayList arrayList12 = arrayList11 == null ? new ArrayList() : arrayList11;
                        int size7 = list2.size();
                        int i169 = 0;
                        while (true) {
                            if (i169 >= size7) {
                                list3 = list2;
                                obj2 = null;
                                break;
                            }
                            obj2 = list2.get(i169);
                            list3 = list2;
                            if (((fw4) obj2).f39785a == i53) {
                                break;
                            }
                            i169++;
                            list2 = list3;
                        }
                        fw4 fw4Var11 = (fw4) obj2;
                        int i170 = fw4Var11 != null ? fw4Var11.f39789e : 0;
                        fw4 fw4VarM25358E7 = yv4Var5.m25358E(i53, zv4Var.m25810a(uv4Var, i53, i170));
                        arrayList12.add(fw4VarM25358E7);
                        int[] iArr21 = xs4Var5.f68644a;
                        ArrayList arrayList13 = arrayList12;
                        fw4VarM25358E7.m12236o(iM12235n4, iArr21.length > i170 ? iArr21[i170] : 0, iMin);
                        iM12235n4 = fw4VarM25358E7.m12235n() + iM12235n4;
                        arrayList3 = arrayList13;
                        if (i53 != iMin2) {
                            break;
                            break;
                        }
                        i53++;
                        arrayList2 = arrayList2;
                        iArr3 = iArr7;
                        list2 = list3;
                        i167 = i28;
                    }
                    i29 = iM12235n4;
                }
                size2 = list.size();
                arrayList4 = null;
                i30 = 0;
                while (i30 < size2) {
                    iIntValue = ((Number) list.get(i30)).intValue();
                    i48 = i4;
                    if (iIntValue >= i48) {
                        i49 = size2;
                    } else {
                        if (arrayList3 != null) {
                            size4 = arrayList3.size();
                            i49 = size2;
                            i51 = 0;
                            while (true) {
                                if (i51 < size4) {
                                    i52 = i51;
                                    if (((fw4) arrayList3.get(i51)).f39785a != iIntValue) {
                                        i51 = i52 + 1;
                                    }
                                }
                            }
                        } else {
                            i49 = size2;
                        }
                        c3047gq2 = c3047gq;
                        iM12806j = c3047gq2.m12806j(iIntValue);
                        arrayList7 = arrayList2;
                        if (iM12806j != -2 || iM12806j == -1) {
                            length4 = iArrCopyOf4.length;
                            i50 = 0;
                            while (true) {
                                if (i50 < length4) {
                                    c3047gq = c3047gq2;
                                    if (iArrCopyOf4[i50] < iIntValue) {
                                        i50++;
                                        c3047gq2 = c3047gq;
                                    }
                                } else {
                                    c3047gq = c3047gq2;
                                    arrayList8 = arrayList4;
                                    long jM25810a7 = zv4Var.m25810a(uv4Var, iIntValue, 0);
                                    if (arrayList8 == null) {
                                        arrayList8 = new ArrayList();
                                    }
                                    fw4 fw4VarM25358E8 = yv4Var5.m25358E(iIntValue, jM25810a7);
                                    fw4VarM25358E8.m12236o(i29, 0, iMin);
                                    int iM12235n5 = fw4VarM25358E8.m12235n() + i29;
                                    arrayList8.add(fw4VarM25358E8);
                                    i29 = iM12235n5;
                                    arrayList4 = arrayList8;
                                }
                            }
                        } else if (iArrCopyOf4[iM12806j] < iIntValue) {
                            c3047gq = c3047gq2;
                            arrayList8 = arrayList4;
                            long jM25810a8 = zv4Var.m25810a(uv4Var, iIntValue, 0);
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            fw4 fw4VarM25358E9 = yv4Var5.m25358E(iIntValue, jM25810a8);
                            fw4VarM25358E9.m12236o(i29, 0, iMin);
                            int iM12235n6 = fw4VarM25358E9.m12235n() + i29;
                            arrayList8.add(fw4VarM25358E9);
                            i29 = iM12235n6;
                            arrayList4 = arrayList8;
                        } else {
                            c3047gq = c3047gq2;
                        }
                        i30++;
                        size2 = i49;
                        i4 = i48;
                        arrayList2 = arrayList7;
                    }
                    arrayList7 = arrayList2;
                    i30++;
                    size2 = i49;
                    i4 = i48;
                    arrayList2 = arrayList7;
                }
                arrayList5 = arrayList2;
                obj = arrayList4;
                i31 = i4;
                if (obj == null) {
                    obj = emptyList;
                }
                arrayList6 = new ArrayList();
                arrayList6.addAll(arrayList);
                arrayList6.addAll(arrayList5);
                if (arrayList3 != null) {
                    arrayList6.addAll(arrayList3);
                }
                arrayList6.addAll((Collection) obj);
                c0135d = c0144d.f2617t;
                i32 = (int) f5;
                yv4Var = zv4Var.f72273q;
                c0139h = yv4Var.f70548c.f64402c;
                z4 = zv4Var.f72262f;
                i33 = zv4Var.f72275s;
                zMo211f0 = qm9Var.mo211f0();
                z5 = zv4Var.f72270n;
                iArr8 = iArr7;
                if (iArr8.length == 0) {
                    uk9.m22784s();
                    return null;
                }
                i34 = iArr8[0];
                length2 = iArr8.length - 1;
                if (1 <= length2) {
                    i45 = 1;
                    i46 = i34;
                    while (true) {
                        i47 = iArr8[i45];
                        if (i46 > i47) {
                            i46 = i47;
                        }
                        if (i45 == length2) {
                            break;
                        }
                        i45++;
                    }
                    i35 = i46;
                } else {
                    i35 = i34;
                }
                c0135d.m1011d(i32, i15, i16, arrayList6, c0139h, yv4Var, z4, zMo211f0, i33, z5, i35, AbstractC3550rv.m20846n0(iArr6) + i14, zv4Var.f72269m, zv4Var.f72272p);
                if (qm9Var.mo211f0()) {
                    i36 = i15;
                    i37 = i16;
                } else {
                    jM1010b = c0144d.f2617t.m1010b();
                    if (n84.m17279a(jM1010b, 0L)) {
                        i36 = i15;
                        i37 = i16;
                    } else {
                        if (z7) {
                            i42 = i16;
                        } else {
                            i42 = i15;
                        }
                        long j6 = j;
                        iM10429g2 = dk1.m10429g(Math.max(i15, (int) (jM1010b >> c)), j6);
                        iM10428f = dk1.m10428f(Math.max(i16, (int) (jM1010b & 4294967295L)), j6);
                        if (z7) {
                            i43 = iM10428f;
                        } else {
                            i43 = iM10429g2;
                        }
                        if (i43 != i42) {
                            size3 = arrayList6.size();
                            for (i44 = 0; i44 < size3; i44++) {
                                fw4 fw4Var12 = (fw4) arrayList6.get(i44);
                                fw4Var12.f39802r = i43;
                                fw4Var12.f39804t = fw4Var12.f39792h + i43;
                            }
                        }
                        i36 = iM10429g2;
                        i37 = iM10428f;
                    }
                }
                i38 = length11;
                i39 = 0;
                while (true) {
                    if (i39 >= i38) {
                        length3 = iArrCopyOf4.length;
                        i40 = 0;
                        while (true) {
                            if (i40 < length3) {
                                if (iArrCopyOf4[i40] >= i31 - 1) {
                                    z6 = false;
                                    break;
                                }
                                i40++;
                            }
                        }
                    } else {
                        i41 = i20;
                        if (iArr6[i39] <= i41) {
                            i39++;
                            i20 = i41;
                        }
                    }
                    z6 = true;
                    break;
                }
                final long j7 = zv4Var.f72265i;
                final boolean z13 = false;
                final cu4 cu4Var4 = cu4Var2;
                return new dw4(iArr5, iArr8, f5, cu4Var4.mo9895M0(i36, i37, AbstractC3194a.m15360M(), new vi3() { // from class: aw4
                    @Override // p000.vi3
                    public final Object invoke(Object obj3) {
                        AbstractC0343j abstractC0343j = (AbstractC0343j) obj3;
                        final ArrayList arrayList14 = arrayList6;
                        final boolean z14 = z13;
                        final long j8 = j7;
                        final cu4 cu4Var5 = cu4Var4;
                        vi3 vi3Var = new vi3() { // from class: bw4
                            @Override // p000.vi3
                            public final Object invoke(Object obj4) {
                                C0312a c0312a;
                                int i171;
                                int i172;
                                AbstractC0343j abstractC0343j2 = (AbstractC0343j) obj4;
                                ArrayList arrayList15 = arrayList14;
                                int size8 = arrayList15.size();
                                int i173 = 0;
                                while (i173 < size8) {
                                    fw4 fw4Var13 = (fw4) arrayList15.get(i173);
                                    boolean zMo211f1 = cu4Var5.f34541b.mo211f0();
                                    boolean z15 = fw4Var13.f39788d;
                                    if (fw4Var13.f39802r == Integer.MIN_VALUE) {
                                        l54.m15814a("position() should be called first");
                                    }
                                    List list11 = fw4Var13.f39787c;
                                    int size9 = list11.size();
                                    int i174 = 0;
                                    while (i174 < size9) {
                                        l87 l87Var = (l87) list11.get(i174);
                                        int i175 = fw4Var13.f39803s - (z15 ? l87Var.f49302b : l87Var.f49301a);
                                        int i176 = fw4Var13.f39804t;
                                        int i177 = i173;
                                        long j9 = fw4Var13.f39807w;
                                        ArrayList arrayList16 = arrayList15;
                                        int i178 = size8;
                                        C0134c c0134cM1009a = fw4Var13.f39794j.m1009a(i174, fw4Var13.f39786b);
                                        if (c0134cM1009a != null) {
                                            if (zMo211f1) {
                                                c0134cM1009a.f2549n = j9;
                                            } else {
                                                long jM11595d = f84.m11595d(!f84.m11593b(c0134cM1009a.f2549n, 9223372034707292159L) ? c0134cM1009a.f2549n : j9, ((f84) ((xc9) c0134cM1009a.f2553r).getValue()).f38612a);
                                                if ((fw4Var13.m12233l(j9) <= i175 && fw4Var13.m12233l(jM11595d) <= i175) || (fw4Var13.m12233l(j9) >= i176 && fw4Var13.m12233l(jM11595d) >= i176)) {
                                                    c0134cM1009a.m1000b();
                                                }
                                                j9 = jM11595d;
                                            }
                                            c0312a = c0134cM1009a.f2550o;
                                        } else {
                                            zMo211f1 = zMo211f1;
                                            z15 = z15;
                                            list11 = list11;
                                            size9 = size9;
                                            c0312a = null;
                                        }
                                        if (z14) {
                                            if (z15) {
                                                i171 = (int) (j9 >> 32);
                                            } else {
                                                i171 = (fw4Var13.f39802r - ((int) (j9 >> 32))) - (z15 ? l87Var.f49302b : l87Var.f49301a);
                                            }
                                            if (z15) {
                                                i172 = (fw4Var13.f39802r - ((int) (j9 & 4294967295L))) - (z15 ? l87Var.f49302b : l87Var.f49301a);
                                            } else {
                                                i172 = (int) (j9 & 4294967295L);
                                            }
                                            j9 = (((long) i172) & 4294967295L) | (((long) i171) << 32);
                                        }
                                        long jM11595d2 = f84.m11595d(j9, j8);
                                        if (!zMo211f1 && c0134cM1009a != null) {
                                            c0134cM1009a.f2548m = jM11595d2;
                                        }
                                        if (c0312a != null) {
                                            AbstractC0343j.m1524n(abstractC0343j2, l87Var, jM11595d2, c0312a);
                                        } else {
                                            AbstractC0343j.m1523m(abstractC0343j2, l87Var, jM11595d2);
                                        }
                                        i174++;
                                        zMo211f1 = zMo211f1;
                                        i173 = i177;
                                        arrayList15 = arrayList16;
                                        size8 = i178;
                                        z15 = z15;
                                        list11 = list11;
                                        size9 = size9;
                                    }
                                    i173++;
                                }
                                return xfa.f68157a;
                            }
                        };
                        abstractC0343j.f4216a = true;
                        vi3Var.invoke(abstractC0343j);
                        abstractC0343j.f4216a = false;
                        zv4Var.f72257a.f2618u.getValue();
                        return xfa.f68157a;
                    }
                }), f4, z6, zv4Var.f72262f, z11, zv4Var.f72260d, uv4Var.f64401b.f62946b, cu4Var2, i31, arrayList5, (((long) i36) << c) | (((long) i37) & 4294967295L), i28, i24, zv4Var.f72266j, zv4Var.f72267k, zv4Var.f72268l, zv4Var.f72269m);
            }
            i27 = i25;
            i28 = i167;
            iArr7 = iArr3;
            arrayList2 = arrayList2;
            i29 = i27;
            arrayList3 = null;
            size2 = list.size();
            arrayList4 = null;
            i30 = 0;
            while (i30 < size2) {
                iIntValue = ((Number) list.get(i30)).intValue();
                i48 = i4;
                if (iIntValue >= i48) {
                    i49 = size2;
                } else {
                    if (arrayList3 != null) {
                        size4 = arrayList3.size();
                        i49 = size2;
                        i51 = 0;
                        while (true) {
                            if (i51 < size4) {
                                i52 = i51;
                                if (((fw4) arrayList3.get(i51)).f39785a != iIntValue) {
                                    i51 = i52 + 1;
                                }
                            }
                        }
                    } else {
                        i49 = size2;
                    }
                    c3047gq2 = c3047gq;
                    iM12806j = c3047gq2.m12806j(iIntValue);
                    arrayList7 = arrayList2;
                    if (iM12806j != -2) {
                    }
                    length4 = iArrCopyOf4.length;
                    i50 = 0;
                    while (true) {
                        if (i50 < length4) {
                            c3047gq = c3047gq2;
                            if (iArrCopyOf4[i50] < iIntValue) {
                                i50++;
                                c3047gq2 = c3047gq;
                            }
                        } else {
                            c3047gq = c3047gq2;
                            arrayList8 = arrayList4;
                            long jM25810a9 = zv4Var.m25810a(uv4Var, iIntValue, 0);
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            fw4 fw4VarM25358E10 = yv4Var5.m25358E(iIntValue, jM25810a9);
                            fw4VarM25358E10.m12236o(i29, 0, iMin);
                            int iM12235n7 = fw4VarM25358E10.m12235n() + i29;
                            arrayList8.add(fw4VarM25358E10);
                            i29 = iM12235n7;
                            arrayList4 = arrayList8;
                        }
                        i30++;
                        size2 = i49;
                        i4 = i48;
                        arrayList2 = arrayList7;
                    }
                }
                arrayList7 = arrayList2;
                i30++;
                size2 = i49;
                i4 = i48;
                arrayList2 = arrayList7;
            }
            arrayList5 = arrayList2;
            obj = arrayList4;
            i31 = i4;
            if (obj == null) {
                obj = emptyList;
            }
            arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList);
            arrayList6.addAll(arrayList5);
            if (arrayList3 != null) {
                arrayList6.addAll(arrayList3);
            }
            arrayList6.addAll((Collection) obj);
            c0135d = c0144d.f2617t;
            i32 = (int) f5;
            yv4Var = zv4Var.f72273q;
            c0139h = yv4Var.f70548c.f64402c;
            z4 = zv4Var.f72262f;
            i33 = zv4Var.f72275s;
            zMo211f0 = qm9Var.mo211f0();
            z5 = zv4Var.f72270n;
            iArr8 = iArr7;
            if (iArr8.length == 0) {
                uk9.m22784s();
                return null;
            }
            i34 = iArr8[0];
            length2 = iArr8.length - 1;
            if (1 <= length2) {
                i45 = 1;
                i46 = i34;
                while (true) {
                    i47 = iArr8[i45];
                    if (i46 > i47) {
                        i46 = i47;
                    }
                    if (i45 == length2) {
                        break;
                        break;
                    }
                    i45++;
                }
                i35 = i46;
            } else {
                i35 = i34;
            }
            c0135d.m1011d(i32, i15, i16, arrayList6, c0139h, yv4Var, z4, zMo211f0, i33, z5, i35, AbstractC3550rv.m20846n0(iArr6) + i14, zv4Var.f72269m, zv4Var.f72272p);
            if (qm9Var.mo211f0()) {
                jM1010b = c0144d.f2617t.m1010b();
                if (n84.m17279a(jM1010b, 0L)) {
                    if (z7) {
                        i42 = i16;
                    } else {
                        i42 = i15;
                    }
                    long j8 = j;
                    iM10429g2 = dk1.m10429g(Math.max(i15, (int) (jM1010b >> c)), j8);
                    iM10428f = dk1.m10428f(Math.max(i16, (int) (jM1010b & 4294967295L)), j8);
                    if (z7) {
                        i43 = iM10428f;
                    } else {
                        i43 = iM10429g2;
                    }
                    if (i43 != i42) {
                        size3 = arrayList6.size();
                        while (i44 < size3) {
                            fw4 fw4Var13 = (fw4) arrayList6.get(i44);
                            fw4Var13.f39802r = i43;
                            fw4Var13.f39804t = fw4Var13.f39792h + i43;
                        }
                    }
                    i36 = iM10429g2;
                    i37 = iM10428f;
                } else {
                    i36 = i15;
                    i37 = i16;
                }
            } else {
                i36 = i15;
                i37 = i16;
            }
            i38 = length11;
            i39 = 0;
            while (true) {
                if (i39 >= i38) {
                    length3 = iArrCopyOf4.length;
                    i40 = 0;
                    while (true) {
                        if (i40 < length3) {
                            if (iArrCopyOf4[i40] >= i31 - 1) {
                                z6 = false;
                                break;
                            }
                            i40++;
                        }
                    }
                } else {
                    i41 = i20;
                    if (iArr6[i39] <= i41) {
                        i39++;
                        i20 = i41;
                    }
                }
                z6 = true;
                break;
            }
            final long j9 = zv4Var.f72265i;
            final boolean z14 = false;
            final cu4 cu4Var5 = cu4Var2;
            return new dw4(iArr5, iArr8, f5, cu4Var5.mo9895M0(i36, i37, AbstractC3194a.m15360M(), new vi3() { // from class: aw4
                @Override // p000.vi3
                public final Object invoke(Object obj3) {
                    AbstractC0343j abstractC0343j = (AbstractC0343j) obj3;
                    final ArrayList arrayList14 = arrayList6;
                    final boolean z15 = z14;
                    final long j10 = j9;
                    final cu4 cu4Var6 = cu4Var5;
                    vi3 vi3Var = new vi3() { // from class: bw4
                        @Override // p000.vi3
                        public final Object invoke(Object obj4) {
                            C0312a c0312a;
                            int i171;
                            int i172;
                            AbstractC0343j abstractC0343j2 = (AbstractC0343j) obj4;
                            ArrayList arrayList15 = arrayList14;
                            int size8 = arrayList15.size();
                            int i173 = 0;
                            while (i173 < size8) {
                                fw4 fw4Var14 = (fw4) arrayList15.get(i173);
                                boolean zMo211f1 = cu4Var6.f34541b.mo211f0();
                                boolean z16 = fw4Var14.f39788d;
                                if (fw4Var14.f39802r == Integer.MIN_VALUE) {
                                    l54.m15814a("position() should be called first");
                                }
                                List list11 = fw4Var14.f39787c;
                                int size9 = list11.size();
                                int i174 = 0;
                                while (i174 < size9) {
                                    l87 l87Var = (l87) list11.get(i174);
                                    int i175 = fw4Var14.f39803s - (z16 ? l87Var.f49302b : l87Var.f49301a);
                                    int i176 = fw4Var14.f39804t;
                                    int i177 = i173;
                                    long j11 = fw4Var14.f39807w;
                                    ArrayList arrayList16 = arrayList15;
                                    int i178 = size8;
                                    C0134c c0134cM1009a = fw4Var14.f39794j.m1009a(i174, fw4Var14.f39786b);
                                    if (c0134cM1009a != null) {
                                        if (zMo211f1) {
                                            c0134cM1009a.f2549n = j11;
                                        } else {
                                            long jM11595d = f84.m11595d(!f84.m11593b(c0134cM1009a.f2549n, 9223372034707292159L) ? c0134cM1009a.f2549n : j11, ((f84) ((xc9) c0134cM1009a.f2553r).getValue()).f38612a);
                                            if ((fw4Var14.m12233l(j11) <= i175 && fw4Var14.m12233l(jM11595d) <= i175) || (fw4Var14.m12233l(j11) >= i176 && fw4Var14.m12233l(jM11595d) >= i176)) {
                                                c0134cM1009a.m1000b();
                                            }
                                            j11 = jM11595d;
                                        }
                                        c0312a = c0134cM1009a.f2550o;
                                    } else {
                                        zMo211f1 = zMo211f1;
                                        z16 = z16;
                                        list11 = list11;
                                        size9 = size9;
                                        c0312a = null;
                                    }
                                    if (z15) {
                                        if (z16) {
                                            i171 = (int) (j11 >> 32);
                                        } else {
                                            i171 = (fw4Var14.f39802r - ((int) (j11 >> 32))) - (z16 ? l87Var.f49302b : l87Var.f49301a);
                                        }
                                        if (z16) {
                                            i172 = (fw4Var14.f39802r - ((int) (j11 & 4294967295L))) - (z16 ? l87Var.f49302b : l87Var.f49301a);
                                        } else {
                                            i172 = (int) (j11 & 4294967295L);
                                        }
                                        j11 = (((long) i172) & 4294967295L) | (((long) i171) << 32);
                                    }
                                    long jM11595d2 = f84.m11595d(j11, j10);
                                    if (!zMo211f1 && c0134cM1009a != null) {
                                        c0134cM1009a.f2548m = jM11595d2;
                                    }
                                    if (c0312a != null) {
                                        AbstractC0343j.m1524n(abstractC0343j2, l87Var, jM11595d2, c0312a);
                                    } else {
                                        AbstractC0343j.m1523m(abstractC0343j2, l87Var, jM11595d2);
                                    }
                                    i174++;
                                    zMo211f1 = zMo211f1;
                                    i173 = i177;
                                    arrayList15 = arrayList16;
                                    size8 = i178;
                                    z16 = z16;
                                    list11 = list11;
                                    size9 = size9;
                                }
                                i173++;
                            }
                            return xfa.f68157a;
                        }
                    };
                    abstractC0343j.f4216a = true;
                    vi3Var.invoke(abstractC0343j);
                    abstractC0343j.f4216a = false;
                    zv4Var.f72257a.f2618u.getValue();
                    return xfa.f68157a;
                }
            }), f4, z6, zv4Var.f72262f, z11, zv4Var.f72260d, uv4Var.f64401b.f62946b, cu4Var2, i31, arrayList5, (((long) i36) << c) | (((long) i37) & 4294967295L), i28, i24, zv4Var.f72266j, zv4Var.f72267k, zv4Var.f72268l, zv4Var.f72269m);
        }
        c0144d = c0144d2;
        fFloatValue = c0144d.f2612o;
        if (Integer.signum(Math.round(fFloatValue)) == Integer.signum(i10)) {
            f = fFloatValue;
        } else {
            f = fFloatValue;
        }
        f2 = fFloatValue - f;
        f3 = 0.0f;
        if (qm9Var.mo211f0()) {
            f3 = (i10 - i114) + f2;
        }
        iArrCopyOf = Arrays.copyOf(iArr3, iArr3.length);
        length = iArrCopyOf.length;
        while (i12 < length) {
            iArrCopyOf[i12] = -iArrCopyOf[i12];
        }
        i13 = i9;
        if (i13 > i6) {
            i70 = 0;
            while (i70 < i3) {
                c0825bv = c0825bvArr[i70];
                iMo4182d = c0825bv.mo4182d();
                iArr10 = iArr4;
                i71 = 0;
                while (true) {
                    if (i71 < iMo4182d) {
                        i72 = i70;
                        f6 = f3;
                        break;
                        break;
                    }
                    i72 = i70;
                    fw4 fw4Var14 = (fw4) c0825bv.get(i71);
                    f6 = f3;
                    iArrM12805i = c3047gq3.m12805i(fw4Var14.f39785a);
                    int iM12235n8 = fw4Var14.m12235n();
                    if (iArrM12805i == null) {
                        i73 = 0;
                    } else {
                        i73 = iArrM12805i[i72];
                    }
                    i74 = iM12235n8 + i73;
                    if (i71 == c0825bv.size() - 1) {
                        break;
                    }
                    break;
                    iArr3[i72] = i75 - i74;
                    i71++;
                    iArr10[i72] = ((fw4) c0825bv.get(i71)).f39785a;
                    f3 = f6;
                    i70 = i72;
                }
                i70 = i72 + 1;
                f3 = f6;
                iArr4 = iArr10;
            }
        }
        iArr5 = iArr4;
        f4 = f3;
        i14 = i76 + i13;
        if (z7) {
            iM10429g = bk1.m3801i(j3);
            j = j3;
        } else {
            j = j3;
            iM10429g = dk1.m10429g(AbstractC3550rv.m20846n0(iArr13) + i14, j);
        }
        i15 = iM10429g;
        if (z7) {
            iM3800h = dk1.m10428f(AbstractC3550rv.m20846n0(iArr13) + i14, j);
        } else {
            iM3800h = bk1.m3800h(j);
        }
        i16 = iM3800h;
        if (z7) {
            i17 = i16;
        } else {
            i17 = i15;
        }
        i18 = i7;
        iMin = i76 + (Math.min(i17, i18) - i13);
        i19 = iArrCopyOf[0];
        size = list7.size() - 1;
        if (size >= 0) {
            i65 = size;
            arrayList = null;
            while (true) {
                i66 = i65 - 1;
                i67 = i19;
                list = list7;
                iIntValue2 = ((Number) list.get(i65)).intValue();
                iArr6 = iArr13;
                iM12806j2 = c3047gq3.m12806j(iIntValue2);
                i20 = i18;
                if (iM12806j2 != -2) {
                    i68 = 0;
                    while (true) {
                        if (i68 >= i3) {
                            uv4Var = uv4Var4;
                            long jM25810a10 = zv4Var.m25810a(uv4Var, iIntValue2, 0);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            List list11 = arrayList;
                            fw4 fw4VarM25358E11 = yv4Var5.m25358E(iIntValue2, jM25810a10);
                            iM12235n = i67 - fw4VarM25358E11.m12235n();
                            fw4VarM25358E11.m12236o(iM12235n, 0, iMin);
                            list11.add(fw4VarM25358E11);
                            arrayList = list11;
                            if (i66 < 0) {
                                break;
                                break;
                            }
                            uv4Var4 = uv4Var;
                            iArr13 = iArr6;
                            i65 = i66;
                            i18 = i20;
                            list7 = list;
                            i19 = iM12235n;
                            j = j;
                        } else {
                            fw4Var5 = (fw4) c0825bvArr[i68].m4186i();
                            if (fw4Var5 != null) {
                                i69 = fw4Var5.f39785a;
                            } else {
                                i69 = -1;
                            }
                            if (i69 > iIntValue2) {
                                i68++;
                            } else {
                                iM12235n = i67;
                                uv4Var = uv4Var4;
                                if (i66 < 0) {
                                    break;
                                    break;
                                }
                                uv4Var4 = uv4Var;
                                iArr13 = iArr6;
                                i65 = i66;
                                i18 = i20;
                                list7 = list;
                                i19 = iM12235n;
                                j = j;
                            }
                        }
                    }
                } else {
                    i68 = 0;
                    while (true) {
                        if (i68 >= i3) {
                            uv4Var = uv4Var4;
                            long jM25810a11 = zv4Var.m25810a(uv4Var, iIntValue2, 0);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            List list12 = arrayList;
                            fw4 fw4VarM25358E12 = yv4Var5.m25358E(iIntValue2, jM25810a11);
                            iM12235n = i67 - fw4VarM25358E12.m12235n();
                            fw4VarM25358E12.m12236o(iM12235n, 0, iMin);
                            list12.add(fw4VarM25358E12);
                            arrayList = list12;
                            if (i66 < 0) {
                                break;
                                break;
                            }
                            uv4Var4 = uv4Var;
                            iArr13 = iArr6;
                            i65 = i66;
                            i18 = i20;
                            list7 = list;
                            i19 = iM12235n;
                            j = j;
                        } else {
                            fw4Var5 = (fw4) c0825bvArr[i68].m4186i();
                            if (fw4Var5 != null) {
                                i69 = fw4Var5.f39785a;
                            } else {
                                i69 = -1;
                            }
                            if (i69 > iIntValue2) {
                                i68++;
                            } else {
                                iM12235n = i67;
                                uv4Var = uv4Var4;
                                if (i66 < 0) {
                                    break;
                                    break;
                                }
                                uv4Var4 = uv4Var;
                                iArr13 = iArr6;
                                i65 = i66;
                                i18 = i20;
                                list7 = list;
                                i19 = iM12235n;
                                j = j;
                            }
                        }
                    }
                }
            }
        } else {
            i20 = i18;
            j = j;
            list = list7;
            uv4Var = uv4Var4;
            iArr6 = iArr13;
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = emptyList;
        }
        i22 = 0;
        while (i21 < i3) {
            i22 += c0825bvArr[i21].f9041c;
        }
        arrayList2 = new ArrayList(i22);
        loop27: while (true) {
            i23 = 0;
            while (true) {
                if (i23 < i3) {
                    break loop27;
                    break loop27;
                }
                if (!c0825bvArr[i23].isEmpty()) {
                    break;
                }
                i23++;
                c3047gq3 = c3047gq3;
                f = f;
                xs4Var2 = xs4Var2;
            }
            i54 = Integer.MAX_VALUE;
            i55 = -1;
            i56 = 0;
            while (i56 < i3) {
                i63 = i56;
                fw4Var4 = (fw4) c0825bvArr[i56].m4186i();
                if (fw4Var4 != null) {
                    i64 = fw4Var4.f39785a;
                } else {
                    i64 = Integer.MAX_VALUE;
                }
                if (i54 > i64) {
                    i54 = i64;
                    i55 = i63;
                }
                i56 = i63 + 1;
            }
            fw4Var3 = (fw4) c0825bvArr[i55].removeFirst();
            i57 = fw4Var3.f39789e;
            if (i57 != i55) {
                int i1610 = i55;
                float f8 = f;
                C3047gq c3047gq6 = c3047gq3;
                long j10 = (((long) i57) << c) | (((long) (fw4Var3.f39790f + i57)) & 4294967295L);
                iM18131U = m18131U(iArrCopyOf, j10);
                xs4 xs4Var6 = xs4Var2;
                iArr9 = iArrCopyOf;
                i58 = xs4Var6.f68644a[i1610];
                i59 = i115;
                if (fw4Var3.f39797m + iM18131U >= i59) {
                    i60 = i113;
                    if (iM18131U <= i60) {
                        fw4Var3.m12236o(iM18131U, i58, iMin);
                        arrayList2.add(fw4Var3);
                    }
                } else {
                    i60 = i113;
                }
                i61 = (int) (j10 & 4294967295L);
                while (i62 < i61) {
                    iArr9[i62] = fw4Var3.m12235n() + iM18131U;
                }
                i113 = i60;
                i115 = i59;
                iArrCopyOf = iArr9;
                c3047gq3 = c3047gq6;
                f = f8;
                xs4Var2 = xs4Var6;
            }
        }
        f5 = f;
        c3047gq = c3047gq3;
        xs4 xs4Var7 = xs4Var2;
        i24 = i113;
        int i1611 = i115;
        i25 = iArrCopyOf[0];
        fw4Var = (fw4) u91.m22598P0(arrayList2);
        if (fw4Var != null) {
            i26 = fw4Var.f39785a;
        } else {
            i26 = -1;
        }
        if (!qm9Var.mo211f0()) {
            i27 = i25;
            i28 = i1611;
            iArr7 = iArr3;
            arrayList2 = arrayList2;
            i29 = i27;
            arrayList3 = null;
        } else {
            i27 = i25;
            i28 = i1611;
            iArr7 = iArr3;
            arrayList2 = arrayList2;
            i29 = i27;
            arrayList3 = null;
        }
        size2 = list.size();
        arrayList4 = null;
        i30 = 0;
        while (i30 < size2) {
            iIntValue = ((Number) list.get(i30)).intValue();
            i48 = i4;
            if (iIntValue >= i48) {
                i49 = size2;
            } else {
                if (arrayList3 != null) {
                    size4 = arrayList3.size();
                    i49 = size2;
                    i51 = 0;
                    while (true) {
                        if (i51 < size4) {
                            i52 = i51;
                            if (((fw4) arrayList3.get(i51)).f39785a != iIntValue) {
                                i51 = i52 + 1;
                            }
                        }
                    }
                } else {
                    i49 = size2;
                }
                c3047gq2 = c3047gq;
                iM12806j = c3047gq2.m12806j(iIntValue);
                arrayList7 = arrayList2;
                if (iM12806j != -2) {
                }
                length4 = iArrCopyOf4.length;
                i50 = 0;
                while (true) {
                    if (i50 < length4) {
                        c3047gq = c3047gq2;
                        if (iArrCopyOf4[i50] < iIntValue) {
                            i50++;
                            c3047gq2 = c3047gq;
                        }
                    } else {
                        c3047gq = c3047gq2;
                        arrayList8 = arrayList4;
                        long jM25810a12 = zv4Var.m25810a(uv4Var, iIntValue, 0);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        fw4 fw4VarM25358E13 = yv4Var5.m25358E(iIntValue, jM25810a12);
                        fw4VarM25358E13.m12236o(i29, 0, iMin);
                        int iM12235n9 = fw4VarM25358E13.m12235n() + i29;
                        arrayList8.add(fw4VarM25358E13);
                        i29 = iM12235n9;
                        arrayList4 = arrayList8;
                    }
                    i30++;
                    size2 = i49;
                    i4 = i48;
                    arrayList2 = arrayList7;
                }
            }
            arrayList7 = arrayList2;
            i30++;
            size2 = i49;
            i4 = i48;
            arrayList2 = arrayList7;
        }
        arrayList5 = arrayList2;
        obj = arrayList4;
        i31 = i4;
        if (obj == null) {
            obj = emptyList;
        }
        arrayList6 = new ArrayList();
        arrayList6.addAll(arrayList);
        arrayList6.addAll(arrayList5);
        if (arrayList3 != null) {
            arrayList6.addAll(arrayList3);
        }
        arrayList6.addAll((Collection) obj);
        c0135d = c0144d.f2617t;
        i32 = (int) f5;
        yv4Var = zv4Var.f72273q;
        c0139h = yv4Var.f70548c.f64402c;
        z4 = zv4Var.f72262f;
        i33 = zv4Var.f72275s;
        zMo211f0 = qm9Var.mo211f0();
        z5 = zv4Var.f72270n;
        iArr8 = iArr7;
        if (iArr8.length == 0) {
            uk9.m22784s();
            return null;
        }
        i34 = iArr8[0];
        length2 = iArr8.length - 1;
        if (1 <= length2) {
            i45 = 1;
            i46 = i34;
            while (true) {
                i47 = iArr8[i45];
                if (i46 > i47) {
                    i46 = i47;
                }
                if (i45 == length2) {
                    break;
                    break;
                }
                i45++;
            }
            i35 = i46;
        } else {
            i35 = i34;
        }
        c0135d.m1011d(i32, i15, i16, arrayList6, c0139h, yv4Var, z4, zMo211f0, i33, z5, i35, AbstractC3550rv.m20846n0(iArr6) + i14, zv4Var.f72269m, zv4Var.f72272p);
        if (qm9Var.mo211f0()) {
            jM1010b = c0144d.f2617t.m1010b();
            if (n84.m17279a(jM1010b, 0L)) {
                if (z7) {
                    i42 = i16;
                } else {
                    i42 = i15;
                }
                long j11 = j;
                iM10429g2 = dk1.m10429g(Math.max(i15, (int) (jM1010b >> c)), j11);
                iM10428f = dk1.m10428f(Math.max(i16, (int) (jM1010b & 4294967295L)), j11);
                if (z7) {
                    i43 = iM10428f;
                } else {
                    i43 = iM10429g2;
                }
                if (i43 != i42) {
                    size3 = arrayList6.size();
                    while (i44 < size3) {
                        fw4 fw4Var15 = (fw4) arrayList6.get(i44);
                        fw4Var15.f39802r = i43;
                        fw4Var15.f39804t = fw4Var15.f39792h + i43;
                    }
                }
                i36 = iM10429g2;
                i37 = iM10428f;
            } else {
                i36 = i15;
                i37 = i16;
            }
        } else {
            i36 = i15;
            i37 = i16;
        }
        i38 = length11;
        i39 = 0;
        while (true) {
            if (i39 >= i38) {
                length3 = iArrCopyOf4.length;
                i40 = 0;
                while (true) {
                    if (i40 < length3) {
                        if (iArrCopyOf4[i40] >= i31 - 1) {
                            z6 = false;
                            break;
                        }
                        i40++;
                    }
                }
            } else {
                i41 = i20;
                if (iArr6[i39] <= i41) {
                    i39++;
                    i20 = i41;
                }
            }
            z6 = true;
            break;
        }
        final long j12 = zv4Var.f72265i;
        final boolean z15 = false;
        final cu4 cu4Var6 = cu4Var2;
        return new dw4(iArr5, iArr8, f5, cu4Var6.mo9895M0(i36, i37, AbstractC3194a.m15360M(), new vi3() { // from class: aw4
            @Override // p000.vi3
            public final Object invoke(Object obj3) {
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj3;
                final ArrayList arrayList14 = arrayList6;
                final boolean z16 = z15;
                final long j13 = j12;
                final cu4 cu4Var7 = cu4Var6;
                vi3 vi3Var = new vi3() { // from class: bw4
                    @Override // p000.vi3
                    public final Object invoke(Object obj4) {
                        C0312a c0312a;
                        int i171;
                        int i172;
                        AbstractC0343j abstractC0343j2 = (AbstractC0343j) obj4;
                        ArrayList arrayList15 = arrayList14;
                        int size8 = arrayList15.size();
                        int i173 = 0;
                        while (i173 < size8) {
                            fw4 fw4Var16 = (fw4) arrayList15.get(i173);
                            boolean zMo211f1 = cu4Var7.f34541b.mo211f0();
                            boolean z17 = fw4Var16.f39788d;
                            if (fw4Var16.f39802r == Integer.MIN_VALUE) {
                                l54.m15814a("position() should be called first");
                            }
                            List list13 = fw4Var16.f39787c;
                            int size9 = list13.size();
                            int i174 = 0;
                            while (i174 < size9) {
                                l87 l87Var = (l87) list13.get(i174);
                                int i175 = fw4Var16.f39803s - (z17 ? l87Var.f49302b : l87Var.f49301a);
                                int i176 = fw4Var16.f39804t;
                                int i177 = i173;
                                long j14 = fw4Var16.f39807w;
                                ArrayList arrayList16 = arrayList15;
                                int i178 = size8;
                                C0134c c0134cM1009a = fw4Var16.f39794j.m1009a(i174, fw4Var16.f39786b);
                                if (c0134cM1009a != null) {
                                    if (zMo211f1) {
                                        c0134cM1009a.f2549n = j14;
                                    } else {
                                        long jM11595d = f84.m11595d(!f84.m11593b(c0134cM1009a.f2549n, 9223372034707292159L) ? c0134cM1009a.f2549n : j14, ((f84) ((xc9) c0134cM1009a.f2553r).getValue()).f38612a);
                                        if ((fw4Var16.m12233l(j14) <= i175 && fw4Var16.m12233l(jM11595d) <= i175) || (fw4Var16.m12233l(j14) >= i176 && fw4Var16.m12233l(jM11595d) >= i176)) {
                                            c0134cM1009a.m1000b();
                                        }
                                        j14 = jM11595d;
                                    }
                                    c0312a = c0134cM1009a.f2550o;
                                } else {
                                    zMo211f1 = zMo211f1;
                                    z17 = z17;
                                    list13 = list13;
                                    size9 = size9;
                                    c0312a = null;
                                }
                                if (z16) {
                                    if (z17) {
                                        i171 = (int) (j14 >> 32);
                                    } else {
                                        i171 = (fw4Var16.f39802r - ((int) (j14 >> 32))) - (z17 ? l87Var.f49302b : l87Var.f49301a);
                                    }
                                    if (z17) {
                                        i172 = (fw4Var16.f39802r - ((int) (j14 & 4294967295L))) - (z17 ? l87Var.f49302b : l87Var.f49301a);
                                    } else {
                                        i172 = (int) (j14 & 4294967295L);
                                    }
                                    j14 = (((long) i172) & 4294967295L) | (((long) i171) << 32);
                                }
                                long jM11595d2 = f84.m11595d(j14, j13);
                                if (!zMo211f1 && c0134cM1009a != null) {
                                    c0134cM1009a.f2548m = jM11595d2;
                                }
                                if (c0312a != null) {
                                    AbstractC0343j.m1524n(abstractC0343j2, l87Var, jM11595d2, c0312a);
                                } else {
                                    AbstractC0343j.m1523m(abstractC0343j2, l87Var, jM11595d2);
                                }
                                i174++;
                                zMo211f1 = zMo211f1;
                                i173 = i177;
                                arrayList15 = arrayList16;
                                size8 = i178;
                                z17 = z17;
                                list13 = list13;
                                size9 = size9;
                            }
                            i173++;
                        }
                        return xfa.f68157a;
                    }
                };
                abstractC0343j.f4216a = true;
                vi3Var.invoke(abstractC0343j);
                abstractC0343j.f4216a = false;
                zv4Var.f72257a.f2618u.getValue();
                return xfa.f68157a;
            }
        }), f4, z6, zv4Var.f72262f, z11, zv4Var.f72260d, uv4Var.f64401b.f62946b, cu4Var2, i31, arrayList5, (((long) i36) << c) | (((long) i37) & 4294967295L), i28, i24, zv4Var.f72266j, zv4Var.f72267k, zv4Var.f72268l, zv4Var.f72269m);
    }

    /* JADX INFO: renamed from: W */
    public static final boolean m18133W(int[] iArr, zv4 zv4Var, int[] iArr2, int i) {
        C3047gq c3047gq = zv4Var.f72274r;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (c3047gq.m12803g(iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (c3047gq.m12803g(iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int iM12806j = c3047gq.m12806j(0);
        return (iM12806j == 0 || iM12806j == -1 || iM12806j == -2) ? false : true;
    }

    /* JADX INFO: renamed from: X */
    public static int m18134X(Object obj, wm8 wm8Var, byte[] bArr, int i, int i2, C3846zu c3846zu) throws InvalidProtocolBufferException {
        int iM18115C = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM18115C = m18115C(i3, bArr, iM18115C, c3846zu);
            i3 = c3846zu.f72164a;
        }
        int i4 = iM18115C;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.m6421g();
        }
        int i5 = i4 + i3;
        wm8Var.mo6591f(obj, bArr, i4, i5, c3846zu);
        c3846zu.f72166c = obj;
        return i5;
    }

    /* JADX INFO: renamed from: Y */
    public static final long m18135Y(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : aa1.m198b(aa1.m200d(j) * f, j);
    }

    /* JADX INFO: renamed from: Z */
    public static final void m18136Z(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m18137a(int i, int i2, ye1 ye1Var, ui3 ui3Var, boolean z) {
        int i3;
        ui3 ui3Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1156491766);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (tj3Var.m22122h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= tj3Var.m22116e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= tj3Var.m22124i(ui3Var) ? 256 : 128;
        }
        if (!tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            ui3Var2 = ui3Var;
            tj3Var.m22102U();
        } else {
            if (!z) {
                x18 x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new b70(i, i2, 1, ui3Var, z);
                    return;
                }
                return;
            }
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            x17 x17Var = wj0.f66899a;
            long j = aa1.f406e;
            ui3Var2 = ui3Var;
            ss5.m21710f(e16VarM4412e, wj0.m23996a(aa1.m198b(0.18f, j), j, 0L, tj3Var, 12), null, false, ui3Var2, ci8.m4703P(-479530230, new rw6(i, i4), tj3Var), tj3Var, ((i3 << 6) & 57344) | 196614, 12);
        }
        x18 x18VarM22143u2 = tj3Var.m22143u();
        if (x18VarM22143u2 != null) {
            x18VarM22143u2.f67642d = new b70(i, i2, 2, ui3Var2, z);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static e16 m18138a0(e16 e16Var, vi3 vi3Var) {
        return e16Var.mo3161g(new bs6(vi3Var));
    }

    /* JADX INFO: renamed from: b */
    public static final void m18139b(ui3 ui3Var, e16 e16Var, boolean z, o39 o39Var, ly3 ly3Var, C0282a c0282a, ye1 ye1Var, int i) {
        boolean z2;
        o39 o39Var2;
        ly3 ly3Var2;
        ly3 ly3Var3;
        int i2;
        o39 o39Var3;
        ly3 ly3Var4;
        boolean z3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-399178234);
        int i3 = i | (tj3Var.m22124i(ui3Var) ? 4 : 2) | (tj3Var.m22120g(e16Var) ? 32 : 16) | 206208;
        if (tj3Var.m22099R(i3 & 1, (599187 & i3) != 599186)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                int i4 = my3.f52030a;
                o39 o39VarM24271b = x49.m24271b(ib9.f43906a, tj3Var);
                pa1 pa1Var = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a;
                ly3 ly3Var5 = pa1Var.f55857h0;
                if (ly3Var5 == null) {
                    ly3Var3 = new ly3(ra1.m20491d(pa1Var, d43.m10085b()), ra1.m20491d(pa1Var, d43.m10084a()), aa1.m198b(d43.m10088e(), ra1.m20491d(pa1Var, d43.m10087d())), aa1.m198b(d43.m10089f(), ra1.m20491d(pa1Var, d43.m10086c())));
                    pa1Var.f55857h0 = ly3Var3;
                } else {
                    ly3Var3 = ly3Var5;
                }
                i2 = i3 & (-64513);
                o39Var3 = o39VarM24271b;
                ly3Var4 = ly3Var3;
                z3 = true;
            } else {
                tj3Var.m22102U();
                i2 = i3 & (-64513);
                z3 = z;
                o39Var3 = o39Var;
                ly3Var4 = ly3Var;
            }
            tj3Var.m22140r();
            m18156l(ui3Var, e16Var, z3, o39Var3, ly3Var4, c0282a, tj3Var, (i2 & 112) | (i2 & 14) | 196608 | 14156160);
            z2 = z3;
            o39Var2 = o39Var3;
            ly3Var2 = ly3Var4;
        } else {
            tj3Var.m22102U();
            z2 = z;
            o39Var2 = o39Var;
            ly3Var2 = ly3Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new py3(ui3Var, e16Var, z2, o39Var2, ly3Var2, c0282a, i);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b0 */
    public static final xz9 m18140b0(d16 d16Var, long j, vi3 vi3Var) {
        C0357g c0357gM21979L = te1.m21979L(d16Var);
        int i = c0357gM21979L.f4336b;
        C0429a rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357gM21979L)).getRectManager();
        yz9 yz9Var = rectManager.f5032d;
        yz9Var.getClass();
        long j2 = j != 0 ? j : 0L;
        t56 t56Var = yz9Var.f70710a;
        xz9 xz9Var = new xz9(yz9Var, i, j2, d16Var, vi3Var);
        Object objM10152b = t56Var.m10152b(i);
        if (objM10152b == null) {
            t56Var.m21850i(i, xz9Var);
            objM10152b = xz9Var;
        }
        xz9 xz9Var2 = (xz9) objM10152b;
        if (xz9Var2 != xz9Var) {
            while (true) {
                xz9 xz9Var3 = xz9Var2.f69026e;
                if (xz9Var3 == null) {
                    break;
                }
                xz9Var2 = xz9Var3;
            }
            xz9Var2.f69026e = xz9Var;
        }
        C0357g c0357gM21979L2 = te1.m21979L(d16Var.f34837a);
        if (C0429a.m1871d(c0357gM21979L2)) {
            C3047gq c3047gq = rectManager.f5031c;
            int iM1876e = rectManager.m1876e(c0357gM21979L2);
            long[] jArr = (long[]) c3047gq.f41172c;
            int i2 = iM1876e + 2;
            jArr[i2] = (jArr[i2] & 8070450532247928831L) | (-8070450532247928832L);
        }
        rectManager.f5034f = true;
        rectManager.m1880k();
        return xz9Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:81:0x010d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0141  */
    /* JADX WARN: Code duplicated, block: B:87:0x014e  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m18141c(ui3 ui3Var, e16 e16Var, boolean z, ly3 ly3Var, o39 o39Var, zi3 zi3Var, ye1 ye1Var, int i, int i2) {
        int i3;
        e16 e16Var2;
        int i4;
        boolean z2;
        int i5;
        ly3 ly3Var2;
        int i6;
        boolean z3;
        boolean z4;
        ly3 ly3Var3;
        o39 o39Var2;
        x18 x18VarM22143u;
        e16 e16Var3;
        boolean z5;
        ly3 ly3VarM17148a;
        e16 e16Var4;
        o39 o39VarM24271b;
        int i7;
        ly3 ly3Var4;
        long j;
        int i8;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1413012038);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22124i(ui3Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                e16Var2 = e16Var;
                i3 |= tj3Var.m22120g(e16Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (tj3Var.m22122h(z2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        ly3Var2 = ly3Var;
                        int i10 = tj3Var.m22120g(ly3Var2) ? 2048 : 1024;
                        i3 |= i10;
                    } else {
                        ly3Var2 = ly3Var;
                    }
                    i3 |= i10;
                } else {
                    ly3Var2 = ly3Var;
                }
                i6 = i3 | 24576;
                if ((196608 & i) == 0) {
                    i6 = 90112 | i3;
                }
                if ((1572864 & i) == 0) {
                    if (tj3Var.m22124i(zi3Var)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i6 |= i8;
                }
                if ((599187 & i6) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var.m22099R(i6 & 1, z3)) {
                    tj3Var.m22104W();
                    if ((i & 1) != 0 || tj3Var.m22084B()) {
                        if (i9 != 0) {
                            e16Var3 = b16.f7762a;
                        } else {
                            e16Var3 = e16Var2;
                        }
                        z5 = i4 == 0 ? z2 : true;
                        if ((i2 & 8) != 0) {
                            int i11 = my3.f52030a;
                            j = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
                            ly3VarM17148a = my3.m17148a(((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a, j);
                            if (!aa1.m199c(ly3VarM17148a.f50303b, j)) {
                                ly3VarM17148a = ly3VarM17148a.m16572a(ly3VarM17148a.f50302a, j, ly3VarM17148a.f50304c, aa1.m198b(rg9.f59242a, j));
                            }
                            i6 &= -7169;
                        } else {
                            ly3VarM17148a = ly3Var2;
                        }
                        int i12 = my3.f52030a;
                        e16Var4 = e16Var3;
                        o39VarM24271b = x49.m24271b(ib9.f43906a, tj3Var);
                        i7 = i6 & (-458753);
                        ly3Var4 = ly3VarM17148a;
                    } else {
                        tj3Var.m22102U();
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                        }
                        i7 = i6 & (-458753);
                        o39VarM24271b = o39Var;
                        e16Var4 = e16Var2;
                        z5 = z2;
                        ly3Var4 = ly3Var2;
                    }
                    tj3Var.m22140r();
                    int i13 = i7 << 3;
                    m18143d(e16Var4, ui3Var, z5, o39VarM24271b, ly3Var4, zi3Var, tj3Var, ((i7 >> 3) & 14) | (i13 & 112) | (i7 & 896) | (57344 & i13) | (i13 & 458752) | (i7 & 3670016));
                    e16Var2 = e16Var4;
                    z4 = z5;
                    o39Var2 = o39VarM24271b;
                    ly3Var3 = ly3Var4;
                } else {
                    tj3Var.m22102U();
                    z4 = z2;
                    ly3Var3 = ly3Var2;
                    o39Var2 = o39Var;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new oy3(ui3Var, e16Var2, z4, ly3Var3, o39Var2, zi3Var, i, i2);
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    ly3Var2 = ly3Var;
                    if (tj3Var.m22120g(ly3Var2)) {
                    }
                    i3 |= i10;
                } else {
                    ly3Var2 = ly3Var;
                }
                i3 |= i10;
            } else {
                ly3Var2 = ly3Var;
            }
            i6 = i3 | 24576;
            if ((196608 & i) == 0) {
                i6 = 90112 | i3;
            }
            if ((1572864 & i) == 0) {
                if (tj3Var.m22124i(zi3Var)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i6 |= i8;
            }
            if ((599187 & i6) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var.m22099R(i6 & 1, z3)) {
                tj3Var.m22104W();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        int i14 = my3.f52030a;
                        j = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
                        ly3VarM17148a = my3.m17148a(((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a, j);
                        if (!aa1.m199c(ly3VarM17148a.f50303b, j)) {
                            ly3VarM17148a = ly3VarM17148a.m16572a(ly3VarM17148a.f50302a, j, ly3VarM17148a.f50304c, aa1.m198b(rg9.f59242a, j));
                        }
                        i6 &= -7169;
                    } else {
                        ly3VarM17148a = ly3Var2;
                    }
                    int i15 = my3.f52030a;
                    e16Var4 = e16Var3;
                    o39VarM24271b = x49.m24271b(ib9.f43906a, tj3Var);
                    i7 = i6 & (-458753);
                    ly3Var4 = ly3VarM17148a;
                } else {
                    if (i9 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        int i16 = my3.f52030a;
                        j = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
                        ly3VarM17148a = my3.m17148a(((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a, j);
                        if (!aa1.m199c(ly3VarM17148a.f50303b, j)) {
                            ly3VarM17148a = ly3VarM17148a.m16572a(ly3VarM17148a.f50302a, j, ly3VarM17148a.f50304c, aa1.m198b(rg9.f59242a, j));
                        }
                        i6 &= -7169;
                    } else {
                        ly3VarM17148a = ly3Var2;
                    }
                    int i17 = my3.f52030a;
                    e16Var4 = e16Var3;
                    o39VarM24271b = x49.m24271b(ib9.f43906a, tj3Var);
                    i7 = i6 & (-458753);
                    ly3Var4 = ly3VarM17148a;
                }
                tj3Var.m22140r();
                int i18 = i7 << 3;
                m18143d(e16Var4, ui3Var, z5, o39VarM24271b, ly3Var4, zi3Var, tj3Var, ((i7 >> 3) & 14) | (i18 & 112) | (i7 & 896) | (57344 & i18) | (i18 & 458752) | (i7 & 3670016));
                e16Var2 = e16Var4;
                z4 = z5;
                o39Var2 = o39VarM24271b;
                ly3Var3 = ly3Var4;
            } else {
                tj3Var.m22102U();
                z4 = z2;
                ly3Var3 = ly3Var2;
                o39Var2 = o39Var;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new oy3(ui3Var, e16Var2, z4, ly3Var3, o39Var2, zi3Var, i, i2);
            }
        }
        i3 |= 48;
        e16Var2 = e16Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (tj3Var.m22122h(z2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    ly3Var2 = ly3Var;
                    if (tj3Var.m22120g(ly3Var2)) {
                    }
                    i3 |= i10;
                } else {
                    ly3Var2 = ly3Var;
                }
                i3 |= i10;
            } else {
                ly3Var2 = ly3Var;
            }
            i6 = i3 | 24576;
            if ((196608 & i) == 0) {
                i6 = 90112 | i3;
            }
            if ((1572864 & i) == 0) {
                if (tj3Var.m22124i(zi3Var)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i6 |= i8;
            }
            if ((599187 & i6) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var.m22099R(i6 & 1, z3)) {
                tj3Var.m22104W();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        int i19 = my3.f52030a;
                        j = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
                        ly3VarM17148a = my3.m17148a(((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a, j);
                        if (!aa1.m199c(ly3VarM17148a.f50303b, j)) {
                            ly3VarM17148a = ly3VarM17148a.m16572a(ly3VarM17148a.f50302a, j, ly3VarM17148a.f50304c, aa1.m198b(rg9.f59242a, j));
                        }
                        i6 &= -7169;
                    } else {
                        ly3VarM17148a = ly3Var2;
                    }
                    int i110 = my3.f52030a;
                    e16Var4 = e16Var3;
                    o39VarM24271b = x49.m24271b(ib9.f43906a, tj3Var);
                    i7 = i6 & (-458753);
                    ly3Var4 = ly3VarM17148a;
                } else {
                    if (i9 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        int i111 = my3.f52030a;
                        j = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
                        ly3VarM17148a = my3.m17148a(((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a, j);
                        if (!aa1.m199c(ly3VarM17148a.f50303b, j)) {
                            ly3VarM17148a = ly3VarM17148a.m16572a(ly3VarM17148a.f50302a, j, ly3VarM17148a.f50304c, aa1.m198b(rg9.f59242a, j));
                        }
                        i6 &= -7169;
                    } else {
                        ly3VarM17148a = ly3Var2;
                    }
                    int i112 = my3.f52030a;
                    e16Var4 = e16Var3;
                    o39VarM24271b = x49.m24271b(ib9.f43906a, tj3Var);
                    i7 = i6 & (-458753);
                    ly3Var4 = ly3VarM17148a;
                }
                tj3Var.m22140r();
                int i113 = i7 << 3;
                m18143d(e16Var4, ui3Var, z5, o39VarM24271b, ly3Var4, zi3Var, tj3Var, ((i7 >> 3) & 14) | (i113 & 112) | (i7 & 896) | (57344 & i113) | (i113 & 458752) | (i7 & 3670016));
                e16Var2 = e16Var4;
                z4 = z5;
                o39Var2 = o39VarM24271b;
                ly3Var3 = ly3Var4;
            } else {
                tj3Var.m22102U();
                z4 = z2;
                ly3Var3 = ly3Var2;
                o39Var2 = o39Var;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new oy3(ui3Var, e16Var2, z4, ly3Var3, o39Var2, zi3Var, i, i2);
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                ly3Var2 = ly3Var;
                if (tj3Var.m22120g(ly3Var2)) {
                }
                i3 |= i10;
            } else {
                ly3Var2 = ly3Var;
            }
            i3 |= i10;
        } else {
            ly3Var2 = ly3Var;
        }
        i6 = i3 | 24576;
        if ((196608 & i) == 0) {
            i6 = 90112 | i3;
        }
        if ((1572864 & i) == 0) {
            if (tj3Var.m22124i(zi3Var)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i6 |= i8;
        }
        if ((599187 & i6) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tj3Var.m22099R(i6 & 1, z3)) {
            tj3Var.m22104W();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    e16Var3 = b16.f7762a;
                } else {
                    e16Var3 = e16Var2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 8) != 0) {
                    int i114 = my3.f52030a;
                    j = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
                    ly3VarM17148a = my3.m17148a(((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a, j);
                    if (!aa1.m199c(ly3VarM17148a.f50303b, j)) {
                        ly3VarM17148a = ly3VarM17148a.m16572a(ly3VarM17148a.f50302a, j, ly3VarM17148a.f50304c, aa1.m198b(rg9.f59242a, j));
                    }
                    i6 &= -7169;
                } else {
                    ly3VarM17148a = ly3Var2;
                }
                int i115 = my3.f52030a;
                e16Var4 = e16Var3;
                o39VarM24271b = x49.m24271b(ib9.f43906a, tj3Var);
                i7 = i6 & (-458753);
                ly3Var4 = ly3VarM17148a;
            } else {
                if (i9 != 0) {
                    e16Var3 = b16.f7762a;
                } else {
                    e16Var3 = e16Var2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 8) != 0) {
                    int i116 = my3.f52030a;
                    j = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
                    ly3VarM17148a = my3.m17148a(((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a, j);
                    if (!aa1.m199c(ly3VarM17148a.f50303b, j)) {
                        ly3VarM17148a = ly3VarM17148a.m16572a(ly3VarM17148a.f50302a, j, ly3VarM17148a.f50304c, aa1.m198b(rg9.f59242a, j));
                    }
                    i6 &= -7169;
                } else {
                    ly3VarM17148a = ly3Var2;
                }
                int i117 = my3.f52030a;
                e16Var4 = e16Var3;
                o39VarM24271b = x49.m24271b(ib9.f43906a, tj3Var);
                i7 = i6 & (-458753);
                ly3Var4 = ly3VarM17148a;
            }
            tj3Var.m22140r();
            int i118 = i7 << 3;
            m18143d(e16Var4, ui3Var, z5, o39VarM24271b, ly3Var4, zi3Var, tj3Var, ((i7 >> 3) & 14) | (i118 & 112) | (i7 & 896) | (57344 & i118) | (i118 & 458752) | (i7 & 3670016));
            e16Var2 = e16Var4;
            z4 = z5;
            o39Var2 = o39VarM24271b;
            ly3Var3 = ly3Var4;
        } else {
            tj3Var.m22102U();
            z4 = z2;
            ly3Var3 = ly3Var2;
            o39Var2 = o39Var;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new oy3(ui3Var, e16Var2, z4, ly3Var3, o39Var2, zi3Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static int m18142c0(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? context.getColor(i) : typedValue.data;
    }

    /* JADX INFO: renamed from: d */
    public static final void m18143d(e16 e16Var, ui3 ui3Var, boolean z, o39 o39Var, ly3 ly3Var, zi3 zi3Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1134296466);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22122h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22120g(o39Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22120g(ly3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var.m22120g(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= tj3Var.m22124i(zi3Var) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (tj3Var.m22099R(i3 & 1, (599187 & i3) != 599186)) {
            tj3Var.m22111b0(976976045);
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AbstractC3393o1.m17729d(tj3Var);
            }
            v56 v56Var = (v56) objM22097O;
            tj3Var.m22139q(false);
            iv3 iv3Var = AbstractC0262s.f3627a;
            e16 e16VarMo3161g = e16Var.mo3161g(c06.f9271b);
            int i4 = my3.f52030a;
            long jM17150c = my3.m17150c();
            y33 y33Var = c99.f9762a;
            e16 e16VarM24777o = xwc.m24777o(AbstractC0080f.m814a(d32.m10007D(pb1.m19045o(c99.m4423p(e16VarMo3161g, bk2.m3806b(jM17150c), bk2.m3805a(jM17150c)), o39Var), z ? ly3Var.f50302a : ly3Var.f50304c, o39Var), v56Var, gh8.m12656a(false, 0.0f, 0L, o39Var, 247), z, new uh8(0), ui3Var, 8));
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM24777o);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            pvc.m19507c(AbstractC3393o1.m17727b(z ? ly3Var.f50303b : ly3Var.f50305d, sk1.f60948a), zi3Var, tj3Var, ((i3 >> 15) & 112) | 8);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gk0(e16Var, ui3Var, z, o39Var, ly3Var, zi3Var, i);
        }
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
      (r0v0 int) from 0x0007: SWITCH (r0v0 int)
     case -1811142716: goto B:118:0x0130
     case -1811142715: goto B:113:0x0123
     case -1811142714: goto B:108:0x0116
     case -1811142713: goto B:103:0x0109
     case -1811142712: goto B:98:0x00fc
     case -1811142711: goto B:93:0x00ef
     case -1811142710: goto B:88:0x00e2
     case -1811142709: goto B:83:0x00d5
     case -1811142708: goto B:78:0x00c8
     case -1811142707: goto B:73:0x00bb
     default: goto B:5:0x000a A[RegionRef:SW:4]
      (r0v0 int) from 0x000a: SWITCH (r0v0 int)
     case -1811142685: goto B:68:0x00ae
     case -1811142684: goto B:63:0x00a1
     case -1811142683: goto B:58:0x0094
     default: goto B:6:0x000d A[RegionRef:SW:5]
      (r0v0 int) from 0x000d: SWITCH (r0v0 int)
     case 80123371: goto B:53:0x0087
     case 80123372: goto B:48:0x007a
     case 80123373: goto B:43:0x006d
     case 80123374: goto B:38:0x0060
     case 80123375: goto B:33:0x0053
     case 80123376: goto B:28:0x0046
     case 80123377: goto B:23:0x0039
     case 80123378: goto B:18:0x002c
     case 80123379: goto B:13:0x001f
     case 80123380: goto B:8:0x0012
     default: goto B:313:? A[RegionRef:SW:6]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d0 */
    public static String m18144d0(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m18145e(boolean z, vi3 vi3Var, e16 e16Var, boolean z2, uy3 uy3Var, o39 o39Var, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        uy3 uy3Var2;
        o39 o39Var2;
        uy3 uy3Var3;
        o39 o39VarM24271b;
        int i3;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1031402037);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22122h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22120g(e16Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22122h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        int i4 = 196608 | i2;
        if ((1572864 & i) == 0) {
            i4 = 720896 | i2;
        }
        if ((12582912 & i) == 0) {
            i4 |= tj3Var2.m22124i(c0282a) ? 8388608 : 4194304;
        }
        if (tj3Var2.m22099R(i4 & 1, (4793491 & i4) != 4793490)) {
            tj3Var2.m22104W();
            if ((i & 1) == 0 || tj3Var2.m22084B()) {
                int i5 = my3.f52030a;
                tj3Var2.m22111b0(-1355771567);
                long j = ((aa1) tj3Var2.m22128k(sk1.f60948a)).f414a;
                pa1 pa1Var = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a;
                uy3Var3 = pa1Var.f55855g0;
                if (uy3Var3 == null) {
                    long j2 = aa1.f411j;
                    uy3Var3 = new uy3(j2, j, j2, aa1.m198b(rg9.f59242a, j), j2, ra1.m20491d(pa1Var, rg9.f59243b));
                    pa1Var.f55855g0 = uy3Var3;
                }
                if (aa1.m199c(uy3Var3.m23013d(), j)) {
                    tj3Var2.m22139q(false);
                } else {
                    uy3 uy3VarM23010c = uy3.m23010c(uy3Var3, j, aa1.m198b(rg9.f59242a, j));
                    tj3Var2.m22139q(false);
                    uy3Var3 = uy3VarM23010c;
                }
                int i6 = my3.f52030a;
                o39VarM24271b = x49.m24271b(ib9.f43906a, tj3Var2);
                i3 = i4 & (-3727361);
            } else {
                tj3Var2.m22102U();
                i3 = i4 & (-3727361);
                uy3Var3 = uy3Var;
                o39VarM24271b = o39Var;
            }
            tj3Var2.m22140r();
            tj3Var = tj3Var2;
            m18147f(z, vi3Var, e16Var, z2, uy3Var3, o39VarM24271b, c0282a, tj3Var, i3 & 33554430);
            uy3Var2 = uy3Var3;
            o39Var2 = o39VarM24271b;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            uy3Var2 = uy3Var;
            o39Var2 = o39Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ny3(z, vi3Var, e16Var, z2, uy3Var2, o39Var2, c0282a, i, 0);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static int m18146e0(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: f */
    public static final void m18147f(boolean z, vi3 vi3Var, e16 e16Var, boolean z2, uy3 uy3Var, o39 o39Var, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1724745099);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22122h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22120g(e16Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22122h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var2.m22120g(uy3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var2.m22120g(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= tj3Var2.m22120g(o39Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= tj3Var2.m22124i(c0282a) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (tj3Var2.m22099R(i3 & 1, (i3 & 4793491) != 4793490)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0 && !tj3Var2.m22084B()) {
                tj3Var2.m22102U();
            }
            tj3Var2.m22140r();
            tj3Var2.m22111b0(1187952688);
            Object objM22097O = tj3Var2.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AbstractC3393o1.m17729d(tj3Var2);
            }
            tj3Var2.m22139q(false);
            iv3 iv3Var = AbstractC0262s.f3627a;
            e16 e16VarMo3161g = e16Var.mo3161g(c06.f9271b);
            int i4 = my3.f52030a;
            long jM17150c = my3.m17150c();
            y33 y33Var = c99.f9762a;
            tj3Var = tj3Var2;
            e16 e16VarM10522I = do7.m10522I(d32.m10007D(pb1.m19045o(c99.m4423p(e16VarMo3161g, bk2.m3806b(jM17150c), bk2.m3805a(jM17150c)), o39Var), ((aa1) uy3Var.m23011a(z2, z, tj3Var2).getValue()).f414a, ss5.f61356d), z, (v56) objM22097O, gh8.m12656a(false, 0.0f, 0L, o39Var, 247), z2, new uh8(1), vi3Var);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM10522I);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            pvc.m19507c(AbstractC3393o1.m17727b(((aa1) uy3Var.m23012b(z2, z, tj3Var).getValue()).f414a, sk1.f60948a), c0282a, tj3Var, ((i3 >> 18) & 112) | 8);
            tj3Var.m22139q(true);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ny3(z, vi3Var, e16Var, z2, uy3Var, o39Var, c0282a, i, 1);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static int m18148f0(Object obj) {
        return m18146e0(obj == null ? 0 : obj.hashCode());
    }

    /* JADX INFO: renamed from: g */
    public static final long m18149g(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    /* JADX INFO: renamed from: g0 */
    public static final int m18150g0(s56 s56Var) {
        int iM21103c;
        int i = s56Var.f60382b;
        int iM21103c2 = s56Var.m21103c(0);
        while (s56Var.f60382b != 0 && s56Var.m21103c(0) == iM21103c2) {
            s56Var.m21106f(0, s56Var.m21104d());
            s56Var.m21105e(s56Var.f60382b - 1);
            int i2 = s56Var.f60382b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int iM21103c3 = s56Var.m21103c(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int iM21103c4 = s56Var.m21103c(i6);
                if (i5 < i2 && (iM21103c = s56Var.m21103c(i5)) > iM21103c4) {
                    if (iM21103c <= iM21103c3) {
                        break;
                    }
                    s56Var.m21106f(i4, iM21103c);
                    s56Var.m21106f(i5, iM21103c3);
                    i4 = i5;
                } else {
                    if (iM21103c4 <= iM21103c3) {
                        break;
                    }
                    s56Var.m21106f(i4, iM21103c4);
                    s56Var.m21106f(i6, iM21103c3);
                    i4 = i6;
                }
            }
        }
        return iM21103c2;
    }

    /* JADX INFO: renamed from: h */
    public static final void m18151h(final int i, ye1 ye1Var, final ui3 ui3Var, final ui3 ui3Var2, final String str, final String str2, final boolean z) {
        int i2;
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-866788713);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22120g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22124i(ui3Var2) ? 16384 : 8192;
        }
        if (!tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            tj3Var.m22102U();
        } else if (z) {
            tj3Var.m22111b0(-1158912097);
            boolean z2 = (i2 & 7168) == 2048;
            Object objM22097O = tj3Var.m22097O();
            if (z2 || objM22097O == we1.f66679a) {
                objM22097O = new k92(i3, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            AbstractC0454b.m1895a((ui3) objM22097O, null, ci8.m4703P(-1486258231, new di0(str, str2, ui3Var2, i3), tj3Var), tj3Var, 384, 2);
            tj3Var.m22139q(false);
        } else {
            tj3Var.m22111b0(-1156132885);
            tj3Var.m22139q(false);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: zl4
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    omd.m18151h(pk9.m19383z(i | 1), (ye1) obj, ui3Var, ui3Var2, str, str2, z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static final long m18152h0(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    /* JADX INFO: renamed from: i */
    public static final void m18153i(h68 h68Var, ui3 ui3Var, ui3 ui3Var2, ui3 ui3Var3, ye1 ye1Var, int i, int i2) {
        ui3 ui3Var4;
        int i3;
        ui3 ui3Var5;
        ui3 ui3Var6;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(809131539);
        int i4 = 4;
        int i5 = (tj3Var.m22120g(h68Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i5 |= tj3Var.m22124i(ui3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= tj3Var.m22124i(ui3Var2) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
            ui3Var4 = ui3Var3;
        } else {
            ui3Var4 = ui3Var3;
            i3 = i5 | (tj3Var.m22124i(ui3Var4) ? 2048 : 1024);
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            if (i6 != 0) {
                Object objM22097O = tj3Var.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = new C3288l7(7);
                    tj3Var.m22131l0(objM22097O);
                }
                ui3Var6 = (ui3) objM22097O;
            } else {
                ui3Var6 = ui3Var4;
            }
            if (h68Var.f41840a) {
                tj3Var.m22111b0(1481610495);
                boolean z = !h68Var.f41843d;
                AbstractC0454b.m1895a(ui3Var2, new ge2(i4, z, z), ci8.m4703P(-1795588411, new au4(h68Var, ui3Var6, ui3Var, ui3Var2), tj3Var), tj3Var, ((i3 >> 6) & 14) | 384, 0);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1488022287);
                tj3Var.m22139q(false);
            }
            ui3Var5 = ui3Var6;
        } else {
            tj3Var.m22102U();
            ui3Var5 = ui3Var4;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new tz3(h68Var, ui3Var, ui3Var2, ui3Var5, i, i2, 3);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final mi8 m18154j(float f, float f2, float f3, float f4, float f5, float f6) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        return new mi8(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    /* JADX INFO: renamed from: k */
    public static final void m18155k(final ui3 ui3Var, final ui3 ui3Var2, boolean z, ui3 ui3Var3, e16 e16Var, ye1 ye1Var, final int i) {
        ui3 ui3Var4;
        boolean z2;
        e16 e16Var2;
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1150700106);
        int i2 = i | (tj3Var.m22124i(ui3Var) ? 4 : 2) | (tj3Var.m22124i(ui3Var2) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128) | (tj3Var.m22124i(ui3Var3) ? 2048 : 1024) | 24576;
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
            ui0 ui0Var = vi0.Companion;
            e16 e16VarM10006C = d32.m10006C(e16VarM4411d, ui0.m22750f(ui0Var, new Pair[]{new Pair(Float.valueOf(0.2285f), new aa1(d32.m10037f(4282557796L))), new Pair(Float.valueOf(0.7002f), new aa1(d32.m10037f(4281234893L)))}));
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52815j, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM10006C);
            se1.f60731q.getClass();
            ui3 ui3Var5 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var5);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            e16 e16VarM15962y = l70.m15962y(c99.m4412e(b16Var, 1.0f));
            zf1 zf1Var = ge9.f40637a;
            ((fe9) tj3Var.m22128k(zf1Var)).getClass();
            e16Var2 = b16Var;
            bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_onboarding_launch, tj3Var, 0), null, AbstractC3584sr.m21609V(e16VarM15962y, 0.0f, 96.0f, 1), null, hl1.f42565b, 0.0f, null, tj3Var, 24632, 104);
            qh0.m19963a(d32.m10006C(c99.m4410c(c99.m4412e(e16Var2, 1.0f), 0.5f), ui0.m22750f(ui0Var, new Pair[]{new Pair(Float.valueOf(0.0892f), new aa1(aa1.f411j)), new Pair(Float.valueOf(0.9848f), new aa1(d32.m10037f(4278655232L)))})), tj3Var, 0);
            e16 e16VarM15962y2 = l70.m15962y(c99.m4412e(e16Var2, 1.0f));
            WeakHashMap weakHashMap = l6b.f49204w;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(wfb.m23904F(e16VarM15962y2, ho5.m13397r(tj3Var).f49211g), ((fe9) tj3Var.m22128k(zf1Var)).f38960i);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38963l, true, new gm5(28)), nj0.f52792K, tj3Var, 48);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var5);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            y27 y27VarM18236U = AbstractC3423or.m18236U(com.lingq.core.p012ui.R$drawable.im_lingq_logo, tj3Var, 0);
            e16 e16VarM4425r = c99.m4425r(e16Var2, 0.0f, 0.0f, 200.0f, 3);
            long j = aa1.f406e;
            bq1.m4042R(y27VarM18236U, null, e16VarM4425r, null, null, 0.0f, new qd0(5, j), tj3Var, 1573304, 56);
            String strM23620a0 = vz1.m23620a0(tj3Var, R$string.onboarding_v2_start_title);
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(strM23620a0, null, j, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71400d, tj3Var, 384, 0, 130042);
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.onboarding_v2_start_subtitle), null, aa1.m198b(0.8f, j), null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71403g, tj3Var, 384, 0, 130042);
            tj3Var = tj3Var;
            ss5.m21710f(c99.m4412e(e16Var2, 1.0f), null, null, false, ui3Var, f54596a, tj3Var, ((i2 << 12) & 57344) | 196614, 14);
            e16 e16VarM4412e = c99.m4412e(e16Var2, 1.0f);
            x17 x17Var = wj0.f66899a;
            ss5.m21710f(e16VarM4412e, wj0.m23996a(j, aa1.f403b, 0L, tj3Var, 12), null, false, ui3Var2, f54597b, tj3Var, ((i2 << 9) & 57344) | 196614, 12);
            z2 = z;
            ui3Var4 = ui3Var3;
            m18137a(R$string.welcome_show_and_974_no_discount_flow, ((i2 >> 3) & 896) | ((i2 >> 6) & 14), tj3Var, ui3Var4, z2);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            ui3Var4 = ui3Var3;
            z2 = z;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final boolean z3 = z2;
            final ui3 ui3Var6 = ui3Var4;
            final e16 e16Var3 = e16Var2;
            x18VarM22143u.f67642d = new zi3(ui3Var2, z3, ui3Var6, e16Var3, i) { // from class: yg9

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ui3 f69820b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f69821c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ui3 f69822d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ e16 f69823e;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    omd.m18155k(this.f69819a, this.f69820b, this.f69821c, this.f69822d, this.f69823e, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m18156l(ui3 ui3Var, e16 e16Var, boolean z, o39 o39Var, ly3 ly3Var, C0282a c0282a, ye1 ye1Var, int i) {
        ui3 ui3Var2;
        int i2;
        o39 o39Var2;
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-171935091);
        if ((i & 6) == 0) {
            ui3Var2 = ui3Var;
            i2 = (tj3Var2.m22124i(ui3Var2) ? 4 : 2) | i;
        } else {
            ui3Var2 = ui3Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22120g(e16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22122h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            o39Var2 = o39Var;
            i2 |= tj3Var2.m22120g(o39Var2) ? 2048 : 1024;
        } else {
            o39Var2 = o39Var;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var2.m22120g(ly3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var2.m22120g(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= tj3Var2.m22120g(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= tj3Var2.m22124i(c0282a) ? 8388608 : 4194304;
        }
        int i3 = 0;
        if (tj3Var2.m22099R(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objM22097O = tj3Var2.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = new qy3(i3);
                tj3Var2.m22131l0(objM22097O);
            }
            e16 e16VarM17643c = nv8.m17643c(e16Var, false, (vi3) objM22097O);
            long j = z ? ly3Var.f50302a : ly3Var.f50304c;
            int i4 = i2 & 8078;
            int i5 = i2 << 9;
            int i6 = (i5 & 1879048192) | i4 | (i5 & 234881024);
            tj3Var = tj3Var2;
            ho9.m13415b(ui3Var2, e16VarM17643c, z, o39Var2, j, z ? ly3Var.f50303b : ly3Var.f50305d, 0.0f, 0.0f, null, null, ci8.m4703P(669231714, new ry3(c0282a, 0), tj3Var2), tj3Var, i6, 192);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new qb0(ui3Var, e16Var, z, o39Var, ly3Var, c0282a, i, 2);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final long m18157m(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = k9a.f46916c;
        return jFloatToRawIntBits;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m18158n(kv8 kv8Var) {
        Object objM1838a = AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5012s);
        n66 n66Var = kv8Var.f48471a;
        if (fa4.m11650l(objM1838a, e41.f36677b)) {
            return false;
        }
        return n66Var.m17250b(AbstractC0421a.f4951g) || n66Var.m17250b(AbstractC0421a.f4952h);
    }

    /* JADX INFO: renamed from: o */
    public static final void m18159o(s56 s56Var, int i) {
        if (s56Var.f60382b == 0 || !(s56Var.m21103c(0) == i || s56Var.m21103c(s56Var.f60382b - 1) == i)) {
            int i2 = s56Var.f60382b;
            s56Var.m21101a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iM21103c = s56Var.m21103c(i3);
                if (i <= iM21103c) {
                    break;
                }
                s56Var.m21106f(i2, iM21103c);
                i2 = i3;
            }
            s56Var.m21106f(i2, i);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final Bundle m18160p(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.f47623a;
            Object obj = pair.f47624b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        C3386nv.m17622h(34, componentType.getCanonicalName(), " for key \"", str, "Illegal value array type ");
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    C3386nv.m17622h(34, obj.getClass().getCanonicalName(), " for key \"", str, "Illegal value type ");
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
      (r0v0 int) from 0x0007: SWITCH (r0v0 int)
     case -1811142716: goto B:118:0x0130
     case -1811142715: goto B:113:0x0123
     case -1811142714: goto B:108:0x0116
     case -1811142713: goto B:103:0x0109
     case -1811142712: goto B:98:0x00fc
     case -1811142711: goto B:93:0x00ef
     case -1811142710: goto B:88:0x00e2
     case -1811142709: goto B:83:0x00d5
     case -1811142708: goto B:78:0x00c8
     case -1811142707: goto B:73:0x00bb
     default: goto B:5:0x000a A[RegionRef:SW:4]
      (r0v0 int) from 0x000a: SWITCH (r0v0 int)
     case -1811142685: goto B:68:0x00ae
     case -1811142684: goto B:63:0x00a1
     case -1811142683: goto B:58:0x0094
     default: goto B:6:0x000d A[RegionRef:SW:5]
      (r0v0 int) from 0x000d: SWITCH (r0v0 int)
     case 80123371: goto B:53:0x0087
     case 80123372: goto B:48:0x007a
     case 80123373: goto B:43:0x006d
     case 80123374: goto B:38:0x0060
     case 80123375: goto B:33:0x0053
     case 80123376: goto B:28:0x0046
     case 80123377: goto B:23:0x0039
     case 80123378: goto B:18:0x002c
     case 80123379: goto B:13:0x001f
     case 80123380: goto B:8:0x0012
     default: goto B:331:? A[RegionRef:SW:6]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: q */
    public static String m18161q(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "kotlin.Double.Companion";
            case "java.lang.Integer":
                return "kotlin.Int";
            case "java.lang.Cloneable":
                return "kotlin.Cloneable";
            case "java.lang.annotation.Annotation":
                return "kotlin.Annotation";
            case "java.lang.Comparable":
                return "kotlin.Comparable";
            case "java.util.Map":
                return "kotlin.collections.Map";
            case "java.util.Set":
                return "kotlin.collections.Set";
            case "double":
                return "kotlin.Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "kotlin.Byte.Companion";
            case "java.lang.CharSequence":
                return "kotlin.CharSequence";
            case "java.util.Collection":
                return "kotlin.collections.Collection";
            case "java.lang.Float":
                return "kotlin.Float";
            case "java.lang.Short":
                return "kotlin.Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "kotlin.Char.Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "kotlin.Long.Companion";
            case "java.util.Map$Entry":
                return "kotlin.collections.Map.Entry";
            case "int":
                return "kotlin.Int";
            case "byte":
                return "kotlin.Byte";
            case "char":
                return "kotlin.Char";
            case "long":
                return "kotlin.Long";
            case "boolean":
                return "kotlin.Boolean";
            case "java.util.List":
                return "kotlin.collections.List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "kotlin.Short.Companion";
            case "float":
                return "kotlin.Float";
            case "short":
                return "kotlin.Short";
            case "java.lang.Character":
                return "kotlin.Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "kotlin.Enum.Companion";
            case "java.lang.Boolean":
                return "kotlin.Boolean";
            case "java.lang.Byte":
                return "kotlin.Byte";
            case "java.lang.Enum":
                return "kotlin.Enum";
            case "java.lang.Long":
                return "kotlin.Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "kotlin.Float.Companion";
            case "java.util.Iterator":
                return "kotlin.collections.Iterator";
            case "java.util.ListIterator":
                return "kotlin.collections.ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "kotlin.String.Companion";
            case "java.lang.Double":
                return "kotlin.Double";
            case "java.lang.Number":
                return "kotlin.Number";
            case "java.lang.Object":
                return "kotlin.Any";
            case "java.lang.String":
                return "kotlin.String";
            case "java.lang.Iterable":
                return "kotlin.collections.Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "kotlin.Boolean.Companion";
            case "java.lang.Throwable":
                return "kotlin.Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "kotlin.Int.Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: r */
    public static final int m18162r(long j, long j2) {
        boolean zM18126P = m18126P(j);
        if (zM18126P != m18126P(j2)) {
            return zM18126P ? -1 : 1;
        }
        int iSignum = (int) Math.signum(m18121J(j) - m18121J(j2));
        if (Math.min(m18121J(j), m18121J(j2)) >= 0.0f && m18125O(j) != m18125O(j2)) {
            return m18125O(j) ? -1 : 1;
        }
        return iSignum;
    }

    /* JADX INFO: renamed from: s */
    public static int m18163s(int i, int i2) {
        return ya1.m25016i(i, (Color.alpha(i) * i2) / 255);
    }

    /* JADX INFO: renamed from: t */
    public static final void m18164t(File file) throws IOException {
        if (file.exists() || file.mkdirs() || file.isDirectory()) {
            return;
        }
        uk9.m22774h(file, "Could not create directory at ");
    }

    /* JADX INFO: renamed from: u */
    public static final long m18165u(AbstractC0150d abstractC0150d) {
        return ss5.m21694U(abstractC0150d.m1037l() * abstractC0150d.m1041p()) + (((long) abstractC0150d.m1036k()) * ((long) abstractC0150d.m1041p()));
    }

    /* JADX INFO: renamed from: v */
    public static int m18166v(byte[] bArr, int i, C3846zu c3846zu) throws InvalidProtocolBufferException {
        int iM18116D = m18116D(bArr, i, c3846zu);
        int i2 = c3846zu.f72164a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.m6419e();
        }
        if (i2 > bArr.length - iM18116D) {
            throw InvalidProtocolBufferException.m6421g();
        }
        if (i2 == 0) {
            c3846zu.f72166c = ByteString.f13555b;
            return iM18116D;
        }
        c3846zu.f72166c = ByteString.m6408g(bArr, iM18116D, i2);
        return iM18116D + i2;
    }

    /* JADX INFO: renamed from: w */
    public static int m18167w(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: x */
    public static long m18168x(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: y */
    public static int m18169y(wm8 wm8Var, int i, byte[] bArr, int i2, int i3, l94 l94Var, C3846zu c3846zu) throws InvalidProtocolBufferException {
        Object objNewInstance = wm8Var.newInstance();
        wm8 wm8Var2 = wm8Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        C3846zu c3846zu2 = c3846zu;
        int iM18134X = m18134X(objNewInstance, wm8Var2, bArr2, i2, i4, c3846zu2);
        wm8Var2.makeImmutable(objNewInstance);
        c3846zu2.f72166c = objNewInstance;
        l94Var.add(objNewInstance);
        while (iM18134X < i4) {
            C3846zu c3846zu3 = c3846zu2;
            int i5 = i4;
            int iM18116D = m18116D(bArr2, iM18134X, c3846zu3);
            if (i != c3846zu3.f72164a) {
                break;
            }
            byte[] bArr3 = bArr2;
            wm8 wm8Var3 = wm8Var2;
            Object objNewInstance2 = wm8Var3.newInstance();
            iM18134X = m18134X(objNewInstance2, wm8Var3, bArr3, iM18116D, i5, c3846zu3);
            wm8Var2 = wm8Var3;
            bArr2 = bArr3;
            i4 = i5;
            c3846zu2 = c3846zu3;
            wm8Var2.makeImmutable(objNewInstance2);
            c3846zu2.f72166c = objNewInstance2;
            l94Var.add(objNewInstance2);
        }
        return iM18134X;
    }

    /* JADX INFO: renamed from: z */
    public static int m18170z(byte[] bArr, int i, C3846zu c3846zu) throws InvalidProtocolBufferException {
        int iM18116D = m18116D(bArr, i, c3846zu);
        int i2 = c3846zu.f72164a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.m6419e();
        }
        if (i2 == 0) {
            c3846zu.f72166c = "";
            return iM18116D;
        }
        c3846zu.f72166c = new String(bArr, iM18116D, i2, o94.f54077a);
        return iM18116D + i2;
    }

    /* JADX INFO: renamed from: I */
    public String mo433I() {
        return null;
    }

    /* JADX INFO: renamed from: K */
    public String mo13907K() {
        return null;
    }
}
