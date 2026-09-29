package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.compose.animation.core.C0061c;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.C0077c;
import androidx.compose.foundation.gestures.C0100h;
import androidx.compose.foundation.lazy.grid.AbstractC0128a;
import androidx.compose.foundation.lazy.grid.C0129b;
import androidx.compose.foundation.style.C0159d;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.internal.C0282a;
import coil.C0855a;
import coil.compose.C0858a;
import com.lingq.core.achievements.LevelBand;
import com.lingq.core.achievements.R$drawable;
import com.lingq.core.achievements.R$string;
import com.lingq.core.domain.model.milestones.DailyGoalMet;
import com.lingq.core.domain.model.milestones.Milestone;
import com.lingq.core.domain.model.milestones.MilestoneType;
import java.lang.reflect.Array;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.ClassDiscriminatorMode;

/* JADX INFO: loaded from: classes.dex */
public abstract class ss5 {

    /* JADX INFO: renamed from: a */
    public static final Object[] f61353a = new Object[0];

    /* JADX INFO: renamed from: b */
    public static final wu2 f61354b = new wu2(0);

    /* JADX INFO: renamed from: c */
    public static final Object f61355c = new Object();

    /* JADX INFO: renamed from: d */
    public static final mv3 f61356d = new mv3(2);

    /* JADX INFO: renamed from: e */
    public static final C3724wj f61357e = new C3724wj(1022);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f61358f = 0;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f61359g = 0;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f61360h = 0;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f61361i = 0;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f61362j = 0;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f61363k = 0;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f61364l = 0;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ int f61365m = 0;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ int f61366n = 0;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ int f61367o = 0;

    /* JADX INFO: renamed from: A */
    public static final String m21676A(Milestone milestone) {
        milestone.getClass();
        if (vk9.m23380c0(milestone.m8102c(), "daily", false)) {
            return "ic_milestone_daily_goal";
        }
        List listM23365A0 = vk9.m23365A0(milestone.m8102c(), new String[]{"."}, 0, 6);
        if (listM23365A0.size() != 2) {
            return "ic_milestone_daily_goal";
        }
        return "ic_" + u91.m22589G0(listM23365A0) + "_" + u91.m22597O0(listM23365A0);
    }

    /* JADX INFO: renamed from: B */
    public static final long m21677B(int i) {
        switch (i) {
            case 1:
                return d32.m10037f(4278682976L);
            case 2:
                return d32.m10037f(4286341140L);
            case 3:
                return d32.m10037f(4290117664L);
            case 4:
            case 5:
                return d32.m10037f(4294967295L);
            case 6:
                return d32.m10037f(4288124823L);
            case 7:
                return d32.m10037f(4283646501L);
            default:
                return d32.m10037f(4278682976L);
        }
    }

    /* JADX INFO: renamed from: C */
    public static final long m21678C(int i) {
        switch (i) {
            case 1:
                return d32.m10037f(4289583937L);
            case 2:
                return d32.m10037f(4294956544L);
            case 3:
                return d32.m10037f(4294939698L);
            case 4:
                return d32.m10037f(4293467715L);
            case 5:
                return d32.m10037f(4288292527L);
            case 6:
                return d32.m10037f(4287532686L);
            case 7:
                return d32.m10037f(4292589175L);
            default:
                return d32.m10037f(4278682976L);
        }
    }

