package p000;

import androidx.compose.animation.core.C0059a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.facebook.login.C0939m;
import com.lingq.core.domain.model.user.C1506h;
import com.lingq.core.domain.model.user.C1510l;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.domain.model.user.ProfileSettings;
import com.lingq.core.network.api.result.C1637d1;
import com.lingq.core.network.api.result.C1699n2;
import com.lingq.core.network.api.result.C1710p1;
import com.lingq.core.network.api.result.C1722r1;
import com.lingq.core.network.api.result.C1732t;
import com.lingq.core.network.api.result.CollectionBlacklist$$serializer;
import com.lingq.core.network.api.result.LessonSourceBlacklist$$serializer;
import com.lingq.core.network.api.result.ResultBlacklist;
import com.lingq.core.network.api.result.ResultDictionariesForUser;
import com.lingq.core.network.api.result.ResultDictionaryData$$serializer;
import com.lingq.core.network.api.result.ResultLanguageContext;
import com.lingq.core.network.api.result.ResultLanguageProgress;
import com.lingq.core.network.api.result.ResultLibraryItem;
import com.lingq.core.network.api.result.ResultLibraryItem$$serializer;
import com.lingq.core.network.api.result.worldcup.C1770o;
import com.lingq.core.network.api.result.worldcup.ResultCupSummary;
import com.lingq.core.network.api.result.worldcup.ResultCupTeamEntry$$serializer;
import com.lingq.feature.onboarding.p014v2.C2213a;
import com.lingq.feature.onboarding.p014v2.OnboardingSelections;
import com.lingq.feature.onboarding.p014v2.PendingMiniLessonLingq$$serializer;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ri5 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59363a;

    public /* synthetic */ ri5(kp6 kp6Var) {
        this.f59363a = 5;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        switch (this.f59363a) {
            case 0:
                zf1 zf1Var = si5.f60899a;
                return null;
            case 1:
                vh9 vh9Var = ps5.f56763a;
                return Boolean.FALSE;
            case 2:
                return new ms5(ra1.m20493f(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535), new zda(), new v49(), p36.f55519a);
            case 3:
                return new wl8();
            case 4:
                d54 d54Var = new d54(0);
                d54Var.m10098a(y38.m24933a(z76.class), new lz5(7));
                return d54Var.m10100c();
            case 5:
                hl9 hl9Var = hl9.f42584B;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (vk9.m23391n0("kotlin.Unit")) {
                    C3386nv.m17626m("Blank serial names are prohibited");
                } else {
                    if (!(hl9Var == hl9.f42585y)) {
                        a31 a31Var = new a31("kotlin.Unit");
                        a31Var.f164b = EmptyList.f47638a;
                        return new zx8("kotlin.Unit", hl9Var, a31Var.f165c.size(), AbstractC3550rv.m20852t0(serialDescriptorArr), a31Var);
                    }
                    C3386nv.m17626m("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                return null;
            case 6:
                return C0939m.f11517f.m5254a();
            case 7:
                C2213a c2213a = OnboardingSelections.Companion;
                return new ke5(sk9.f60959a);
            case 8:
                C2213a c2213a2 = OnboardingSelections.Companion;
                return new ke5(sk9.f60959a);
            case 9:
                C2213a c2213a3 = OnboardingSelections.Companion;
                return new je5(sk9.f60959a, lf0.f49579a);
            case 10:
                C2213a c2213a4 = OnboardingSelections.Companion;
                return new C2978ev(PendingMiniLessonLingq$$serializer.INSTANCE);
            case 11:
                return new w07();
            case 12:
                v72 v72Var = ph2.f56212a;
                return t62.f61909c;
            case 13:
                int i = ei7.f37290a;
                return Boolean.FALSE;
            case 14:
                C1506h c1506h = Profile.Companion;
                return new C2978ev(sk9.f60959a);
            case 15:
                C1510l c1510l = ProfileSettings.Companion;
                return new C2978ev(thb.m22059r(sk9.f60959a));
            case 16:
                return new mp7(new C0059a(Float.valueOf(0.0f), pk9.f56363h, null, 12));
            case 17:
                C1732t c1732t = ResultBlacklist.Companion;
                return new C2978ev(thb.m22059r(CollectionBlacklist$$serializer.INSTANCE));
            case 18:
                C1732t c1732t2 = ResultBlacklist.Companion;
                return new C2978ev(thb.m22059r(LessonSourceBlacklist$$serializer.INSTANCE));
            case 19:
                C1770o c1770o = ResultCupSummary.Companion;
                return new C2978ev(ResultCupTeamEntry$$serializer.INSTANCE);
            case 20:
                C1637d1 c1637d1 = ResultDictionariesForUser.Companion;
                return new C2978ev(ResultDictionaryData$$serializer.INSTANCE);
            case 21:
                C1637d1 c1637d2 = ResultDictionariesForUser.Companion;
                return new je5(sk9.f60959a, new C2978ev(ResultDictionaryData$$serializer.INSTANCE));
            case 22:
                C1637d1 c1637d3 = ResultDictionariesForUser.Companion;
                sk9 sk9Var = sk9.f60959a;
                return new je5(sk9Var, thb.m22059r(sk9Var));
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                C1710p1 c1710p1 = ResultLanguageContext.Companion;
                return new C2978ev(sk9.f60959a);
            case 24:
                C1710p1 c1710p2 = ResultLanguageContext.Companion;
                return new C2978ev(sk9.f60959a);
            case 25:
                C1710p1 c1710p3 = ResultLanguageContext.Companion;
                return new C2978ev(lf0.f49579a);
            case 26:
                C1722r1 c1722r1 = ResultLanguageProgress.Companion;
                return new C2978ev(sk9.f60959a);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                C1699n2 c1699n2 = ResultLibraryItem.Companion;
                return new C2978ev(sk9.f60959a);
            case 28:
                C1699n2 c1699n3 = ResultLibraryItem.Companion;
                return new C2978ev(sk9.f60959a);
            default:
                C1699n2 c1699n4 = ResultLibraryItem.Companion;
                return new C2978ev(ResultLibraryItem$$serializer.INSTANCE);
        }
    }

    public /* synthetic */ ri5(int i) {
        this.f59363a = i;
    }
}
