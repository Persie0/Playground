package p278nh;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.C0940a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.lingq.p055ui.lesson.tutorial.LessonDealWithWordsFragment;
import com.lingq.p055ui.token.TokenData;
import com.lingq.p055ui.token.TokenFragment;
import com.lingq.p055ui.upgrade.UpgradeGoPremiumFragment;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import p322pd.C8226g;

/* JADX INFO: renamed from: nh.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7777d {
    /* JADX INFO: renamed from: a */
    public static final boolean m15480a(Fragment fragment) {
        C5207g.m11111f(fragment, "<this>");
        if (!C4924a.m10460g(fragment.m3578a0()) && !m15481b(fragment)) {
            if (!m15482c(fragment)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m15481b(Fragment fragment) {
        C5207g.m11111f(fragment, "<this>");
        return C4924a.m10462h(fragment.m3578a0());
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m15482c(Fragment fragment) {
        C5207g.m11111f(fragment, "<this>");
        Context contextM3578a0 = fragment.m3578a0();
        return !contextM3578a0.getResources().getBoolean(R.bool.is_phone) && contextM3578a0.getResources().getConfiguration().orientation == 1;
    }

    /* JADX INFO: renamed from: d */
    public static final void m15483d(FragmentManager fragmentManager, boolean z10) {
        C0940a c0940a = null;
        TokenFragment tokenFragment = (TokenFragment) (fragmentManager != null ? fragmentManager.m3616D(TokenFragment.class.getName()) : null);
        if (tokenFragment != null) {
            C8226g c8226g = new C8226g();
            c8226g.f48293c = 260L;
            tokenFragment.m3587g0(c8226g);
            if (!z10) {
                if (fragmentManager != null) {
                    c0940a = new C0940a(fragmentManager);
                }
                if (c0940a != null) {
                    c0940a.m3700l(tokenFragment);
                    c0940a.m3697i();
                }
            } else if (fragmentManager != null) {
                fragmentManager.m3627S();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m15484e(FragmentManager fragmentManager, Bundle bundle) {
        if (((LessonDealWithWordsFragment) (fragmentManager != null ? fragmentManager.m3616D(LessonDealWithWordsFragment.class.getName()) : null)) == null) {
            LessonDealWithWordsFragment lessonDealWithWordsFragment = new LessonDealWithWordsFragment();
            lessonDealWithWordsFragment.m3583e0(bundle);
            if (fragmentManager != null) {
                m15487h(fragmentManager, lessonDealWithWordsFragment, R.id.fragment_top, LessonDealWithWordsFragment.class.getName(), true);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m15485f(FragmentManager fragmentManager, int i10, Bundle bundle, boolean z10, boolean z11) {
        TokenData tokenData;
        TokenFragment tokenFragment = (TokenFragment) (fragmentManager != null ? fragmentManager.m3616D(TokenFragment.class.getName()) : null);
        if (tokenFragment != null) {
            if (!z11 || (tokenData = (TokenData) bundle.getParcelable("tokenData")) == null) {
                return;
            }
            tokenFragment.m10363o0().m10376A2(tokenData);
            return;
        }
        TokenFragment tokenFragment2 = new TokenFragment();
        tokenFragment2.m3583e0(bundle);
        if (fragmentManager != null) {
            m15487h(fragmentManager, tokenFragment2, i10, TokenFragment.class.getName(), z10);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m15486g(FragmentManager fragmentManager, int i10, Bundle bundle) {
        if (((UpgradeGoPremiumFragment) (fragmentManager != null ? fragmentManager.m3616D(UpgradeGoPremiumFragment.class.getName()) : null)) == null) {
            UpgradeGoPremiumFragment upgradeGoPremiumFragment = new UpgradeGoPremiumFragment();
            upgradeGoPremiumFragment.m3583e0(bundle);
            if (fragmentManager != null) {
                m15487h(fragmentManager, upgradeGoPremiumFragment, i10, UpgradeGoPremiumFragment.class.getName(), true);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m15487h(FragmentManager fragmentManager, Fragment fragment, int i10, String str, boolean z10) {
        String strMo3676a;
        C5207g.m11111f(fragmentManager, "<this>");
        C0940a c0940a = new C0940a(fragmentManager);
        c0940a.m3777g(i10, fragment, str);
        if (z10) {
            ArrayList<C0940a> arrayList = fragmentManager.f6161d;
            int size = 0;
            if ((arrayList != null ? arrayList.size() : 0) > 0) {
                ArrayList<C0940a> arrayList2 = fragmentManager.f6161d;
                if (arrayList2 != null) {
                    size = arrayList2.size();
                }
                C0940a c0940a2 = fragmentManager.f6161d.get(size - 1);
                C5207g.m11110e(c0940a2, "getBackStackEntryAt(backStackEntryCount - 1)");
                strMo3676a = c0940a2.mo3676a();
            } else {
                strMo3676a = null;
            }
            if (strMo3676a == null || !C5207g.m11106a(strMo3676a, str)) {
                c0940a.m3775d(str);
            }
        }
        c0940a.f6359p = true;
        c0940a.m3697i();
    }
}