    /* JADX INFO: renamed from: D */
    public static final int m21679D(Context context, String str) {
        context.getClass();
        int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        Integer numValueOf = Integer.valueOf(identifier);
        if (identifier == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        if (!cl9.m4842Y(str, "ic_level_", false)) {
            return cl9.m4842Y(str, "ic_known_words_", false) ? R$drawable.ic_known_words_30000 : R$drawable.ic_milestone_daily_goal;
        }
        int i = AbstractC2989f5.f38421b[m21689P(vk9.m23398u0(str, "ic_level_")).ordinal()];
        if (i == 1) {
            return R$drawable.ic_level_beginner2;
        }
        if (i == 2) {
            return R$drawable.ic_level_intermediate2;
        }
        if (i == 3) {
            return R$drawable.ic_level_advanced10;
        }
        gm5.m12750e();
        return 0;
    }

    /* JADX INFO: renamed from: E */
    public static final MilestoneType m21680E(Milestone milestone) {
        milestone.getClass();
        if (vk9.m23380c0(milestone.m8102c(), "known_words", false)) {
            return MilestoneType.KnownWords;
        }
        if (vk9.m23380c0(milestone.m8102c(), "level", false)) {
            return MilestoneType.Level;
        }
        if (vk9.m23380c0(milestone.m8102c(), "daily", false) && vk9.m23380c0(milestone.m8102c(), "onfire", false)) {
            return MilestoneType.DailyDoubleGoal;
        }
        return vk9.m23380c0(milestone.m8102c(), "daily", false) ? MilestoneType.DailyGoal : MilestoneType.DailyGoal;
    }

    /* JADX INFO: renamed from: F */
    public static final String m21681F(Context context, Milestone milestone) {
        milestone.getClass();
        context.getClass();
        int i = AbstractC2989f5.f38420a[m21680E(milestone).ordinal()];
        if (i == 1) {
            Locale locale = Locale.getDefault();
            String string = context.getString(R$string.milestones_i_now_know);
            string.getClass();
            return String.format(locale, string, Arrays.copyOf(new Object[]{String.valueOf(milestone.m8100a()), AbstractC3352my.m17093L(context, milestone.m8101b())}, 2));
        }
        if (i == 2) {
            wy5.Companion.getClass();
            wy5 wy5VarM23593b = vy5.m23593b(milestone);
            Locale locale2 = Locale.getDefault();
            String string2 = context.getString(R$string.milestones_im_now_level);
            string2.getClass();
            return String.format(locale2, string2, Arrays.copyOf(new Object[]{AbstractC3423or.m18229N(wy5VarM23593b, context), AbstractC3352my.m17093L(context, milestone.m8101b())}, 2));
        }
        if (i == 3) {
            Locale locale3 = Locale.getDefault();
            String string3 = context.getString(R$string.daily_goal_met_share);
            string3.getClass();
            return String.format(locale3, string3, Arrays.copyOf(new Object[]{AbstractC3352my.m17093L(context, milestone.m8101b())}, 1));
        }
        if (i != 4) {
            gm5.m12750e();
            return null;
        }
        Locale locale4 = Locale.getDefault();
        String string4 = context.getString(R$string.daily_goal_met_share_double);
        string4.getClass();
        return String.format(locale4, string4, Arrays.copyOf(new Object[]{AbstractC3352my.m17093L(context, milestone.m8101b())}, 1));
    }

    /* JADX INFO: renamed from: G */
    public static final String m21682G(DailyGoalMet dailyGoalMet, Context context, String str) {
        dailyGoalMet.getClass();
        context.getClass();
        str.getClass();
        if (dailyGoalMet.m8098b() > 0) {
            String string = context.getString(R$string.streak_milestone);
            string.getClass();
            return String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(dailyGoalMet.m8098b())}, 1));
        }
        if (dailyGoalMet.m8099c()) {
            Locale locale = Locale.getDefault();
            String string2 = context.getString(R$string.daily_goal_met_share_double);
            string2.getClass();
            return String.format(locale, string2, Arrays.copyOf(new Object[]{AbstractC3352my.m17093L(context, str)}, 1));
        }
        Locale locale2 = Locale.getDefault();
        String string3 = context.getString(R$string.daily_goal_met_share);
        string3.getClass();
        return String.format(locale2, string3, Arrays.copyOf(new Object[]{AbstractC3352my.m17093L(context, str)}, 1));
    }

    /* JADX INFO: renamed from: H */
    public static final int m21683H(Context context, int i) {
        context.getClass();
        int identifier = context.getResources().getIdentifier(ux5.m22988k(i, "ic_streak_milestone_"), "drawable", context.getPackageName());
        return identifier != 0 ? identifier : R$drawable.ic_streak_milestone_base;
    }

    /* JADX INFO: renamed from: I */
    public static String m21684I(Throwable th) {
        boolean z;
        if (th == null) {
            return null;
        }
        synchronized (f61355c) {
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    z = false;
                    break;
                }
                try {
                    if (cause instanceof UnknownHostException) {
                        z = true;
                        break;
                    }
                    cause = cause.getCause();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z) {
                return "UnknownHostException (no network)";
            }
            return Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
    }

    /* JADX INFO: renamed from: J */
    public static final String m21685J(Context context, Milestone milestone) {
        milestone.getClass();
        context.getClass();
        int i = AbstractC2989f5.f38420a[m21680E(milestone).ordinal()];
        if (i == 1) {
            Locale locale = Locale.getDefault();
            String string = context.getString(R$string.milestones_n_words);
            string.getClass();
            return String.format(locale, string, Arrays.copyOf(new Object[]{Integer.valueOf(milestone.m8100a())}, 1));
        }
        if (i == 2) {
            wy5.Companion.getClass();
            wy5 wy5VarM23593b = vy5.m23593b(milestone);
            Locale locale2 = Locale.getDefault();
            String string2 = context.getString(R$string.milestones_you_are_now);
            string2.getClass();
            return String.format(locale2, string2, Arrays.copyOf(new Object[]{AbstractC3423or.m18229N(wy5VarM23593b, context)}, 1));
        }
        if (i == 3) {
            Locale locale3 = Locale.getDefault();
            String string3 = context.getString(R$string.milestones_daily_goal_met);
            string3.getClass();
            return String.format(locale3, string3, Arrays.copyOf(new Object[0], 0));
        }
        if (i != 4) {
            gm5.m12750e();
            return null;
        }
        Locale locale4 = Locale.getDefault();
        String string4 = context.getString(R$string.daily_goal_met_doubled);
        string4.getClass();
        return String.format(locale4, string4, Arrays.copyOf(new Object[0], 0));
    }

    /* JADX INFO: renamed from: M */
    public static void m21686M(String str, String str2) {
        synchronized (f61355c) {
            Log.i(str, m21715k(str2, null));
        }
    }

    /* JADX INFO: renamed from: N */
    public static k44 m21687N(dn2 dn2Var, RepeatMode repeatMode, long j, int i) {
        if ((i & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        return new k44(dn2Var, repeatMode, j);
    }

    /* JADX INFO: renamed from: O */
    public static final long m21688O(long j, long j2, float f) {
        float fM18232Q = AbstractC3423or.m18232Q(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float fM18232Q2 = AbstractC3423or.m18232Q(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return (((long) Float.floatToRawIntBits(fM18232Q)) << 32) | (((long) Float.floatToRawIntBits(fM18232Q2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: P */
    public static final LevelBand m21689P(String str) {
        str.getClass();
        if (cl9.m4842Y(str, "beginner", false)) {
            return LevelBand.Beginner;
        }
        return cl9.m4842Y(str, "intermediate", false) ? LevelBand.Intermediate : LevelBand.Advanced;
    }

    /* JADX INFO: renamed from: Q */
    public static int m21690Q(int[] iArr, int i) {
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    /* JADX INFO: renamed from: R */
    public static final C0061c m21691R(String str, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        if (objM22097O == we1.f66679a) {
            objM22097O = new C0061c();
            tj3Var.m22131l0(objM22097O);
        }
        C0061c c0061c = (C0061c) objM22097O;
        c0061c.m752a(tj3Var, 0);
        return c0061c;
    }

    /* JADX INFO: renamed from: S */
    public static int m21692S(double d) {
        if (Double.isNaN(d)) {
            C3386nv.m17626m("Cannot round NaN value.");
            return 0;
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    /* JADX INFO: renamed from: T */
    public static int m21693T(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        C3386nv.m17626m("Cannot round NaN value.");
        return 0;
    }

    /* JADX INFO: renamed from: U */
    public static long m21694U(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        C3386nv.m17626m("Cannot round NaN value.");
        return 0L;
    }

    /* JADX INFO: renamed from: V */
    public static final void m21695V(kz6 kz6Var, int i, Object obj) {
        kz6Var.f48816D[(kz6Var.f48817E - kz6Var.f48818z[kz6Var.f48813A - 1].f41552b) + i] = obj;
    }

    /* JADX INFO: renamed from: W */
    public static final void m21696W(kz6 kz6Var, int i, Object obj, int i2, Object obj2) {
        int i3 = kz6Var.f48817E - kz6Var.f48818z[kz6Var.f48813A - 1].f41552b;
        Object[] objArr = kz6Var.f48816D;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    /* JADX INFO: renamed from: X */
    public static ic9 m21697X() {
        return new ic9(0);
    }

    /* JADX INFO: renamed from: Y */
    public static bg9 m21698Y(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new bg9(f, f2, obj);
    }

    /* JADX INFO: renamed from: Z */
    public static final Object[] m21699Z(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = f61353a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i2);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m21700a(Object obj, String str, e16 e16Var, y27 y27Var, y27 y27Var2, y27 y27Var3, tj3 tj3Var, int i, int i2, int i3) {
        y27 y27Var4 = y27Var3;
        gc0 gc0Var = nj0.f52812g;
        tj3Var.m22113c0(1693837359);
        if ((i3 & 8) != 0) {
            y27Var = null;
        }
        if ((i3 & 32) != 0) {
            y27Var4 = y27Var2;
        }
        g9c g9cVar = x74.f67878a;
        C0855a c0855aM18903m = (C0855a) tj3Var.m22128k(fi5.f39145a);
        if (c0855aM18903m == null) {
            c0855aM18903m = p58.m18903m((Context) tj3Var.m22128k(AbstractC0394f.f4761b));
        }
        int i4 = (i & 112) | 2392584;
        int i5 = ((i >> 27) & 14) | ((i2 << 3) & 112);
        tj3Var.m22113c0(-1481548872);
        C3589sw c3589sw = new C3589sw(obj, g9cVar, c0855aM18903m);
        q18 q18Var = kna.f47564b;
        int i6 = i5 << 15;
        AbstractC3695vr.m23491a(c3589sw, str, e16Var, (y27Var == null && y27Var2 == null && y27Var4 == null) ? C0858a.f10424O : new bb0(y27Var, y27Var4, y27Var2, 19), null, gc0Var, hl1.f42565b, tj3Var, (i4 & 112) | (458752 & i6) | (i6 & 3670016), 0);
        tj3Var.m22139q(false);
        tj3Var.m22139q(false);
    }

    /* JADX INFO: renamed from: a0 */
    public static final Object[] m21701a0(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: b */
    public static final void m21702b(Object obj, String str, e16 e16Var, vi3 vi3Var, jl1 jl1Var, ye1 ye1Var, int i, int i2) {
        gc0 gc0Var = nj0.f52813h;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22113c0(1451072229);
        vi3 vi3Var2 = (i2 & 16) != 0 ? null : vi3Var;
        if ((i2 & 32) != 0) {
            gc0Var = nj0.f52812g;
        }
        gc0 gc0Var2 = gc0Var;
        jl1 jl1Var2 = (i2 & 64) != 0 ? hl1.f42565b : jl1Var;
        g9c g9cVar = x74.f67878a;
        C0855a c0855aM18903m = (C0855a) tj3Var.m22128k(fi5.f39145a);
        if (c0855aM18903m == null) {
            c0855aM18903m = p58.m18903m((Context) tj3Var.m22128k(AbstractC0394f.f4761b));
        }
        int i3 = i << 3;
        int i4 = (i & 112) | 520 | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192);
        tj3Var.m22113c0(2032051394);
        C3589sw c3589sw = new C3589sw(obj, g9cVar, c0855aM18903m);
        int i5 = i4 >> 3;
        AbstractC3695vr.m23491a(c3589sw, str, e16Var, C0858a.f10424O, vi3Var2, gc0Var2, jl1Var2, tj3Var, (i4 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024) | ((((i >> 27) & 14) << 27) & 1879048192), 0);
        tj3Var.m22139q(false);
        tj3Var.m22139q(false);
    }

    /* JADX INFO: renamed from: b0 */
    public static fda m21703b0(int i, int i2, go2 go2Var, int i3) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            go2Var = io2.f44349a;
        }
        return new fda(i, i2, go2Var);
    }

    /* JADX INFO: renamed from: c */
    public static yf4 m21704c(vi3 vi3Var) {
        cf4 cf4Var = df4.f35559d;
        cf4Var.getClass();
        if4 if4Var = new if4();
        kf4 kf4Var = cf4Var.f35560a;
        if4Var.f44040a = kf4Var.f47125a;
        if4Var.f44041b = kf4Var.f47128d;
        if4Var.f44042c = kf4Var.f47126b;
        if4Var.f44043d = kf4Var.f47127c;
        String str = kf4Var.f47129e;
        String str2 = kf4Var.f47130f;
        ClassDiscriminatorMode classDiscriminatorMode = kf4Var.f47132h;
        boolean z = kf4Var.f47131g;
        if4Var.f44044e = cf4Var.f35561b;
        boolean z2 = kf4Var.f47133i;
        vi3Var.invoke(if4Var);
        if (!fa4.m11650l(str, "    ")) {
            C3386nv.m17626m("Indent should not be specified when default printing mode is used");
            return null;
        }
        kf4 kf4Var2 = new kf4(if4Var.f44040a, if4Var.f44042c, if4Var.f44043d, if4Var.f44041b, str, str2, z, classDiscriminatorMode, z2);
        w41 w41Var = if4Var.f44044e;
        w41Var.getClass();
        yf4 yf4Var = new yf4(kf4Var2, w41Var);
        if (w41Var != iy8.f44783a) {
            boolean z3 = kf4Var2.f47132h != ClassDiscriminatorMode.NONE;
            for (Map.Entry entry : ((Map) w41Var.f66365a).entrySet()) {
                z21 z21Var = (z21) entry.getKey();
                zl1 zl1Var = (zl1) entry.getValue();
                if (zl1Var instanceof xl1) {
                    z21Var.getClass();
                    wg8 wg8Var = wg8.f66797a;
                } else {
                    if (!(zl1Var instanceof yl1)) {
                        gm5.m12750e();
                        return null;
                    }
                    vi3 vi3VarM25180b = ((yl1) zl1Var).m25180b();
                    z21Var.getClass();
                    vi3VarM25180b.getClass();
                }
            }
            for (Map.Entry entry2 : ((Map) w41Var.f66366b).entrySet()) {
                z21 z21Var2 = (z21) entry2.getKey();
                for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                    z21 z21Var3 = (z21) entry3.getKey();
                    KSerializer kSerializer = (KSerializer) entry3.getValue();
                    z21Var2.getClass();
                    z21Var3.getClass();
                    kSerializer.getClass();
                    AbstractC3184kh kind = kSerializer.getDescriptor().getKind();
                    if ((kind instanceof vg7) || fa4.m11650l(kind, cy8.f34711y)) {
                        v63.m23136n("Serializer for ", z21Var3.m25414c(), " can't be registered as a subclass for polymorphic serialization because its kind ", kind, " is not concrete. To work with multiple hierarchies, register it as a base class.");
                        return null;
                    }
                    if (z3 && (fa4.m11650l(kind, hl9.f42586z) || fa4.m11650l(kind, hl9.f42583A) || (kind instanceof ak7) || (kind instanceof dy8))) {
                        v63.m23136n("Serializer for ", z21Var3.m25414c(), " of kind ", kind, " cannot be serialized polymorphically with class discriminator.");
                        return null;
                    }
                }
            }
            for (Map.Entry entry4 : ((Map) w41Var.f66367c).entrySet()) {
                z21 z21Var4 = (z21) entry4.getKey();
                vi3 vi3Var2 = (vi3) entry4.getValue();
                z21Var4.getClass();
                vi3Var2.getClass();
                lda.m16119e(1, vi3Var2);
            }
            for (Map.Entry entry5 : ((Map) w41Var.f66369e).entrySet()) {
                z21 z21Var5 = (z21) entry5.getKey();
                vi3 vi3Var3 = (vi3) entry5.getValue();
                z21Var5.getClass();
                vi3Var3.getClass();
                lda.m16119e(1, vi3Var3);
            }
        }
        return yf4Var;
    }

    /* JADX INFO: renamed from: c0 */
    public static final l43 m21705c0(MotionSchemeKeyTokens motionSchemeKeyTokens, ye1 ye1Var) {
        return m21726x(((ms5) ((tj3) ye1Var).m22128k(ps5.f56764b)).f51802d, motionSchemeKeyTokens);
    }

    /* JADX INFO: renamed from: d */
    public static final void m21706d(final zp3 zp3Var, final e16 e16Var, C0129b c0129b, t17 t17Var, InterfaceC3735wu interfaceC3735wu, InterfaceC3624tu interfaceC3624tu, x63 x63Var, boolean z, C0077c c0077c, final vi3 vi3Var, ye1 ye1Var, final int i) {
        final C0129b c0129b2;
        final t17 t17Var2;
        final InterfaceC3735wu interfaceC3735wu2;
        final InterfaceC3624tu interfaceC3624tu2;
        final x63 x63Var2;
        final boolean z2;
        final C0077c c0077c2;
        C0129b c0129b3;
        x63 x63Var3;
        InterfaceC3624tu interfaceC3624tu3;
        C0077c c0077cM24823b;
        InterfaceC3735wu interfaceC3735wu3;
        t17 t17Var3;
        int i2;
        boolean z3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2072102870);
        int i3 = i | (tj3Var.m22120g(zp3Var) ? 4 : 2) | (tj3Var.m22120g(e16Var) ? 32 : 16) | 374959232;
        int i4 = tj3Var.m22124i(vi3Var) ? 4 : 2;
        if (tj3Var.m22099R(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            tj3Var.m22104W();
            int i5 = i & 1;
            p84 p84Var = we1.f66679a;
            if (i5 == 0 || tj3Var.m22084B()) {
                ss4 ss4Var = et4.f37825a;
                Object[] objArr = new Object[0];
                fs6 fs6Var = C0129b.f2467w;
                boolean zM22116e = tj3Var.m22116e(0) | tj3Var.m22116e(0);
                Object objM22097O = tj3Var.m22097O();
                if (zM22116e || objM22097O == p84Var) {
                    objM22097O = new uf4(13);
                    tj3Var.m22131l0(objM22097O);
                }
                c0129b3 = (C0129b) xwc.m24747T(objArr, fs6Var, (ui3) objM22097O, tj3Var, 0);
                x17 x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                C3587su c3587su = eh0.f37238d;
                C3549ru c3549ru = eh0.f37236b;
                f32 f32VarM21341a = sf9.m21341a(tj3Var);
                boolean zM22120g = tj3Var.m22120g(f32VarM21341a);
                Object objM22097O2 = tj3Var.m22097O();
                if (zM22120g || objM22097O2 == p84Var) {
                    objM22097O2 = new C0100h(f32VarM21341a);
                    tj3Var.m22131l0(objM22097O2);
                }
                x63Var3 = (C0100h) objM22097O2;
                interfaceC3624tu3 = c3549ru;
                c0077cM24823b = y07.m24823b(tj3Var);
                interfaceC3735wu3 = c3587su;
                t17Var3 = x17Var;
                i2 = i3 & (-1908867969);
                z3 = true;
            } else {
                tj3Var.m22102U();
                c0129b3 = c0129b;
                interfaceC3624tu3 = interfaceC3624tu;
                x63Var3 = x63Var;
                i2 = i3 & (-1908867969);
                t17Var3 = t17Var;
                interfaceC3735wu3 = interfaceC3735wu;
                z3 = z;
                c0077cM24823b = c0077c;
            }
            tj3Var.m22140r();
            int i6 = (i2 & 14) | 48;
            boolean z4 = (((i6 & 14) ^ 6) > 4 && tj3Var.m22120g(zp3Var)) || (i6 & 6) == 4;
            Object objM22097O3 = tj3Var.m22097O();
            if (z4 || objM22097O3 == p84Var) {
                objM22097O3 = new cq3(new C3794yf(9, zp3Var, interfaceC3624tu3));
                tj3Var.m22131l0(objM22097O3);
            }
            c0129b2 = c0129b3;
            boolean z5 = z3;
            AbstractC0128a.m983a(e16Var, c0129b2, (cq3) objM22097O3, t17Var3, x63Var3, z5, c0077cM24823b, interfaceC3735wu3, interfaceC3624tu3, vi3Var, tj3Var, ((i2 >> 3) & 14) | 12807168, 6 | ((i4 << 3) & 112));
            t17Var2 = t17Var3;
            interfaceC3735wu2 = interfaceC3735wu3;
            c0077c2 = c0077cM24823b;
            z2 = z5;
            x63Var2 = x63Var3;
            interfaceC3624tu2 = interfaceC3624tu3;
        } else {
            tj3Var.m22102U();
            c0129b2 = c0129b;
            t17Var2 = t17Var;
            interfaceC3735wu2 = interfaceC3735wu;
            interfaceC3624tu2 = interfaceC3624tu;
            x63Var2 = x63Var;
            z2 = z;
            c0077c2 = c0077c;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(e16Var, c0129b2, t17Var2, interfaceC3735wu2, interfaceC3624tu2, x63Var2, z2, c0077c2, vi3Var, i) { // from class: hs4

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ e16 f42867b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C0129b f42868c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ t17 f42869d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ InterfaceC3735wu f42870e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ InterfaceC3624tu f42871f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ x63 f42872g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ boolean f42873h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ C0077c f42874i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ vi3 f42875j;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    ss5.m21706d(this.f42866a, this.f42867b, this.f42868c, this.f42869d, this.f42870e, this.f42871f, this.f42872g, this.f42873h, this.f42874i, this.f42875j, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static void m21707d0(String str, String str2) {
        synchronized (f61355c) {
            Log.w(str, m21715k(str2, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x011f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0128  */
    /* JADX WARN: Code duplicated, block: B:90:0x0175  */
    /* JADX WARN: Code duplicated, block: B:93:0x0181  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m21708e(int i, int i2, vj0 vj0Var, ye1 ye1Var, ui3 ui3Var, aj3 aj3Var, e16 e16Var, t17 t17Var, o39 o39Var, boolean z) {
        int i3;
        boolean z2;
        vj0 vj0Var2;
        o39 o39Var2;
        int i4;
        boolean z3;
        t17 t17Var2;
        o39 o39Var3;
        x18 x18VarM22143u;
        boolean z4;
        vj0 vj0VarM23996a;
        boolean z5;
        vj0 vj0Var3;
        t17 t17Var3;
        int i5;
        int i6;
        int i7;
        int i8;
        ui3Var.getClass();
        aj3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1899012517);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= tj3Var.m22122h(z2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    vj0Var2 = vj0Var;
                    int i10 = tj3Var.m22120g(vj0Var2) ? 256 : 128;
                    i3 |= i10;
                } else {
                    vj0Var2 = vj0Var;
                }
                i3 |= i10;
            } else {
                vj0Var2 = vj0Var;
            }
            if ((i & 3072) == 0) {
                o39Var2 = o39Var;
                if ((i2 & 8) == 0 || !tj3Var.m22120g(o39Var2)) {
                    i8 = 1024;
                } else {
                    i8 = 2048;
                }
                i3 |= i8;
            } else {
                o39Var2 = o39Var;
            }
            if ((i & 24576) == 0) {
                i3 |= 8192;
            }
            if ((196608 & i) == 0) {
                if (tj3Var.m22124i(ui3Var)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if (tj3Var.m22124i(aj3Var)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i3 |= i6;
            }
            i4 = i3;
            if ((599187 & i4) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var.m22099R(i4 & 1, z3)) {
                tj3Var.m22104W();
                if ((i & 1) != 0 || tj3Var.m22084B()) {
                    if (i9 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if ((i2 & 4) != 0) {
                        x17 x17Var = wj0.f66899a;
                        vh9 vh9Var = ps5.f56764b;
                        vj0VarM23996a = wj0.m23996a(((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55852f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55854g, aa1.m198b(0.12f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55852f), tj3Var, 4);
                        i4 &= -897;
                    } else {
                        vj0VarM23996a = vj0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                        o39Var2 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64859e;
                    }
                    int i11 = i4 & (-57345);
                    z5 = z4;
                    vj0Var3 = vj0VarM23996a;
                    t17Var3 = wj0.f66899a;
                    i5 = i11;
                } else {
                    tj3Var.m22102U();
                    if ((i2 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                    i5 = i4 & (-57345);
                    t17Var3 = t17Var;
                    z5 = z2;
                    vj0Var3 = vj0Var2;
                }
                o39 o39Var4 = o39Var2;
                tj3Var.m22140r();
                int i12 = i5 << 3;
                AbstractC0231g.m1148a(ui3Var, e16Var, z5, o39Var4, vj0Var3, null, null, t17Var3, aj3Var, tj3Var, ((i5 >> 15) & 14) | (i12 & 112) | (i12 & 896) | (i5 & 7168) | (57344 & (i5 << 6)) | ((i5 << 9) & 1879048192), 352);
                z2 = z5;
                o39Var3 = o39Var4;
                vj0Var2 = vj0Var3;
                t17Var2 = t17Var3;
            } else {
                tj3Var.m22102U();
                t17Var2 = t17Var;
                o39Var3 = o39Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zj0(e16Var, z2, vj0Var2, o39Var3, t17Var2, ui3Var, aj3Var, i, i2);
            }
        }
        i3 |= 48;
        z2 = z;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                vj0Var2 = vj0Var;
                if (tj3Var.m22120g(vj0Var2)) {
                }
                i3 |= i10;
            } else {
                vj0Var2 = vj0Var;
            }
            i3 |= i10;
        } else {
            vj0Var2 = vj0Var;
        }
        if ((i & 3072) == 0) {
            o39Var2 = o39Var;
            if ((i2 & 8) == 0) {
                i8 = 1024;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        } else {
            o39Var2 = o39Var;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            if (tj3Var.m22124i(ui3Var)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((1572864 & i) == 0) {
            if (tj3Var.m22124i(aj3Var)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        i4 = i3;
        if ((599187 & i4) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tj3Var.m22099R(i4 & 1, z3)) {
            tj3Var.m22104W();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if ((i2 & 4) != 0) {
                    x17 x17Var2 = wj0.f66899a;
                    vh9 vh9Var2 = ps5.f56764b;
                    vj0VarM23996a = wj0.m23996a(((ms5) tj3Var.m22128k(vh9Var2)).f51799a.f55852f, ((ms5) tj3Var.m22128k(vh9Var2)).f51799a.f55854g, aa1.m198b(0.12f, ((ms5) tj3Var.m22128k(vh9Var2)).f51799a.f55852f), tj3Var, 4);
                    i4 &= -897;
                } else {
                    vj0VarM23996a = vj0Var2;
                }
                if ((i2 & 8) != 0) {
                    i4 &= -7169;
                    o39Var2 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64859e;
                }
                int i13 = i4 & (-57345);
                z5 = z4;
                vj0Var3 = vj0VarM23996a;
                t17Var3 = wj0.f66899a;
                i5 = i13;
            } else {
                if (i9 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if ((i2 & 4) != 0) {
                    x17 x17Var3 = wj0.f66899a;
                    vh9 vh9Var3 = ps5.f56764b;
                    vj0VarM23996a = wj0.m23996a(((ms5) tj3Var.m22128k(vh9Var3)).f51799a.f55852f, ((ms5) tj3Var.m22128k(vh9Var3)).f51799a.f55854g, aa1.m198b(0.12f, ((ms5) tj3Var.m22128k(vh9Var3)).f51799a.f55852f), tj3Var, 4);
                    i4 &= -897;
                } else {
                    vj0VarM23996a = vj0Var2;
                }
                if ((i2 & 8) != 0) {
                    i4 &= -7169;
                    o39Var2 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64859e;
                }
                int i14 = i4 & (-57345);
                z5 = z4;
                vj0Var3 = vj0VarM23996a;
                t17Var3 = wj0.f66899a;
                i5 = i14;
            }
            o39 o39Var5 = o39Var2;
            tj3Var.m22140r();
            int i15 = i5 << 3;
            AbstractC0231g.m1148a(ui3Var, e16Var, z5, o39Var5, vj0Var3, null, null, t17Var3, aj3Var, tj3Var, ((i5 >> 15) & 14) | (i15 & 112) | (i15 & 896) | (i5 & 7168) | (57344 & (i5 << 6)) | ((i5 << 9) & 1879048192), 352);
            z2 = z5;
            o39Var3 = o39Var5;
            vj0Var2 = vj0Var3;
            t17Var2 = t17Var3;
        } else {
            tj3Var.m22102U();
            t17Var2 = t17Var;
            o39Var3 = o39Var2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zj0(e16Var, z2, vj0Var2, o39Var3, t17Var2, ui3Var, aj3Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static void m21709e0(String str, String str2, Throwable th) {
        synchronized (f61355c) {
            Log.w(str, m21715k(str2, th));
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x0117  */
    /* JADX WARN: Code duplicated, block: B:83:0x011d  */
    /* JADX WARN: Code duplicated, block: B:84:0x012c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0130  */
    /* JADX WARN: Code duplicated, block: B:88:0x0135  */
    /* JADX WARN: Code duplicated, block: B:90:0x0174  */
    /* JADX WARN: Code duplicated, block: B:93:0x0181  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m21710f(e16 e16Var, vj0 vj0Var, o39 o39Var, boolean z, ui3 ui3Var, aj3 aj3Var, ye1 ye1Var, int i, int i2) {
        int i3;
        vj0 vj0Var2;
        o39 o39Var2;
        boolean z2;
        boolean z3;
        tj3 tj3Var;
        vj0 vj0Var3;
        o39 o39Var3;
        boolean z4;
        x18 x18VarM22143u;
        tj3 tj3Var2;
        vj0 vj0VarM23996a;
        o39 o39Var4;
        vj0 vj0Var4;
        o39 o39Var5;
        boolean z5;
        int i4;
        int i5;
        ui3Var.getClass();
        aj3Var.getClass();
        tj3 tj3Var3 = (tj3) ye1Var;
        tj3Var3.m22115d0(-1735661691);
        if ((i & 6) == 0) {
            i3 = (tj3Var3.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                vj0Var2 = vj0Var;
                int i6 = tj3Var3.m22120g(vj0Var2) ? 32 : 16;
                i3 |= i6;
            } else {
                vj0Var2 = vj0Var;
            }
            i3 |= i6;
        } else {
            vj0Var2 = vj0Var;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                o39Var2 = o39Var;
                int i7 = tj3Var3.m22120g(o39Var2) ? 256 : 128;
                i3 |= i7;
            } else {
                o39Var2 = o39Var;
            }
            i3 |= i7;
        } else {
            o39Var2 = o39Var;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= tj3Var3.m22122h(z2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if (tj3Var3.m22124i(ui3Var)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((196608 & i) != 0) {
                if (tj3Var3.m22124i(aj3Var)) {
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                i3 |= i4;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var3.m22099R(i3 & 1, z3)) {
                tj3Var3.m22104W();
                if ((i & 1) != 0 || tj3Var3.m22084B()) {
                    if ((i2 & 2) != 0) {
                        x17 x17Var = wj0.f66899a;
                        vh9 vh9Var = ps5.f56764b;
                        tj3Var2 = tj3Var3;
                        vj0VarM23996a = wj0.m23996a(((ms5) tj3Var3.m22128k(vh9Var)).f51799a.f55842a, ((ms5) tj3Var3.m22128k(vh9Var)).f51799a.f55844b, aa1.m198b(0.12f, ((ms5) tj3Var3.m22128k(vh9Var)).f51799a.f55842a), tj3Var2, 4);
                        i3 &= -113;
                    } else {
                        tj3Var2 = tj3Var3;
                        vj0VarM23996a = vj0Var2;
                    }
                    if ((i2 & 4) != 0) {
                        o39Var4 = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51801c.f64859e;
                        i3 &= -897;
                    } else {
                        o39Var4 = o39Var2;
                    }
                    vj0Var4 = vj0VarM23996a;
                    if (i8 != 0) {
                        z5 = true;
                        o39Var5 = o39Var4;
                    } else {
                        o39Var5 = o39Var4;
                        z5 = z2;
                    }
                } else {
                    tj3Var3.m22102U();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    vj0Var4 = vj0Var2;
                    o39Var5 = o39Var2;
                    z5 = z2;
                    tj3Var2 = tj3Var3;
                }
                tj3Var2.m22140r();
                ((fe9) tj3Var2.m22128k(ge9.f40637a)).getClass();
                int i9 = (i3 >> 6) & 112;
                int i10 = i3 << 3;
                tj3 tj3Var4 = tj3Var2;
                m21708e(i9 | (i10 & 896) | (i10 & 7168) | (458752 & i10) | (i10 & 3670016), 16, vj0Var4, tj3Var4, ui3Var, aj3Var, c99.m4418k(e16Var, 2), null, o39Var5, z5);
                tj3Var = tj3Var4;
                vj0Var3 = vj0Var4;
                o39Var3 = o39Var5;
                z4 = z5;
            } else {
                tj3Var = tj3Var3;
                tj3Var.m22102U();
                vj0Var3 = vj0Var2;
                o39Var3 = o39Var2;
                z4 = z2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new oy3(e16Var, vj0Var3, o39Var3, z4, ui3Var, aj3Var, i, i2);
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 24576) != 0) {
            if (tj3Var3.m22124i(ui3Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((196608 & i) != 0) {
            if (tj3Var3.m22124i(aj3Var)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        if ((74899 & i3) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tj3Var3.m22099R(i3 & 1, z3)) {
            tj3Var3.m22104W();
            if ((i & 1) != 0) {
                if ((i2 & 2) != 0) {
                    x17 x17Var2 = wj0.f66899a;
                    vh9 vh9Var2 = ps5.f56764b;
                    tj3Var2 = tj3Var3;
                    vj0VarM23996a = wj0.m23996a(((ms5) tj3Var3.m22128k(vh9Var2)).f51799a.f55842a, ((ms5) tj3Var3.m22128k(vh9Var2)).f51799a.f55844b, aa1.m198b(0.12f, ((ms5) tj3Var3.m22128k(vh9Var2)).f51799a.f55842a), tj3Var2, 4);
                    i3 &= -113;
                } else {
                    tj3Var2 = tj3Var3;
                    vj0VarM23996a = vj0Var2;
                }
                if ((i2 & 4) != 0) {
                    o39Var4 = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51801c.f64859e;
                    i3 &= -897;
                } else {
                    o39Var4 = o39Var2;
                }
                vj0Var4 = vj0VarM23996a;
                if (i8 != 0) {
                    z5 = true;
                    o39Var5 = o39Var4;
                } else {
                    o39Var5 = o39Var4;
                    z5 = z2;
                }
            } else {
                if ((i2 & 2) != 0) {
                    x17 x17Var3 = wj0.f66899a;
                    vh9 vh9Var3 = ps5.f56764b;
                    tj3Var2 = tj3Var3;
                    vj0VarM23996a = wj0.m23996a(((ms5) tj3Var3.m22128k(vh9Var3)).f51799a.f55842a, ((ms5) tj3Var3.m22128k(vh9Var3)).f51799a.f55844b, aa1.m198b(0.12f, ((ms5) tj3Var3.m22128k(vh9Var3)).f51799a.f55842a), tj3Var2, 4);
                    i3 &= -113;
                } else {
                    tj3Var2 = tj3Var3;
                    vj0VarM23996a = vj0Var2;
                }
                if ((i2 & 4) != 0) {
                    o39Var4 = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51801c.f64859e;
                    i3 &= -897;
                } else {
                    o39Var4 = o39Var2;
                }
                vj0Var4 = vj0VarM23996a;
                if (i8 != 0) {
                    z5 = true;
                    o39Var5 = o39Var4;
                } else {
                    o39Var5 = o39Var4;
                    z5 = z2;
                }
            }
            tj3Var2.m22140r();
            ((fe9) tj3Var2.m22128k(ge9.f40637a)).getClass();
            int i11 = (i3 >> 6) & 112;
            int i12 = i3 << 3;
            tj3 tj3Var5 = tj3Var2;
            m21708e(i11 | (i12 & 896) | (i12 & 7168) | (458752 & i12) | (i12 & 3670016), 16, vj0Var4, tj3Var5, ui3Var, aj3Var, c99.m4418k(e16Var, 2), null, o39Var5, z5);
            tj3Var = tj3Var5;
            vj0Var3 = vj0Var4;
            o39Var3 = o39Var5;
            z4 = z5;
        } else {
            tj3Var = tj3Var3;
            tj3Var.m22102U();
            vj0Var3 = vj0Var2;
            o39Var3 = o39Var2;
            z4 = z2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new oy3(e16Var, vj0Var3, o39Var3, z4, ui3Var, aj3Var, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0121  */
    /* JADX WARN: Code duplicated, block: B:106:0x0126  */
    /* JADX WARN: Code duplicated, block: B:109:0x0143  */
    /* JADX WARN: Code duplicated, block: B:112:0x0156  */
    /* JADX WARN: Code duplicated, block: B:116:0x0177  */
    /* JADX WARN: Code duplicated, block: B:117:0x0179  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:98:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0117  */
    /* JADX INFO: renamed from: g */
    public static final void m21711g(e16 e16Var, boolean z, vj0 vj0Var, long j, o39 o39Var, t17 t17Var, final ui3 ui3Var, final C0282a c0282a, ye1 ye1Var, final int i, final int i2) {
        final e16 e16Var2;
        int i3;
        boolean z2;
        vj0 vj0VarM24002g;
        long j2;
        o39 o39Var2;
        ui3 ui3Var2;
        C0282a c0282a2;
        int i4;
        boolean z3;
        tj3 tj3Var;
        final boolean z4;
        final vj0 vj0Var2;
        final long j3;
        final o39 o39Var3;
        final t17 t17Var2;
        x18 x18VarM22143u;
        e16 e16Var3;
        t17 t17Var3;
        int i5;
        boolean z5;
        o39 o39Var4;
        vj0 vj0Var3;
        long jM198b;
        int i6;
        int i7;
        ui3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-262577218);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            e16Var2 = e16Var;
        } else if ((i & 6) == 0) {
            e16Var2 = e16Var;
            i3 = (tj3Var2.m22120g(e16Var2) ? 4 : 2) | i;
        } else {
            e16Var2 = e16Var;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= tj3Var2.m22122h(z2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    vj0VarM24002g = vj0Var;
                    int i10 = tj3Var2.m22120g(vj0VarM24002g) ? 256 : 128;
                    i3 |= i10;
                } else {
                    vj0VarM24002g = vj0Var;
                }
                i3 |= i10;
            } else {
                vj0VarM24002g = vj0Var;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    int i11 = tj3Var2.m22118f(j2) ? 2048 : 1024;
                    i3 |= i11;
                } else {
                    j2 = j;
                }
                i3 |= i11;
            } else {
                j2 = j;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    o39Var2 = o39Var;
                    int i12 = tj3Var2.m22120g(o39Var2) ? 16384 : 8192;
                    i3 |= i12;
                } else {
                    o39Var2 = o39Var;
                }
                i3 |= i12;
            } else {
                o39Var2 = o39Var;
            }
            if ((196608 & i) == 0) {
                i3 |= 65536;
            }
            if ((1572864 & i) == 0) {
                ui3Var2 = ui3Var;
                if (tj3Var2.m22124i(ui3Var2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            } else {
                ui3Var2 = ui3Var;
            }
            if ((12582912 & i) == 0) {
                c0282a2 = c0282a;
                if (tj3Var2.m22124i(c0282a2)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i3 |= i6;
            } else {
                c0282a2 = c0282a;
            }
            i4 = i3;
            if ((4793491 & i4) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var2.m22099R(i4 & 1, z3)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0 || tj3Var2.m22084B()) {
                    if (i8 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var2;
                    }
                    boolean z6 = i9 == 0 ? z2 : true;
                    if ((i2 & 4) != 0) {
                        x17 x17Var = wj0.f66899a;
                        i4 &= -897;
                        vj0VarM24002g = wj0.m24002g(0L, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55842a, tj3Var2, 13);
                    }
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                        j2 = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55816A;
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        o39Var2 = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51801c.f64859e;
                    }
                    int i13 = i4 & (-458753);
                    e16 e16Var4 = e16Var3;
                    t17Var3 = wj0.f66899a;
                    i5 = i13;
                    e16Var2 = e16Var4;
                    z5 = z6;
                    o39Var4 = o39Var2;
                    vj0Var3 = vj0VarM24002g;
                } else {
                    tj3Var2.m22102U();
                    if ((i2 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    i5 = i4 & (-458753);
                    t17Var3 = t17Var;
                    z5 = z2;
                    vj0Var3 = vj0VarM24002g;
                    o39Var4 = o39Var2;
                }
                tj3Var2.m22140r();
                if (z5) {
                    jM198b = j2;
                } else {
                    jM198b = aa1.m198b(0.12f, j2);
                }
                vf0 vf0VarM4714a = ci8.m4714a(1.0f, jM198b);
                int i14 = i5 << 3;
                int i15 = ((i5 >> 18) & 14) | (i14 & 112) | (i14 & 896) | ((i5 >> 3) & 7168);
                int i16 = i5 << 6;
                tj3Var = tj3Var2;
                AbstractC0231g.m1151d(ui3Var2, e16Var2, z5, o39Var4, vj0Var3, vf0VarM4714a, t17Var3, c0282a2, tj3Var, i15 | (57344 & i16) | (i16 & 1879048192), 288);
                j3 = j2;
                z4 = z5;
                o39Var3 = o39Var4;
                vj0Var2 = vj0Var3;
                t17Var2 = t17Var3;
            } else {
                tj3Var2.m22102U();
                tj3Var = tj3Var2;
                z4 = z2;
                vj0Var2 = vj0VarM24002g;
                j3 = j2;
                o39Var3 = o39Var2;
                t17Var2 = t17Var;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: mm5
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ss5.m21711g(e16Var2, z4, vj0Var2, j3, o39Var3, t17Var2, ui3Var, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i3 |= 48;
        z2 = z;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                vj0VarM24002g = vj0Var;
                if (tj3Var2.m22120g(vj0VarM24002g)) {
                }
                i3 |= i10;
            } else {
                vj0VarM24002g = vj0Var;
            }
            i3 |= i10;
        } else {
            vj0VarM24002g = vj0Var;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j2 = j;
                if (tj3Var2.m22118f(j2)) {
                }
                i3 |= i11;
            } else {
                j2 = j;
            }
            i3 |= i11;
        } else {
            j2 = j;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                o39Var2 = o39Var;
                if (tj3Var2.m22120g(o39Var2)) {
                }
                i3 |= i12;
            } else {
                o39Var2 = o39Var;
            }
            i3 |= i12;
        } else {
            o39Var2 = o39Var;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i) == 0) {
            ui3Var2 = ui3Var;
            if (tj3Var2.m22124i(ui3Var2)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        } else {
            ui3Var2 = ui3Var;
        }
        if ((12582912 & i) == 0) {
            c0282a2 = c0282a;
            if (tj3Var2.m22124i(c0282a2)) {
                i6 = 8388608;
            } else {
                i6 = 4194304;
            }
            i3 |= i6;
        } else {
            c0282a2 = c0282a;
        }
        i4 = i3;
        if ((4793491 & i4) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tj3Var2.m22099R(i4 & 1, z3)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    e16Var3 = b16.f7762a;
                } else {
                    e16Var3 = e16Var2;
                }
                if (i9 == 0) {
                }
                if ((i2 & 4) != 0) {
                    x17 x17Var2 = wj0.f66899a;
                    i4 &= -897;
                    vj0VarM24002g = wj0.m24002g(0L, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55842a, tj3Var2, 13);
                }
                if ((i2 & 8) != 0) {
                    i4 &= -7169;
                    j2 = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55816A;
                }
                if ((i2 & 16) != 0) {
                    i4 &= -57345;
                    o39Var2 = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51801c.f64859e;
                }
                int i17 = i4 & (-458753);
                e16 e16Var5 = e16Var3;
                t17Var3 = wj0.f66899a;
                i5 = i17;
                e16Var2 = e16Var5;
                z5 = z6;
                o39Var4 = o39Var2;
                vj0Var3 = vj0VarM24002g;
            } else {
                if (i8 != 0) {
                    e16Var3 = b16.f7762a;
                } else {
                    e16Var3 = e16Var2;
                }
                if (i9 == 0) {
                }
                if ((i2 & 4) != 0) {
                    x17 x17Var3 = wj0.f66899a;
                    i4 &= -897;
                    vj0VarM24002g = wj0.m24002g(0L, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55842a, tj3Var2, 13);
                }
                if ((i2 & 8) != 0) {
                    i4 &= -7169;
                    j2 = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55816A;
                }
                if ((i2 & 16) != 0) {
                    i4 &= -57345;
                    o39Var2 = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51801c.f64859e;
                }
                int i18 = i4 & (-458753);
                e16 e16Var6 = e16Var3;
                t17Var3 = wj0.f66899a;
                i5 = i18;
                e16Var2 = e16Var6;
                z5 = z6;
                o39Var4 = o39Var2;
                vj0Var3 = vj0VarM24002g;
            }
            tj3Var2.m22140r();
            if (z5) {
                jM198b = j2;
            } else {
                jM198b = aa1.m198b(0.12f, j2);
            }
            vf0 vf0VarM4714a2 = ci8.m4714a(1.0f, jM198b);
            int i19 = i5 << 3;
            int i110 = ((i5 >> 18) & 14) | (i19 & 112) | (i19 & 896) | ((i5 >> 3) & 7168);
            int i111 = i5 << 6;
            tj3Var = tj3Var2;
            AbstractC0231g.m1151d(ui3Var2, e16Var2, z5, o39Var4, vj0Var3, vf0VarM4714a2, t17Var3, c0282a2, tj3Var, i110 | (57344 & i111) | (i111 & 1879048192), 288);
            j3 = j2;
            z4 = z5;
            o39Var3 = o39Var4;
            vj0Var2 = vj0Var3;
            t17Var2 = t17Var3;
        } else {
            tj3Var2.m22102U();
            tj3Var = tj3Var2;
            z4 = z2;
            vj0Var2 = vj0VarM24002g;
            j3 = j2;
            o39Var3 = o39Var2;
            t17Var2 = t17Var;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: mm5
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ss5.m21711g(e16Var2, z4, vj0Var2, j3, o39Var3, t17Var2, ui3Var, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: h */
    public static final ArrayList m21712h(int i, int i2, int i3) {
        int i4 = i - ((i2 - 1) * i3);
        int i5 = i4 / i2;
        int i6 = i4 % i2;
        ArrayList arrayList = new ArrayList(i2);
        int i7 = 0;
        while (i7 < i2) {
            arrayList.add(Integer.valueOf((i7 < i6 ? 1 : 0) + i5));
            i7++;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static final l44 m21713i(C0061c c0061c, float f, float f2, k44 k44Var, String str, ye1 ye1Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        return m21714j(c0061c, Float.valueOf(f), Float.valueOf(f2), pk9.f56363h, k44Var, str, ye1Var, (i & 1022) | 32768 | ((i << 3) & 458752));
    }

    /* JADX INFO: renamed from: j */
    public static final l44 m21714j(C0061c c0061c, Comparable comparable, Comparable comparable2, jda jdaVar, k44 k44Var, String str, ye1 ye1Var, int i) {
        C0061c c0061c2;
        Comparable comparable3;
        Comparable comparable4;
        k44 k44Var2;
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        p84 p84Var = we1.f66679a;
        if (objM22097O == p84Var) {
            c0061c2 = c0061c;
            comparable3 = comparable;
            comparable4 = comparable2;
            k44Var2 = k44Var;
            l44 l44Var = new l44(c0061c2, comparable3, comparable4, jdaVar, k44Var2);
            tj3Var.m22131l0(l44Var);
            objM22097O = l44Var;
        } else {
            c0061c2 = c0061c;
            comparable3 = comparable;
            comparable4 = comparable2;
            k44Var2 = k44Var;
        }
        l44 l44Var2 = (l44) objM22097O;
        boolean z = true;
        boolean z2 = ((((i & 112) ^ 48) > 32 && tj3Var.m22124i(comparable3)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && tj3Var.m22124i(comparable4)) || (i & 384) == 256);
        if ((((57344 & i) ^ 24576) <= 16384 || !tj3Var.m22124i(k44Var2)) && (i & 24576) != 16384) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM22097O2 = tj3Var.m22097O();
        if (z3 || objM22097O2 == p84Var) {
            objM22097O2 = new m44(comparable3, l44Var2, comparable4, k44Var2);
            tj3Var.m22131l0(objM22097O2);
        }
        d32.m10064x((ui3) objM22097O2, tj3Var);
        boolean zM22124i = tj3Var.m22124i(c0061c2);
        Object objM22097O3 = tj3Var.m22097O();
        if (zM22124i || objM22097O3 == p84Var) {
            objM22097O3 = new C3704w(16, c0061c2, l44Var2);
            tj3Var.m22131l0(objM22097O3);
        }
        d32.m10041h(l44Var2, (vi3) objM22097O3, tj3Var);
        return l44Var2;
    }

    /* JADX INFO: renamed from: k */
    public static String m21715k(String str, Throwable th) {
        String strM21684I = m21684I(th);
        if (TextUtils.isEmpty(strM21684I)) {
            return str;
        }
        StringBuilder sbM22999v = ux5.m22999v(str, "\n  ");
        sbM22999v.append(strM21684I.replace("\n", "\n  "));
        sbM22999v.append('\n');
        return sbM22999v.toString();
    }

    /* JADX INFO: renamed from: l */
    public static final long m21716l(wy5 wy5Var) {
        LevelBand levelBandM21689P = wy5Var != null ? m21689P(wy5Var.m24217b()) : null;
        int i = levelBandM21689P == null ? -1 : AbstractC2989f5.f38421b[levelBandM21689P.ordinal()];
        if (i == -1 || i == 1) {
            return d32.m10037f(4281972042L);
        }
        if (i == 2) {
            return d32.m10037f(4291050010L);
        }
        if (i == 3) {
            return d32.m10037f(4281435358L);
        }
        gm5.m12750e();
        return 0L;
    }

    /* JADX INFO: renamed from: n */
    public static vb1 m21717n(vi3... vi3VarArr) {
        if (vi3VarArr.length > 0) {
            return new vb1(vi3VarArr, 0);
        }
        C3386nv.m17626m("Failed requirement.");
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static int m21718o(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: p */
    public static int m21719p(k38 k38Var, lq2 lq2Var, View view, View view2, y28 y28Var, boolean z) {
        if (y28Var.m24906v() == 0 || k38Var.m14789b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(y28.m24878K(view) - y28.m24878K(view2)) + 1;
        }
        return Math.min(lq2Var.mo16456n(), lq2Var.mo16446d(view2) - lq2Var.mo16449g(view));
    }

    /* JADX INFO: renamed from: q */
    public static int m21720q(k38 k38Var, lq2 lq2Var, View view, View view2, y28 y28Var, boolean z, boolean z2) {
        if (y28Var.m24906v() == 0 || k38Var.m14789b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (k38Var.m14789b() - Math.max(y28.m24878K(view), y28.m24878K(view2))) - 1) : Math.max(0, Math.min(y28.m24878K(view), y28.m24878K(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(lq2Var.mo16446d(view2) - lq2Var.mo16449g(view)) / (Math.abs(y28.m24878K(view) - y28.m24878K(view2)) + 1))) + (lq2Var.mo16455m() - lq2Var.mo16449g(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: r */
    public static int m21721r(k38 k38Var, lq2 lq2Var, View view, View view2, y28 y28Var, boolean z) {
        if (y28Var.m24906v() == 0 || k38Var.m14789b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return k38Var.m14789b();
        }
        return (int) (((lq2Var.mo16446d(view2) - lq2Var.mo16449g(view)) / (Math.abs(y28.m24878K(view) - y28.m24878K(view2)) + 1)) * k38Var.m14789b());
    }

    /* JADX INFO: renamed from: t */
    public static void m21722t(String str, String str2) {
        synchronized (f61355c) {
            Log.d(str, m21715k(str2, null));
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m21723u(String str, String str2) {
        synchronized (f61355c) {
            Log.e(str, m21715k(str2, null));
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m21724v(String str, String str2, Throwable th) {
        synchronized (f61355c) {
            Log.e(str, m21715k(str2, th));
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m21725w(t78 t78Var, vl9 vl9Var) {
        C0159d c0159d = t78Var.f61944b;
        c0159d.getClass();
        if ((c0159d.f2759T.f64937c.m21222h() & 4) != 0) {
            vl9Var.mo11427a(t78Var);
        }
    }

    /* JADX INFO: renamed from: x */
    public static final l43 m21726x(q36 q36Var, MotionSchemeKeyTokens motionSchemeKeyTokens) {
        switch (r36.f58554a[motionSchemeKeyTokens.ordinal()]) {
            case 1:
                return q36Var.mo17780f();
            case 2:
                return q36Var.mo17777c();
            case 3:
                return q36Var.mo17779e();
            case 4:
                return q36Var.mo17778d();
            case 5:
                return q36Var.mo17776b();
            case 6:
                return q36Var.mo17775a();
            default:
                gm5.m12750e();
                return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static final int m21727y(int i, boolean z) {
        if (!z) {
            return m21728z(i);
        }
        switch (i) {
            case 1:
                return R$drawable.ic_activity1_coin_reflection;
            case 2:
                return R$drawable.ic_activity2_coin_reflection;
            case 3:
                return R$drawable.ic_activity3_coin_reflection;
            case 4:
                return R$drawable.ic_activity4_coin_reflection;
            case 5:
                return R$drawable.ic_activity5_coin_reflection;
            case 6:
                return R$drawable.ic_activity6_coin;
            case 7:
                return R$drawable.ic_activity7_coin;
            default:
                return com.lingq.core.p012ui.R$drawable.ic_coin_s;
        }
    }

    /* JADX INFO: renamed from: z */
    public static final int m21728z(int i) {
        switch (i) {
            case 1:
                return R$drawable.ic_activity1_coin;
            case 2:
                return R$drawable.ic_activity2_coin;
            case 3:
                return R$drawable.ic_activity3_coin;
            case 4:
                return R$drawable.ic_activity4_coin;
            case 5:
                return R$drawable.ic_activity5_coin;
            case 6:
                return R$drawable.ic_activity6_coin;
            case 7:
                return R$drawable.ic_activity7_coin;
            default:
                return com.lingq.core.p012ui.R$drawable.ic_coin_s;
        }
    }

    /* JADX INFO: renamed from: K */
    public int m21729K(bk8 bk8Var, Object obj) {
        bk8Var.getClass();
        if (obj == null) {
            return 0;
        }
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(mo16669s());
        try {
            mo16668m(ik8VarMo2873e0, obj);
            ik8VarMo2873e0.mo2876a0();
            AbstractC3352my.m17126j(ik8VarMo2873e0, null);
            return AbstractC3489q9.m19787q(bk8Var);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3352my.m17126j(ik8VarMo2873e0, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m21730L(bk8 bk8Var, Iterable iterable) throws Exception {
        bk8Var.getClass();
        if (iterable == null) {
            return;
        }
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(mo16669s());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    mo16668m(ik8VarMo2873e0, obj);
                    ik8VarMo2873e0.mo2876a0();
                    ik8VarMo2873e0.reset();
                    AbstractC3489q9.m19787q(bk8Var);
                }
            }
            AbstractC3352my.m17126j(ik8VarMo2873e0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3352my.m17126j(ik8VarMo2873e0, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo16668m(ik8 ik8Var, Object obj);

    /* JADX INFO: renamed from: s */
    public abstract String mo16669s();
}
