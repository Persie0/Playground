package p000;

import androidx.compose.runtime.AbstractC0278f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.database.entity.C1353o0;
import com.lingq.core.database.entity.C1355p0;
import com.lingq.core.database.entity.C1359r0;
import com.lingq.core.database.entity.TranslationSentenceEntity;
import com.lingq.core.database.entity.TranslationsEntity;
import com.lingq.core.database.entity.WordEntity;
import com.lingq.core.domain.model.lesson.Note$$serializer;
import com.lingq.core.domain.model.lesson.Translation$$serializer;
import com.lingq.core.domain.model.token.C1497m;
import com.lingq.core.domain.model.token.TokenMeaning$$serializer;
import com.lingq.core.domain.model.token.TokenTranslationSimple$$serializer;
import com.lingq.core.domain.model.token.TokenTranslations;
import com.lingq.core.network.api.result.C1641d5;
import com.lingq.core.network.api.result.ValidationMessage;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e5a implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36730a;

    public /* synthetic */ e5a(int i) {
        this.f36730a = i;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        switch (this.f36730a) {
            case 0:
                C1497m c1497m = TokenTranslations.Companion;
                return new C2978ev(TokenTranslationSimple$$serializer.INSTANCE);
            case 1:
                x17 x17Var = h7a.f41916a;
                return Boolean.TRUE;
            case 2:
                fs6 fs6Var = l7a.f49255e;
                return Boolean.TRUE;
            case 3:
                C1353o0 c1353o0 = TranslationSentenceEntity.Companion;
                return new C2978ev(Translation$$serializer.INSTANCE);
            case 4:
                C1353o0 c1353o1 = TranslationSentenceEntity.Companion;
                return new C2978ev(Note$$serializer.INSTANCE);
            case 5:
                C1355p0 c1355p0 = TranslationsEntity.Companion;
                return new C2978ev(TokenTranslationSimple$$serializer.INSTANCE);
            case 6:
                return xfa.f68157a;
            case 7:
                hma hmaVar = new hma(new vqb(3));
                mad.m16720b(hmaVar, new vi3[]{new ow8(24)}, new ow8(25));
                return new ima(hmaVar.build());
            case 8:
                hma hmaVar2 = new hma(new vqb(3));
                mad.m16720b(hmaVar2, new vi3[]{new ow8(26)}, new ow8(27));
                return new ima(hmaVar2.build());
            case 9:
                hma hmaVar3 = new hma(new vqb(3));
                hma.m13335i(hmaVar3);
                hma.m13336j(hmaVar3);
                return new ima(hmaVar3.build());
            case 10:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
            case 11:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
            case 12:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
            case 13:
                C1641d5 c1641d5 = ValidationMessage.Companion;
                return new C2978ev(sk9.f60959a);
            case 14:
                return AbstractC0278f.m1260j(Boolean.FALSE);
            case 15:
                return AbstractC0278f.m1260j("");
            case 16:
                C1359r0 c1359r0 = WordEntity.Companion;
                return new C2978ev(TokenMeaning$$serializer.INSTANCE);
            case 17:
                C1359r0 c1359r1 = WordEntity.Companion;
                return new C2978ev(sk9.f60959a);
            case 18:
                C1359r0 c1359r2 = WordEntity.Companion;
                return new C2978ev(sk9.f60959a);
            case 19:
                C1359r0 c1359r3 = WordEntity.Companion;
                return new C2978ev(sk9.f60959a);
            case 20:
                C1359r0 c1359r4 = WordEntity.Companion;
                return new C2978ev(sk9.f60959a);
            case 21:
                C1359r0 c1359r5 = WordEntity.Companion;
                return new C2978ev(sk9.f60959a);
            case 22:
                C1359r0 c1359r6 = WordEntity.Companion;
                return new C2978ev(sk9.f60959a);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                C1359r0 c1359r7 = WordEntity.Companion;
                return new C2978ev(sk9.f60959a);
            case 24:
                C1359r0 c1359r8 = WordEntity.Companion;
                return new C2978ev(sk9.f60959a);
            case 25:
                jab jabVar = new jab(new vqb(3));
                i12.m13611c(jabVar);
                mad.m16721c(jabVar, '-');
                i12.m13612f(jabVar);
                return new kab(jabVar.build());
            default:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
        }
    }
}
