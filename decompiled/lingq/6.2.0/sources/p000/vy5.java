package p000;

import com.lingq.core.domain.model.milestones.Milestone;

/* JADX INFO: loaded from: classes2.dex */
public final class vy5 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static String m23592a(String str) {
        String str2;
        switch (str.hashCode()) {
            case -1072069089:
                if (str.equals("beginner1")) {
                    return "Beginner 1";
                }
                break;
            case -1072069088:
                if (str.equals("beginner2")) {
                    return "Beginner 2";
                }
                break;
            case -881435048:
                if (str.equals("intermediate1")) {
                    return "Intermediate 1";
                }
                break;
            case -881435047:
                if (str.equals("intermediate2")) {
                    return "Intermediate 2";
                }
                break;
        }
        dr5 dr5VarM15426e = wy5.f67518d.m15426e(str);
        return (dr5VarM15426e == null || (str2 = (String) ((br5) dr5VarM15426e.m10610a()).get(1)) == null) ? str : "Advanced ".concat(str2);
    }

    /* JADX INFO: renamed from: b */
    public static wy5 m23593b(Milestone milestone) {
        milestone.getClass();
        String str = milestone.f19533b;
        String strM23592a = milestone.f19536e;
        if (vk9.m23391n0(strM23592a)) {
            vy5 vy5Var = wy5.Companion;
            String strM23368D0 = vk9.m23368D0(str, "level.", str);
            vy5Var.getClass();
            strM23592a = m23592a(strM23368D0);
        }
        return new wy5(str, strM23592a);
    }
}
