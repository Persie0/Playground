package p000;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class urb {

    /* JADX INFO: renamed from: a */
    public static final ImmutableSet f64252a = ImmutableSet.m6311t("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* JADX INFO: renamed from: b */
    public static final ImmutableList f64253b;

    /* JADX INFO: renamed from: c */
    public static final ImmutableList f64254c;

    /* JADX INFO: renamed from: d */
    public static final ImmutableList f64255d;

    /* JADX INFO: renamed from: e */
    public static final ImmutableList f64256e;

    /* JADX INFO: renamed from: f */
    public static final ImmutableList f64257f;

    static {
        d14 d14Var = ImmutableList.f13390b;
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        d32.m10011I(objArr, 7);
        f64253b = ImmutableList.m6283l(objArr, 7);
        Object[] objArr2 = {"auto", "app", "am"};
        d32.m10011I(objArr2, 3);
        f64254c = ImmutableList.m6283l(objArr2, 3);
        f64255d = ImmutableList.m6280B("_r", "_dbg");
        c14 c14Var = new c14(4);
        c14Var.m3158c(AbstractC3584sr.f61286m);
        c14Var.m3158c(AbstractC3584sr.f61287n);
        f64256e = c14Var.m4280g();
        f64257f = ImmutableList.m6280B("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m22874a(String str) {
        return !f64254c.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static boolean m22875b(String str, Bundle bundle) {
        if (f64253b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        ImmutableList immutableList = f64255d;
        int size = immutableList.size();
        int i = 0;
        while (i < size) {
            boolean zContainsKey = bundle.containsKey((String) immutableList.get(i));
            i++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static boolean m22876c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            if (str.equals("fcm") || str.equals("frc")) {
                return true;
            }
        } else if ("_ln".equals(str2)) {
            if (str.equals("fcm") || str.equals("fiam")) {
                return true;
            }
        } else if (!f64256e.contains(str2)) {
            ImmutableList immutableList = f64257f;
            int size = immutableList.size();
            int i = 0;
            while (i < size) {
                boolean zMatches = str2.matches((String) immutableList.get(i));
                i++;
                if (zMatches) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static boolean m22877d(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (m22874a(str) && bundle != null) {
            ImmutableList immutableList = f64255d;
            int size = immutableList.size();
            int i = 0;
            while (i < size) {
                boolean zContainsKey = bundle.containsKey((String) immutableList.get(i));
                i++;
                if (zContainsKey) {
                }
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 101200) {
                if (iHashCode != 101230) {
                    if (iHashCode == 3142703 && str.equals("fiam")) {
                        bundle.putString("_cis", "fiam_integration");
                        return true;
                    }
                } else if (str.equals("fdl")) {
                    bundle.putString("_cis", "fdl_integration");
                    return true;
                }
            } else if (str.equals("fcm")) {
                bundle.putString("_cis", "fcm_integration");
                return true;
            }
        }
        return false;
    }
}
