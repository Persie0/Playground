package p000;

import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.common.ParserException;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.impl.C0773b;
import coil.memory.MemoryCache$Key;
import com.facebook.internal.GamingAction;
import com.google.android.material.R$styleable;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.iterable.iterableapi.IterableFirebaseMessagingService;
import com.iterable.iterableapi.IterableNotificationWorker;
import com.lingq.feature.reader.old.ReaderFragment;
import java.io.ByteArrayInputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes2.dex */
public class vqb implements fw5, ph7, xl0, al1, gl9, am0, fm1, py7, wq5 {

    /* JADX INFO: renamed from: c */
    public static volatile vqb f65800c;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65801a;

    /* JADX INFO: renamed from: b */
    public Object f65802b;

    public vqb(String str, Bundle bundle) {
        Uri uriM3956j;
        this.f65801a = 9;
        bundle = bundle == null ? new Bundle() : bundle;
        GamingAction[] gamingActionArrValues = GamingAction.values();
        ArrayList arrayList = new ArrayList(gamingActionArrValues.length);
        for (GamingAction gamingAction : gamingActionArrValues) {
            arrayList.add(gamingAction.getRawValue());
        }
        if (arrayList.contains(str)) {
            sy2 sy2Var = sy2.f61585a;
            uriM3956j = bna.m3956j(String.format("%s", Arrays.copyOf(new Object[]{"fb.gg"}, 1)), "/dialog/".concat(str), bundle);
        } else {
            uriM3956j = bna.m3956j(AbstractC3695vr.m23503n(), sy2.m21769d() + "/dialog/" + str, bundle);
        }
        this.f65802b = uriM3956j;
    }

    /* JADX INFO: renamed from: D */
    public static vqb m23466D(byte[] bArr) {
        return new vqb(new ByteArrayInputStream(bArr), 4);
    }

