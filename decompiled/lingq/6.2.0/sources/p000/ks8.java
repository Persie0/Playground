package p000;

import androidx.compose.runtime.AbstractC0278f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.database.entity.C1347l0;
import com.lingq.core.database.entity.StatsCalendarEntity;
import com.lingq.core.domain.model.language.C1433m;
import com.lingq.core.domain.model.language.StatsCalendar;
import com.lingq.core.domain.model.language.StatsCalendarDay$$serializer;
import com.lingq.core.domain.model.token.C1488d;
import com.lingq.core.domain.model.token.C1494j;
import com.lingq.core.domain.model.token.C1495k;
import com.lingq.core.domain.model.token.TextToSpeechAppVoice$$serializer;
import com.lingq.core.domain.model.token.TextToSpeechVoice;
import com.lingq.core.domain.model.token.TokenMeaning$$serializer;
import com.lingq.core.domain.model.token.TokenReadings;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.feature.imports.C2104a;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ks8 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48392a;

    public /* synthetic */ ks8(int i) {
        this.f48392a = i;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        switch (this.f48392a) {
            case 0:
                return AbstractC0278f.m1260j(Boolean.FALSE);
            case 1:
                return AbstractC3208a.m15434a();
            case 2:
                return AbstractC0278f.m1260j(Boolean.FALSE);
            case 3:
                return AbstractC0278f.m1257g(0);
            case 4:
                return AbstractC0278f.m1258h(0L);
            case 5:
                return AbstractC0278f.m1260j("");
            case 6:
                return AbstractC0278f.m1260j(Boolean.FALSE);
            case 7:
                return AbstractC0278f.m1260j(Boolean.FALSE);
            case 8:
                return AbstractC0278f.m1260j("");
            case 9:
                return AbstractC0278f.m1260j("");
            case 10:
                return AbstractC0278f.m1260j(Boolean.FALSE);
            case 11:
                return AbstractC0278f.m1260j("");
            case 12:
                C1433m c1433m = StatsCalendar.Companion;
                return new C2978ev(StatsCalendarDay$$serializer.INSTANCE);
            case 13:
                C1347l0 c1347l0 = StatsCalendarEntity.Companion;
                return new C2978ev(StatsCalendarDay$$serializer.INSTANCE);
            case 14:
                return C2104a.m9002a(new tk4());
            case 15:
                return C2104a.m9002a(new yc4());
            case 16:
                return C2104a.m9002a(new x01());
            case 17:
                return C2104a.m9002a(new x01());
            case 18:
                C1488d c1488d = TextToSpeechVoice.Companion;
                return new C2978ev(TextToSpeechAppVoice$$serializer.INSTANCE);
            case 19:
                C1488d c1488d2 = TextToSpeechVoice.Companion;
                return new C2978ev(sk9.f60959a);
            case 20:
                C1488d c1488d3 = TextToSpeechVoice.Companion;
                return new C2978ev(sk9.f60959a);
            case 21:
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (vk9.m23391n0("kotlinx.datetime.TimeBased")) {
                    C3386nv.m17626m("Blank serial names are prohibited");
                    return null;
                }
                a31 a31Var = new a31("kotlinx.datetime.TimeBased");
                rk5 rk5Var = rk5.f59434a;
                a31Var.m56a("nanoseconds", rk5.f59435b);
                return new zx8("kotlinx.datetime.TimeBased", hl9.f42585y, a31Var.f165c.size(), AbstractC3550rv.m20852t0(serialDescriptorArr), a31Var);
            case 22:
                return AbstractC0278f.m1260j(new vv9("", 6, 0L));
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                C1494j c1494j = TokenReadings.Companion;
                return new C2978ev(sk9.f60959a);
            case 24:
                C1494j c1494j2 = TokenReadings.Companion;
                return new C2978ev(sk9.f60959a);
            case 25:
                C1494j c1494j3 = TokenReadings.Companion;
                return new C2978ev(sk9.f60959a);
            case 26:
                C1494j c1494j4 = TokenReadings.Companion;
                return new C2978ev(sk9.f60959a);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                C1494j c1494j5 = TokenReadings.Companion;
                return new C2978ev(sk9.f60959a);
            case 28:
                C1494j c1494j6 = TokenReadings.Companion;
                return new C2978ev(sk9.f60959a);
            default:
                C1495k c1495k = TokenRelatedPhrase.Companion;
                return new C2978ev(TokenMeaning$$serializer.INSTANCE);
        }
    }

    public /* synthetic */ ks8(Object obj, int i) {
        this.f48392a = i;
    }
}
