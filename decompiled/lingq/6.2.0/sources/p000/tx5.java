package p000;

import androidx.compose.runtime.AbstractC0278f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.facebook.login.C0939m;
import com.lingq.core.domain.model.offer.BannerType;
import com.lingq.core.domain.model.offer.C1482a;
import com.lingq.core.domain.model.offer.OfferBanner;
import com.lingq.core.network.api.requests.C1562c0;
import com.lingq.core.network.api.requests.C1574g0;
import com.lingq.core.network.api.requests.C1583k0;
import com.lingq.core.network.api.requests.C1585l0;
import com.lingq.core.network.api.requests.C1586m;
import com.lingq.core.network.api.requests.C1590o;
import com.lingq.core.network.api.requests.C1593p0;
import com.lingq.core.network.api.requests.C1594q;
import com.lingq.core.network.api.requests.C1598s;
import com.lingq.core.network.api.requests.C1600t;
import com.lingq.core.network.api.requests.RequestClozeTest;
import com.lingq.core.network.api.requests.RequestDataCard;
import com.lingq.core.network.api.requests.RequestDictionariesOrder;
import com.lingq.core.network.api.requests.RequestFeedLevels;
import com.lingq.core.network.api.requests.RequestFeedQuery;
import com.lingq.core.network.api.requests.RequestHintUpdate$$serializer;
import com.lingq.core.network.api.requests.RequestLessonImport;
import com.lingq.core.network.api.requests.RequestLessonUpdateTimestamps;
import com.lingq.core.network.api.requests.RequestNotice;
import com.lingq.core.network.api.requests.RequestNotification;
import com.lingq.core.network.api.requests.RequestPlaylistOrder;
import com.lingq.core.network.api.requests.SentenceFragment$$serializer;
import com.lingq.core.network.api.result.C1684l;
import com.lingq.core.network.api.result.C1702o;
import com.lingq.core.network.api.result.MessageProfile;
import com.lingq.core.network.api.result.ParticipantStat;
import com.lingq.core.network.api.result.Target$$serializer;
import com.lingq.feature.onboarding.p014v2.domain.C2221b;
import com.lingq.feature.onboarding.p014v2.domain.C2222c;
import com.lingq.feature.onboarding.p014v2.domain.MiniLessonTemplate;
import com.lingq.feature.onboarding.p014v2.domain.MiniLessonWord;
import com.lingq.feature.onboarding.p014v2.domain.MiniLessonWord$$serializer;
import com.lingq.feature.reader.old.ReaderPageFragment;
import java.util.UUID;
import kotlin.text.Regex;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tx5 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63057a;

    public /* synthetic */ tx5(int i) {
        this.f63057a = i;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f63057a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                C1684l c1684l = MessageProfile.Companion;
                sk9 sk9Var = sk9.f60959a;
                return new je5(sk9Var, sk9Var);
            case 1:
                Regex regex = sz5.f61658a;
                return xfaVar;
            case 2:
                C2221b c2221b = MiniLessonTemplate.Companion;
                return new C2978ev(MiniLessonWord$$serializer.INSTANCE);
            case 3:
                C2222c c2222c = MiniLessonWord.Companion;
                sk9 sk9Var2 = sk9.f60959a;
                return new je5(sk9Var2, sk9Var2);
            case 4:
                return UUID.randomUUID();
            case 5:
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (vk9.m23391n0("kotlinx.datetime.MonthBased")) {
                    C3386nv.m17626m("Blank serial names are prohibited");
                    return null;
                }
                a31 a31Var = new a31("kotlinx.datetime.MonthBased");
                l84 l84Var = l84.f49294a;
                a31Var.m56a("months", l84.f49295b);
                return new zx8("kotlinx.datetime.MonthBased", hl9.f42585y, a31Var.f165c.size(), AbstractC3550rv.m20852t0(serialDescriptorArr), a31Var);
            case 6:
                C1482a c1482a = OfferBanner.Companion;
                return BannerType.Companion.serializer();
            case 7:
                return C0939m.f11517f.m5254a();
            case 8:
                return AbstractC0278f.m1260j("");
            case 9:
                return AbstractC0278f.m1260j("");
            case 10:
                return AbstractC0278f.m1260j(Boolean.FALSE);
            case 11:
                return AbstractC0278f.m1260j(Boolean.FALSE);
            case 12:
                return AbstractC0278f.m1260j(Boolean.FALSE);
            case 13:
                return AbstractC0278f.m1260j("");
            case 14:
                return AbstractC0278f.m1260j("");
            case 15:
                return AbstractC0278f.m1260j("");
            case 16:
                C1702o c1702o = ParticipantStat.Companion;
                return new C2978ev(Target$$serializer.INSTANCE);
            case 17:
                vx7 vx7Var = ReaderPageFragment.Companion;
                return xfaVar;
            case 18:
                C1586m c1586m = RequestClozeTest.Companion;
                return new C2978ev(SentenceFragment$$serializer.INSTANCE);
            case 19:
                C1586m c1586m2 = RequestClozeTest.Companion;
                return new C2978ev(sk9.f60959a);
            case 20:
                C1590o c1590o = RequestDataCard.Companion;
                return new C2978ev(RequestHintUpdate$$serializer.INSTANCE);
            case 21:
                C1590o c1590o2 = RequestDataCard.Companion;
                return new C2978ev(sk9.f60959a);
            case 22:
                C1594q c1594q = RequestDictionariesOrder.Companion;
                return new C2978ev(l84.f49294a);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                C1598s c1598s = RequestFeedLevels.Companion;
                return new C2978ev(sk9.f60959a);
            case 24:
                C1600t c1600t = RequestFeedQuery.Companion;
                return new ke5(l84.f49294a);
            case 25:
                C1562c0 c1562c0 = RequestLessonImport.Companion;
                return new C2978ev(sk9.f60959a);
            case 26:
                C1574g0 c1574g0 = RequestLessonUpdateTimestamps.Companion;
                return new C2978ev(thb.m22059r(dj2.f35711a));
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                C1583k0 c1583k0 = RequestNotice.Companion;
                return new C2978ev(l84.f49294a);
            case 28:
                C1585l0 c1585l0 = RequestNotification.Companion;
                return new C2978ev(l84.f49294a);
            default:
                C1593p0 c1593p0 = RequestPlaylistOrder.Companion;
                return new C2978ev(l84.f49294a);
        }
    }
}