    /* JADX INFO: renamed from: E */
    public static vqb m23467E() {
        if (f65800c == null) {
            synchronized (vqb.class) {
                try {
                    if (f65800c == null) {
                        f65800c = new vqb(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f65800c;
    }

    /* JADX INFO: renamed from: t */
    public static vqb m23468t(Context context, int i) {
        xwc.m24774l("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateListM19054x = pb1.m19054x(context, typedArrayObtainStyledAttributes, R$styleable.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateListM19054x2 = pb1.m19054x(context, typedArrayObtainStyledAttributes, R$styleable.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateListM19054x3 = pb1.m19054x(context, typedArrayObtainStyledAttributes, R$styleable.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialCalendarItem_itemStrokeWidth, 0);
        r39 r39VarM19627a = r39.m20280g(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).m19627a();
        typedArrayObtainStyledAttributes.recycle();
        return new vqb(colorStateListM19054x, colorStateListM19054x2, colorStateListM19054x3, dimensionPixelSize, r39VarM19627a, rect);
    }

    /* JADX INFO: renamed from: A */
    public void m23469A(wx5 wx5Var) {
        this.f65802b = wx5Var;
    }

    /* JADX INFO: renamed from: B */
    public void m23470B(int i, long j, long j2) throws ParserException {
        zs5 zs5Var = (zs5) this.f65802b;
        zs5Var.f72091j0.getClass();
        if (i == 160) {
            zs5Var.f72070Y = false;
            zs5Var.f72071Z = 0L;
            return;
        }
        if (i == 174) {
            ys5 ys5Var = new ys5();
            ys5Var.f70413n = -1;
            ys5Var.f70414o = -1;
            ys5Var.f70415p = -1;
            ys5Var.f70416q = -1;
            ys5Var.f70417r = -1;
            ys5Var.f70418s = 0;
            ys5Var.f70419t = -1;
            ys5Var.f70420u = 0.0f;
            ys5Var.f70421v = 0.0f;
            ys5Var.f70422w = 0.0f;
            ys5Var.f70423x = null;
            ys5Var.f70424y = -1;
            ys5Var.f70425z = false;
            ys5Var.f70371A = -1;
            ys5Var.f70372B = -1;
            ys5Var.f70373C = -1;
            ys5Var.f70374D = DescriptorProtos.Edition.EDITION_2023_VALUE;
            ys5Var.f70375E = 200;
            ys5Var.f70376F = -1.0f;
            ys5Var.f70377G = -1.0f;
            ys5Var.f70378H = -1.0f;
            ys5Var.f70379I = -1.0f;
            ys5Var.f70380J = -1.0f;
            ys5Var.f70381K = -1.0f;
            ys5Var.f70382L = -1.0f;
            ys5Var.f70383M = -1.0f;
            ys5Var.f70384N = -1.0f;
            ys5Var.f70385O = -1.0f;
            ys5Var.f70387Q = 1;
            ys5Var.f70388R = -1;
            ys5Var.f70389S = 8000;
            ys5Var.f70390T = 0L;
            ys5Var.f70391U = 0L;
            ys5Var.f70393W = false;
            ys5Var.f70395Y = true;
            ys5Var.f70396Z = "eng";
            zs5Var.f72106y = ys5Var;
            ys5Var.f70397a = zs5Var.f72104w;
            return;
        }
        if (i == 183) {
            if (zs5Var.f72107z) {
                return;
            }
            zs5Var.m25761g(i);
            zs5Var.f72051F = -1;
            zs5Var.f72052G = -1L;
            zs5Var.f72053H = -1L;
            return;
        }
        if (i == 187) {
            if (zs5Var.f72107z) {
                return;
            }
            zs5Var.m25761g(i);
            zs5Var.f72050E = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            zs5Var.f72046A = -1;
            zs5Var.f72047B = -1L;
            return;
        }
        if (i == 20533) {
            zs5Var.m25762h(i);
            zs5Var.f72106y.f70408i = true;
            return;
        }
        if (i == 21968) {
            zs5Var.m25762h(i);
            zs5Var.f72106y.f70425z = true;
            return;
        }
        if (i == 408125543) {
            long j3 = zs5Var.f72100s;
            if (j3 != -1 && j3 != j) {
                throw ParserException.m2516a(null, "Multiple Segment elements not supported");
            }
            zs5Var.f72100s = j;
            zs5Var.f72099r = j2;
            return;
        }
        if (i == 475249515) {
            if (zs5Var.f72107z) {
                return;
            }
            zs5Var.f72049D = true;
        } else if (i == 524531317 && !zs5Var.f72107z) {
            if (zs5Var.f72078d && zs5Var.f72056K != -1) {
                zs5Var.f72055J = true;
            } else {
                zs5Var.f72091j0.mo2558q(new h60(zs5Var.f72103v));
                zs5Var.f72107z = true;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m23471C(int i, String str) throws ParserException {
        zs5 zs5Var = (zs5) this.f65802b;
        if (i == 134) {
            zs5Var.m25762h(i);
            zs5Var.f72106y.f70401c = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                zs5Var.f72104w = str.equals("webm");
                return;
            }
            throw ParserException.m2516a(null, "DocType " + str + " not supported");
        }
        if (i == 21358) {
            zs5Var.m25762h(i);
            zs5Var.f72106y.f70399b = str;
        } else {
            if (i != 2274716) {
                return;
            }
            zs5Var.m25762h(i);
            zs5Var.f72106y.f70396Z = str;
        }
    }

    /* JADX INFO: renamed from: F */
    public void m23472F(q41 q41Var) {
        ((CopyOnWriteArrayList) this.f65802b).add(0, q41Var);
    }

    @Override // p000.gl9
    /* JADX INFO: renamed from: a */
    public void mo12100a(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map map) {
        ((C3126ix) this.f65802b).m14177m(memoryCache$Key, bitmap, map, AbstractC3122is.m14104r(bitmap));
    }

    @Override // p000.wq5
    /* JADX INFO: renamed from: b */
    public void mo9555b(String str) {
        str.getClass();
        ((vi3) this.f65802b).invoke(new ja8(str));
    }

    @Override // p000.al1
    /* JADX INFO: renamed from: c */
    public int mo534c() {
        return ((ContentInfo) this.f65802b).getSource();
    }

    @Override // p000.fm1
    public Object convert(Object obj) {
        m88 m88Var = (m88) obj;
        m88Var.getClass();
        if (m88Var.mo3001b() != 0) {
            return ((fm1) this.f65802b).convert(m88Var);
        }
        return null;
    }

    @Override // p000.al1
    /* JADX INFO: renamed from: d */
    public ClipData mo535d() {
        return ((ContentInfo) this.f65802b).getClip();
    }

    @Override // p000.fw5
    /* JADX INFO: renamed from: e */
    public boolean mo12237e(hw5 hw5Var, MenuItem menuItem) {
        InterfaceC0008a6 interfaceC0008a6 = ((ActionMenuView) this.f65802b).f1118U;
        if (interfaceC0008a6 == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((nr9) interfaceC0008a6).f53173a).f1177e0.f61249c).iterator();
        while (it.hasNext()) {
            if (((ce3) it.next()).f9965a.m2181p()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.ph7
    /* JADX INFO: renamed from: f */
    public long mo12788f(j84 j84Var, long j, LayoutDirection layoutDirection, long j2) {
        j84Var.getClass();
        layoutDirection.getClass();
        e28 e28Var = (e28) this.f65802b;
        int i = (int) (j2 >> 32);
        int iM15945h = l70.m15945h(ss5.m21693T(Float.intBitsToFloat((int) (e28Var.m10803d() >> 32)) - (i / 2.0f)), 0, ((int) (j >> 32)) - i);
        int i2 = (int) (j2 & 4294967295L);
        int iM21693T = ss5.m21693T((e28Var.f36621b - i2) - 8.0f);
        int iM21693T2 = ss5.m21693T(e28Var.f36623d + 8.0f);
        if (iM21693T < 0) {
            iM21693T = Math.min(iM21693T2, Math.max(0, ((int) (j & 4294967295L)) - i2));
        }
        return (((long) iM15945h) << 32) | (((long) iM21693T) & 4294967295L);
    }

    @Override // p000.xl0
    /* JADX INFO: renamed from: g */
    public Type mo3354g() {
        return (Type) this.f65802b;
    }

    @Override // p000.xl0
    /* JADX INFO: renamed from: h */
    public Object mo3355h(br6 br6Var) {
        yb1 yb1Var = new yb1(br6Var);
        br6Var.mo4152r(new web(yb1Var));
        return yb1Var;
    }

    @Override // p000.gl9
    /* JADX INFO: renamed from: i */
    public bw5 mo12106i(MemoryCache$Key memoryCache$Key) {
        return null;
    }

    @Override // p000.al1
    /* JADX INFO: renamed from: j */
    public int mo536j() {
        return ((ContentInfo) this.f65802b).getFlags();
    }

    @Override // p000.wq5
    /* JADX INFO: renamed from: k */
    public void mo9557k(int i) {
        if (i == 3) {
            ((vi3) this.f65802b).invoke(ia8.f43862a);
        }
    }

    @Override // p000.am0
    /* JADX INFO: renamed from: l */
    public void mo553l(ul0 ul0Var, i88 i88Var) {
        boolean z = i88Var.f43689a.f45200L;
        sm0 sm0Var = (sm0) this.f65802b;
        if (z) {
            sm0Var.resumeWith(i88Var.f43690b);
        } else {
            sm0Var.resumeWith(new Result.Failure(new HttpException(i88Var)));
        }
    }

    @Override // p000.al1
    /* JADX INFO: renamed from: m */
    public ContentInfo mo537m() {
        return (ContentInfo) this.f65802b;
    }

    @Override // p000.gl9
    /* JADX INFO: renamed from: n */
    public void mo12109n(int i) {
    }

    /* JADX INFO: renamed from: o */
    public void m23473o(mc3 mc3Var) {
        ArrayList arrayList = (ArrayList) this.f65802b;
        if (mc3Var instanceof xl6) {
            arrayList.add(mc3Var);
        } else {
            if (!(mc3Var instanceof bg1)) {
                gm5.m12750e();
                return;
            }
            Iterator it = ((bg1) mc3Var).f8488a.iterator();
            while (it.hasNext()) {
                arrayList.add((xl6) it.next());
            }
        }
    }

    @Override // p000.am0
    /* JADX INFO: renamed from: p */
    public void mo554p(ul0 ul0Var, Throwable th) {
        ((sm0) this.f65802b).resumeWith(new Result.Failure(th));
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0297  */
    /* JADX INFO: renamed from: q */
    public void m23474q(int i, int i2, iy2 iy2Var) throws ParserException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        zs5 zs5Var = (zs5) this.f65802b;
        doa doaVar = zs5Var.f72074b;
        SparseArray sparseArray = zs5Var.f72076c;
        k47 k47Var = zs5Var.f72092k;
        k47 k47Var2 = zs5Var.f72088i;
        int i14 = 2;
        int i15 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (zs5Var.f72060O != 2) {
                    return;
                }
                ys5 ys5Var = (ys5) sparseArray.get(zs5Var.f72066U);
                int i16 = zs5Var.f72069X;
                k47 k47Var3 = zs5Var.f72097p;
                if (i16 != 4 || !"V_VP9".equals(ys5Var.f70401c)) {
                    iy2Var.mo13082k(i2);
                    return;
                } else {
                    k47Var3.m14815J(i2);
                    iy2Var.readFully(k47Var3.f46700a, 0, i2);
                    return;
                }
            }
            if (i == 16877) {
                zs5Var.m25762h(i);
                ys5 ys5Var2 = zs5Var.f72106y;
                int i17 = ys5Var2.f70407h;
                if (i17 != 1685485123 && i17 != 1685480259) {
                    iy2Var.mo13082k(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                ys5Var2.f70386P = bArr;
                iy2Var.readFully(bArr, 0, i2);
                return;
            }
            if (i == 16981) {
                zs5Var.m25762h(i);
                byte[] bArr2 = new byte[i2];
                zs5Var.f72106y.f70409j = bArr2;
                iy2Var.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                iy2Var.readFully(bArr3, 0, i2);
                zs5Var.m25762h(i);
                zs5Var.f72106y.f70410k = new m8a(1, bArr3, 0, 0);
                return;
            }
            if (i == 21419) {
                Arrays.fill(k47Var.f46700a, (byte) 0);
                iy2Var.readFully(k47Var.f46700a, 4 - i2, i2);
                k47Var.m14818M(0);
                zs5Var.f72046A = (int) k47Var.m14807B();
                return;
            }
            if (i == 25506) {
                zs5Var.m25762h(i);
                byte[] bArr4 = new byte[i2];
                zs5Var.f72106y.f70411l = bArr4;
                iy2Var.readFully(bArr4, 0, i2);
                return;
            }
            if (i != 30322) {
                throw ParserException.m2516a(null, "Unexpected id: " + i);
            }
            zs5Var.m25762h(i);
            byte[] bArr5 = new byte[i2];
            zs5Var.f72106y.f70423x = bArr5;
            iy2Var.readFully(bArr5, 0, i2);
            return;
        }
        int i18 = 8;
        if (zs5Var.f72060O == 0) {
            zs5Var.f72066U = (int) doaVar.m10558g(iy2Var, false, true, 8);
            zs5Var.f72067V = doaVar.f35973c;
            zs5Var.f72062Q = -9223372036854775807L;
            zs5Var.f72060O = 1;
            k47Var2.m14815J(0);
        }
        ys5 ys5Var3 = (ys5) sparseArray.get(zs5Var.f72066U);
        if (ys5Var3 == null) {
            iy2Var.mo13082k(i2 - zs5Var.f72067V);
            zs5Var.f72060O = 0;
            return;
        }
        ys5Var3.f70398a0.getClass();
        if (zs5Var.f72060O == 1) {
            zs5Var.m25765l(iy2Var, 3);
            int i19 = (k47Var2.f46700a[2] & 6) >> 1;
            if (i19 == 0) {
                zs5Var.f72064S = 1;
                int[] iArr2 = zs5Var.f72065T;
                if (iArr2 == null) {
                    iArr2 = new int[1];
                } else if (iArr2.length < 1) {
                    iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                }
                zs5Var.f72065T = iArr2;
                iArr2[0] = (i2 - zs5Var.f72067V) - 3;
            } else {
                zs5Var.m25765l(iy2Var, 4);
                int i20 = (k47Var2.f46700a[3] & 255) + 1;
                zs5Var.f72064S = i20;
                int[] iArr3 = zs5Var.f72065T;
                if (iArr3 == null) {
                    iArr3 = new int[i20];
                    i3 = 4;
                } else {
                    i3 = 4;
                    if (iArr3.length < i20) {
                        iArr3 = new int[Math.max(iArr3.length * 2, i20)];
                    }
                }
                zs5Var.f72065T = iArr3;
                if (i19 == 2) {
                    int i21 = (i2 - zs5Var.f72067V) - 4;
                    int i22 = zs5Var.f72064S;
                    Arrays.fill(iArr3, 0, i22, i21 / i22);
                } else {
                    if (i19 == 1) {
                        int i23 = 0;
                        int i24 = 0;
                        int i25 = i3;
                        while (true) {
                            i10 = zs5Var.f72064S - 1;
                            iArr = zs5Var.f72065T;
                            if (i23 >= i10) {
                                break;
                            }
                            iArr[i23] = 0;
                            while (true) {
                                i11 = i25 + 1;
                                zs5Var.m25765l(iy2Var, i11);
                                int i26 = k47Var2.f46700a[i25] & 255;
                                int[] iArr4 = zs5Var.f72065T;
                                i12 = iArr4[i23] + i26;
                                iArr4[i23] = i12;
                                if (i26 != 255) {
                                    break;
                                } else {
                                    i25 = i11;
                                }
                            }
                            i24 += i12;
                            i23++;
                            i25 = i11;
                        }
                        iArr[i10] = ((i2 - zs5Var.f72067V) - i25) - i24;
                    } else {
                        if (i19 != 3) {
                            throw ParserException.m2516a(null, "Unexpected lacing value: " + i19);
                        }
                        int i27 = 0;
                        int i28 = 0;
                        int i29 = i3;
                        while (true) {
                            int i30 = zs5Var.f72064S - 1;
                            int[] iArr5 = zs5Var.f72065T;
                            if (i27 >= i30) {
                                i4 = i14;
                                i5 = i15;
                                iArr5[i30] = ((i2 - zs5Var.f72067V) - i29) - i28;
                                break;
                            }
                            iArr5[i27] = i15;
                            int i31 = i29 + 1;
                            zs5Var.m25765l(iy2Var, i31);
                            if (k47Var2.f46700a[i29] == 0) {
                                throw ParserException.m2516a(null, "No valid varint length mask found");
                            }
                            int i32 = i15;
                            while (true) {
                                if (i32 >= i18) {
                                    i6 = i18;
                                    i7 = i14;
                                    i8 = i15;
                                    j = 0;
                                    i9 = i31;
                                    break;
                                }
                                i6 = i18;
                                int i33 = 1 << (7 - i32);
                                i8 = i15;
                                if ((k47Var2.f46700a[i29] & i33) != 0) {
                                    i9 = i31 + i32;
                                    zs5Var.m25765l(iy2Var, i9);
                                    i7 = i14;
                                    j = (~i33) & k47Var2.f46700a[i29] & 255;
                                    while (i31 < i9) {
                                        j = (j << i6) | ((long) (k47Var2.f46700a[i31] & 255));
                                        i31++;
                                    }
                                    if (i27 <= 0) {
                                        break;
                                    }
                                    j -= (1 << ((i32 * 7) + 6)) - 1;
                                    break;
                                }
                                i32++;
                                i15 = i8;
                                i18 = i6;
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                throw ParserException.m2516a(null, "EBML lacing sample size out of range.");
                            }
                            int i34 = (int) j;
                            int[] iArr6 = zs5Var.f72065T;
                            if (i27 != 0) {
                                i34 += iArr6[i27 - 1];
                            }
                            iArr6[i27] = i34;
                            i28 += i34;
                            i27++;
                            i29 = i9;
                            i15 = i8;
                            i18 = i6;
                            i14 = i7;
                        }
                    }
                    byte[] bArr6 = k47Var2.f46700a;
                    zs5Var.f72061P = zs5Var.m25767n((bArr6[1] & 255) | (bArr6[i5] << 8)) + zs5Var.f72058M;
                    if (ys5Var3.f70404e != 1 || (i == 163 && (k47Var2.f46700a[i4] & 128) == 128)) {
                        i13 = 1;
                    } else {
                        i13 = i5;
                    }
                    zs5Var.f72068W = i13;
                    zs5Var.f72060O = i4;
                    zs5Var.f72063R = i5;
                }
            }
            i4 = 2;
            i5 = 0;
            byte[] bArr7 = k47Var2.f46700a;
            zs5Var.f72061P = zs5Var.m25767n((bArr7[1] & 255) | (bArr7[i5] << 8)) + zs5Var.f72058M;
            if (ys5Var3.f70404e != 1) {
                i13 = 1;
            } else {
                i13 = 1;
            }
            zs5Var.f72068W = i13;
            zs5Var.f72060O = i4;
            zs5Var.f72063R = i5;
        }
        if (i == 163) {
            while (true) {
                int i35 = zs5Var.f72063R;
                if (i35 >= zs5Var.f72064S) {
                    zs5Var.f72060O = 0;
                    return;
                }
                zs5Var.m25763i(ys5Var3, ((long) ((zs5Var.f72063R * ys5Var3.f70405f) / DescriptorProtos.Edition.EDITION_2023_VALUE)) + zs5Var.f72061P, zs5Var.f72068W, zs5Var.m25768o(iy2Var, ys5Var3, zs5Var.f72065T[i35], false), 0);
                zs5Var.f72063R++;
            }
        } else {
            while (true) {
                int i36 = zs5Var.f72063R;
                if (i36 >= zs5Var.f72064S) {
                    return;
                }
                int[] iArr7 = zs5Var.f72065T;
                iArr7[i36] = zs5Var.m25768o(iy2Var, ys5Var3, iArr7[i36], true);
                zs5Var.f72063R++;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public xx5 m23475r() {
        return new xx5((wx5) this.f65802b);
    }

    @Override // p000.fw5
    /* JADX INFO: renamed from: s */
    public void mo12238s(hw5 hw5Var) {
        web webVar = ((ActionMenuView) this.f65802b).f1113P;
        if (webVar != null) {
            webVar.mo12238s(hw5Var);
        }
    }

    public String toString() {
        switch (this.f65801a) {
            case 8:
                return "ContentInfoCompat{" + ((ContentInfo) this.f65802b) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m23476u(int i, long j) throws ParserException {
        zs5 zs5Var = (zs5) this.f65802b;
        if (i == 240) {
            if (zs5Var.f72107z) {
                return;
            }
            zs5Var.m25761g(i);
            if (zs5Var.f72053H == -1) {
                zs5Var.f72053H = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (zs5Var.f72107z) {
                return;
            }
            zs5Var.m25761g(i);
            if (zs5Var.f72052G == -1) {
                zs5Var.f72052G = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw ParserException.m2516a(null, "ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw ParserException.m2516a(null, "ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case 131:
                int i2 = (int) j;
                if (i2 == 1) {
                    zs5Var.m25762h(i);
                    zs5Var.f72106y.f70404e = 2;
                    return;
                }
                if (i2 == 2) {
                    zs5Var.m25762h(i);
                    zs5Var.f72106y.f70404e = 1;
                    return;
                } else if (i2 == 17) {
                    zs5Var.m25762h(i);
                    zs5Var.f72106y.f70404e = 3;
                    return;
                } else if (i2 != 33) {
                    zs5Var.m25762h(i);
                    zs5Var.f72106y.f70404e = -1;
                    return;
                } else {
                    zs5Var.m25762h(i);
                    zs5Var.f72106y.f70404e = 5;
                    return;
                }
            case 136:
                zs5Var.m25762h(i);
                zs5Var.f72106y.f70395Y = j == 1;
                return;
            case 155:
                zs5Var.f72062Q = zs5Var.m25767n(j);
                return;
            case 159:
                zs5Var.m25762h(i);
                zs5Var.f72106y.f70387Q = (int) j;
                return;
            case 176:
                zs5Var.m25762h(i);
                zs5Var.f72106y.f70413n = (int) j;
                return;
            case 179:
                if (zs5Var.f72107z) {
                    return;
                }
                zs5Var.m25761g(i);
                zs5Var.f72050E = zs5Var.m25767n(j);
                return;
            case 186:
                zs5Var.m25762h(i);
                zs5Var.f72106y.f70414o = (int) j;
                return;
            case 215:
                zs5Var.m25762h(i);
                zs5Var.f72106y.f70403d = (int) j;
                return;
            case 231:
                zs5Var.f72058M = zs5Var.m25767n(j);
                return;
            case 238:
                zs5Var.f72069X = (int) j;
                return;
            case 247:
                if (zs5Var.f72107z) {
                    return;
                }
                zs5Var.m25761g(i);
                zs5Var.f72051F = (int) j;
                return;
            case 251:
                zs5Var.f72070Y = true;
                return;
            case 16871:
                zs5Var.m25762h(i);
                zs5Var.f72106y.f70407h = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw ParserException.m2516a(null, "ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw ParserException.m2516a(null, "DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw ParserException.m2516a(null, "EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw ParserException.m2516a(null, "ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw ParserException.m2516a(null, "AESSettingsCipherMode " + j + " not supported");
            case 21420:
                zs5Var.f72047B = j + zs5Var.f72100s;
                return;
            case 21432:
                int i3 = (int) j;
                zs5Var.m25762h(i);
                if (i3 == 0) {
                    zs5Var.f72106y.f70424y = 0;
                    return;
                }
                if (i3 == 1) {
                    zs5Var.f72106y.f70424y = 2;
                    return;
                } else if (i3 == 3) {
                    zs5Var.f72106y.f70424y = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    zs5Var.f72106y.f70424y = 3;
                    return;
                }
            case 21680:
                zs5Var.m25762h(i);
                zs5Var.f72106y.f70416q = (int) j;
                return;
            case 21682:
                zs5Var.m25762h(i);
                zs5Var.f72106y.f70418s = (int) j;
                return;
            case 21690:
                zs5Var.m25762h(i);
                zs5Var.f72106y.f70417r = (int) j;
                return;
            case 21930:
                zs5Var.m25762h(i);
                zs5Var.f72106y.f70394X = j == 1;
                return;
            case 21938:
                zs5Var.m25762h(i);
                ys5 ys5Var = zs5Var.f72106y;
                ys5Var.f70425z = true;
                ys5Var.f70415p = (int) j;
                return;
            case 21998:
                zs5Var.m25762h(i);
                zs5Var.f72106y.f70406g = (int) j;
                return;
            case 22186:
                zs5Var.m25762h(i);
                zs5Var.f72106y.f70390T = j;
                return;
            case 22203:
                zs5Var.m25762h(i);
                zs5Var.f72106y.f70391U = j;
                return;
            case 25188:
                zs5Var.m25762h(i);
                zs5Var.f72106y.f70388R = (int) j;
                return;
            case 30114:
                zs5Var.f72071Z = j;
                return;
            case 30321:
                zs5Var.m25762h(i);
                int i4 = (int) j;
                if (i4 == 0) {
                    zs5Var.f72106y.f70419t = 0;
                    return;
                }
                if (i4 == 1) {
                    zs5Var.f72106y.f70419t = 1;
                    return;
                } else if (i4 == 2) {
                    zs5Var.f72106y.f70419t = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    zs5Var.f72106y.f70419t = 3;
                    return;
                }
            case 2352003:
                zs5Var.m25762h(i);
                zs5Var.f72106y.f70405f = (int) j;
                return;
            case 2807729:
                zs5Var.f72101t = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        zs5Var.m25762h(i);
                        int i5 = (int) j;
                        if (i5 == 1) {
                            zs5Var.f72106y.f70373C = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            zs5Var.f72106y.f70373C = 1;
                            return;
                        }
                    case 21946:
                        zs5Var.m25762h(i);
                        int iM12451g = ga1.m12451g((int) j);
                        if (iM12451g != -1) {
                            zs5Var.f72106y.f70372B = iM12451g;
                            return;
                        }
                        return;
                    case 21947:
                        zs5Var.m25762h(i);
                        zs5Var.f72106y.f70425z = true;
                        int iM12450f = ga1.m12450f((int) j);
                        if (iM12450f != -1) {
                            zs5Var.f72106y.f70371A = iM12450f;
                            return;
                        }
                        return;
                    case 21948:
                        zs5Var.m25762h(i);
                        zs5Var.f72106y.f70374D = (int) j;
                        return;
                    case 21949:
                        zs5Var.m25762h(i);
                        zs5Var.f72106y.f70375E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m23477v(int i) {
        ReaderFragment readerFragment = (ReaderFragment) this.f65802b;
        bh4[] bh4VarArr = ReaderFragment.f28218P0;
        readerFragment.m9290W0().m9341u3(i, true);
    }

    /* JADX INFO: renamed from: w */
    public fs2 m23478w() {
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) this.f65802b;
        try {
            return fs2.m12050z(byteArrayInputStream, ox2.m18561a());
        } finally {
            byteArrayInputStream.close();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m23479x(Bundle bundle, web webVar) {
        try {
            tx6 tx6Var = (tx6) new tx6(IterableNotificationWorker.class).m15008g(IterableNotificationWorker.m6892f(bundle));
            OutOfQuotaPolicy outOfQuotaPolicy = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
            outOfQuotaPolicy.getClass();
            p8b p8bVar = tx6Var.f46873c;
            p8bVar.f55788q = true;
            p8bVar.f55789r = outOfQuotaPolicy;
            ux6 ux6Var = (ux6) tx6Var.m15004a();
            ((C0773b) this.f65802b).m2912a(ux6Var);
            UUID uuid = ux6Var.f49309a;
            eh0.m11133m("IterableNotificationWorkScheduler", "Notification work scheduled: " + uuid);
            eh0.m11133m("itblFCMMessagingService", "Notification work scheduled: " + uuid);
        } catch (Exception e) {
            eh0.m11136q("IterableNotificationWorkScheduler", "Failed to schedule notification work", e);
            eh0.m11136q("itblFCMMessagingService", "Failed to schedule notification work, falling back to immediate posting", e);
            IterableFirebaseMessagingService.m6891h((FirebaseMessagingService) webVar.f66742a, bundle);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m23480y(Object obj) {
        ((oa2) this.f65802b).m22389k(obj);
    }

    /* JADX INFO: renamed from: z */
    public void m23481z(Exception exc) {
        ((oa2) this.f65802b).mo20435l(exc);
    }

    public vqb(int i) {
        this.f65801a = i;
        switch (i) {
            case 3:
                this.f65802b = new ArrayList();
                break;
            case 19:
                this.f65802b = new HashSet();
                break;
            case 21:
                break;
            default:
                this.f65802b = new CopyOnWriteArrayList();
                break;
        }
    }

    public vqb(xf2 xf2Var) {
        this.f65801a = 26;
        xf2Var.getClass();
        this.f65802b = xf2Var;
    }

    public vqb(lm4 lm4Var) {
        this.f65801a = 28;
        lm4Var.getClass();
        this.f65802b = lm4Var;
    }

    public vqb(w3a w3aVar) {
        this.f65801a = 14;
        w3aVar.getClass();
        this.f65802b = w3aVar;
    }

    public vqb(or0 or0Var) {
        this.f65801a = 12;
        or0Var.getClass();
        this.f65802b = or0Var;
    }

    public vqb(mu1 mu1Var) {
        this.f65801a = 6;
        mu1Var.getClass();
        this.f65802b = mu1Var;
    }

    public vqb(s7b s7bVar) {
        this.f65801a = 16;
        s7bVar.getClass();
        this.f65802b = s7bVar;
    }

    public vqb(vma vmaVar) {
        this.f65801a = 23;
        vmaVar.getClass();
        this.f65802b = vmaVar;
    }

    public vqb(lj2 lj2Var) {
        this.f65801a = 15;
        lj2Var.getClass();
        this.f65802b = lj2Var;
    }

    public vqb(xy5 xy5Var) {
        this.f65801a = 13;
        xy5Var.getClass();
        this.f65802b = xy5Var;
    }

    public vqb(my5 my5Var, sca scaVar) {
        this.f65801a = 24;
        scaVar.getClass();
        this.f65802b = scaVar;
    }

    public vqb(o98 o98Var, oj0 oj0Var, Type type, Annotation[] annotationArr) {
        this.f65801a = 22;
        this.f65802b = o98Var.m17878b(oj0Var, type, annotationArr);
    }

    public /* synthetic */ vqb(Object obj, int i) {
        this.f65801a = i;
        this.f65802b = obj;
    }

    public vqb(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, r39 r39Var, Rect rect) {
        this.f65801a = 5;
        xwc.m24775m(rect.left);
        xwc.m24775m(rect.top);
        xwc.m24775m(rect.right);
        xwc.m24775m(rect.bottom);
        this.f65802b = r39Var;
    }

    public vqb(e28 e28Var) {
        this.f65801a = 2;
        e28Var.getClass();
        this.f65802b = e28Var;
    }

    public vqb(FirebaseMessagingService firebaseMessagingService) {
        this.f65801a = 17;
        C0773b c0773bM2910c = C0773b.m2910c(firebaseMessagingService);
        c0773bM2910c.getClass();
        firebaseMessagingService.getApplicationContext();
        this.f65802b = c0773bM2910c;
    }

    public vqb(ContentInfo contentInfo) {
        this.f65801a = 8;
        contentInfo.getClass();
        this.f65802b = xk1.m24585i(contentInfo);
    }
}
