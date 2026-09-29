package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.premium.domain.TrialReminderChoice;
import com.lingq.feature.imports.data.UserImportDetailType;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x4a implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67760a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f67761b;

    public /* synthetic */ x4a(vi3 vi3Var, int i) {
        this.f67760a = i;
        this.f67761b = vi3Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f67760a;
        jqa jqaVar = jqa.f46016a;
        kqa kqaVar = kqa.f48344a;
        a24 a24Var = a24.f91a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f67761b;
        switch (i) {
            case 0:
                vi3Var.invoke(o2a.f53656a);
                break;
            case 1:
                vi3Var.invoke(v2a.f64750a);
                break;
            case 2:
                vi3Var.invoke(p2a.f55500a);
                break;
            case 3:
                vi3Var.invoke(new ih3(TrialReminderChoice.ThreeDaysBefore));
                break;
            case 4:
                vi3Var.invoke(new ih3(TrialReminderChoice.TwoDaysBefore));
                break;
            case 5:
                vi3Var.invoke(aka.f783a);
                break;
            case 6:
                vi3Var.invoke(a24Var);
                break;
            case 7:
                vi3Var.invoke(b24.f7791a);
                break;
            case 8:
                vi3Var.invoke(new s14(UserImportDetailType.Course));
                break;
            case 9:
                vi3Var.invoke(new s14(UserImportDetailType.Level));
                break;
            case 10:
                vi3Var.invoke(new s14(UserImportDetailType.Tags));
                break;
            case 11:
                vi3Var.invoke(p14.f55428a);
                break;
            case 12:
                vi3Var.invoke(o14.f53586a);
                break;
            case 13:
                vi3Var.invoke(a24Var);
                break;
            case 14:
                vi3Var.invoke(a24Var);
                break;
            case 15:
                vi3Var.invoke(new s14(UserImportDetailType.Languages));
                break;
            case 16:
                vi3Var.invoke(r14.f58484a);
                break;
            case 17:
                vi3Var.invoke(a24Var);
                break;
            case 18:
                vi3Var.invoke(kla.f47497a);
                break;
            case 19:
                vi3Var.invoke(jla.f45680a);
                break;
            case 20:
                vi3Var.invoke(jqaVar);
                break;
            case 21:
                vi3Var.invoke(kqaVar);
                break;
            case 22:
                vi3Var.invoke(jqaVar);
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                vi3Var.invoke(kqaVar);
                break;
            case 24:
                vi3Var.invoke(nqa.f53153a);
                break;
            case 25:
                vi3Var.invoke(bsa.f8956a);
                break;
            case 26:
                vi3Var.invoke(jra.f46048a);
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                vi3Var.invoke(ura.f64251a);
                break;
            case 28:
                vi3Var.invoke(pqa.f56698a);
                break;
            default:
                vi3Var.invoke(zra.f72015a);
                break;
        }
        return xfaVar;
    }
}
