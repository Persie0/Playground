package p000;

import androidx.datastore.core.okio.OkioStorage;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.lesson.LessonBookmark;
import com.lingq.feature.edit.AbstractC2076b;
import com.lingq.feature.onboarding.auth.registration.RegistrationField;
import com.lingq.feature.onboarding.p014v2.pages.p023long.AbstractC2231b;
import com.lingq.feature.playlist.MenuPlaylistItem;
import com.lingq.feature.reader.stats.p019ui.components.AbstractC2558b;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yu4 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70471a;

    public /* synthetic */ yu4(int i) {
        this.f70471a = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f70471a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ((aq2) obj).f7357e = ((C3406oe) obj2).f54237a;
                return xfaVar;
            case 1:
                ((cq2) obj).f34372f = ((Long) obj2).longValue();
                return xfaVar;
            case 2:
                ((cq2) obj).f8864d = (C3532re) obj2;
                return xfaVar;
            case 3:
                ((dq2) obj).f36017f = (xp3) obj2;
                return xfaVar;
            case 4:
                ((dq2) obj).f36015d = (on3) obj2;
                return xfaVar;
            case 5:
                ((dq2) obj).f36016e = ((C3406oe) obj2).f54237a;
                return xfaVar;
            case 6:
                ((eq2) obj).f37703f = ((Long) obj2).longValue();
                return xfaVar;
            case 7:
                ((eq2) obj).f8864d = (C3532re) obj2;
                return xfaVar;
            case 8:
                ((Integer) obj2).intValue();
                ((String) obj).getClass();
                return xfaVar;
            case 9:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ezb.m11403a(2, 0, null, tj3Var, 48);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 10:
                LessonBookmark lessonBookmark = (LessonBookmark) obj;
                LessonBookmark lessonBookmark2 = (LessonBookmark) obj2;
                return Boolean.valueOf(fa4.m11650l(lessonBookmark != null ? lessonBookmark.f19169b : null, lessonBookmark2 != null ? lessonBookmark2.f19169b : null));
            case 11:
                ((Integer) obj2).getClass();
                AbstractC2076b.m8985b((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 12:
                ((Integer) obj2).getClass();
                vjd.m23357a((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 13:
                ((Integer) obj2).getClass();
                AbstractC2558b.m9474g((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 14:
                ((Integer) obj2).getClass();
                AbstractC2558b.m9479l((ye1) obj, pk9.m19383z(7));
                return xfaVar;
            case 15:
                ((Integer) obj2).getClass();
                tj3 tj3Var2 = (tj3) ((ye1) obj);
                tj3Var2.m22111b0(-511854661);
                ng0 ng0Var = ng0.f52694a;
                WeakHashMap weakHashMap = l6b.f49204w;
                fc5 fc5Var = new fc5(ho5.m13397r(tj3Var2).f49216l, 48);
                tj3Var2.m22139q(false);
                return fc5Var;
            case 16:
                int iIntValue2 = ((Integer) obj).intValue();
                if (((nn3) obj2) instanceof C0836c6) {
                    iIntValue2++;
                }
                return Integer.valueOf(iIntValue2);
            case 17:
                gy2 gy2Var = (gy2) obj;
                nn3 nn3Var = (nn3) obj2;
                if ((nn3Var instanceof m4b) || (nn3Var instanceof cs3) || (nn3Var instanceof dn1) || (nn3Var instanceof C3807ys)) {
                    return new gy2(gy2Var.f41519a.mo16935d(nn3Var), gy2Var.f41520b);
                }
                return new gy2(gy2Var.f41519a, gy2Var.f41520b.mo16935d(nn3Var));
            case 18:
                return OkioStorage._init_$lambda$0((d57) obj, (u33) obj2);
            case 19:
                ((RegistrationField) obj).getClass();
                ((String) obj2).getClass();
                return xfaVar;
            case 20:
                return Integer.valueOf(((ct5) obj).mo1510U(((Integer) obj2).intValue()));
            case 21:
                return Integer.valueOf(((ct5) obj).mo1513p(((Integer) obj2).intValue()));
            case 22:
                return Integer.valueOf(((ct5) obj).mo1511c(((Integer) obj2).intValue()));
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return Integer.valueOf(((ct5) obj).mo1512l(((Integer) obj2).intValue()));
            case 24:
                ((Integer) obj2).getClass();
                AbstractC2231b.m9197j((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 25:
                ((Integer) obj2).getClass();
                AbstractC2231b.m9194g((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 26:
                ((Integer) obj2).getClass();
                AbstractC2231b.m9199l((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ((Integer) obj2).getClass();
                AbstractC2231b.m9198k((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 28:
                ((MenuPlaylistItem) obj).getClass();
                ((ud7) obj2).getClass();
                return xfaVar;
            default:
                ((Integer) obj2).getClass();
                d32.m10058r((ye1) obj, pk9.m19383z(1));
                return xfaVar;
        }
    }

    public /* synthetic */ yu4(int i, int i2) {
        this.f70471a = i2;
    }
}
