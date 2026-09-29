package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.database.entity.C1360s;
import com.lingq.core.database.entity.C1362u;
import com.lingq.core.database.entity.LessonEntity;
import com.lingq.core.database.entity.LessonSentenceEntity;
import com.lingq.core.database.entity.TranslationSentenceEntity$$serializer;
import com.lingq.core.domain.model.lesson.C1446k;
import com.lingq.core.domain.model.lesson.C1447l;
import com.lingq.core.domain.model.lesson.C1450o;
import com.lingq.core.domain.model.lesson.C1451p;
import com.lingq.core.domain.model.lesson.C1453r;
import com.lingq.core.domain.model.lesson.C1454s;
import com.lingq.core.domain.model.lesson.C1455t;
import com.lingq.core.domain.model.lesson.LessonSentence;
import com.lingq.core.domain.model.lesson.LessonSentencesTranslation;
import com.lingq.core.domain.model.lesson.LessonTextToken;
import com.lingq.core.domain.model.lesson.LessonTextToken$$serializer;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.core.domain.model.lesson.LessonUserCompleted;
import com.lingq.core.domain.model.lesson.LessonUserLiked;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.lesson.Note$$serializer;
import com.lingq.core.domain.model.lesson.Translation$$serializer;
import com.lingq.core.domain.model.library.C1462d;
import com.lingq.core.domain.model.library.LessonInfo;
import com.lingq.core.domain.model.token.TokenMeaning$$serializer;
import com.lingq.feature.reader.stats.p019ui.components.AbstractC2558b;
import java.util.Date;
import java.util.List;
import kotlinx.datetime.format.Padding;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b25 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7792a;

    public /* synthetic */ b25(int i) {
        this.f7792a = i;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f7792a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                C1360s c1360s = LessonEntity.Companion;
                return new C2978ev(sk9.f60959a);
            case 1:
                C1360s c1360s2 = LessonEntity.Companion;
                return new C2978ev(thb.m22059r(TranslationSentenceEntity$$serializer.INSTANCE));
            case 2:
                C1360s c1360s3 = LessonEntity.Companion;
                return new C2978ev(sk9.f60959a);
            case 3:
                C1462d c1462d = LessonInfo.Companion;
                return new C2978ev(sk9.f60959a);
            case 4:
                C1446k c1446k = LessonSentence.Companion;
                return new C2978ev(LessonTextToken$$serializer.INSTANCE);
            case 5:
                C1446k c1446k2 = LessonSentence.Companion;
                return new C2978ev(l73.f49244a);
            case 6:
                C1362u c1362u = LessonSentenceEntity.Companion;
                return new C2978ev(LessonTextToken$$serializer.INSTANCE);
            case 7:
                C1362u c1362u2 = LessonSentenceEntity.Companion;
                return new C2978ev(l73.f49244a);
            case 8:
                C1447l c1447l = LessonSentencesTranslation.Companion;
                return new C2978ev(thb.m22059r(sk9.f60959a));
            case 9:
                C1450o c1450o = LessonTextToken.Companion;
                sk9 sk9Var = sk9.f60959a;
                return new je5(sk9Var, sk9Var);
            case 10:
                C1451p c1451p = LessonTranslationSentence.Companion;
                return new C2978ev(Translation$$serializer.INSTANCE);
            case 11:
                C1451p c1451p2 = LessonTranslationSentence.Companion;
                return new C2978ev(Note$$serializer.INSTANCE);
            case 12:
                C1453r c1453r = LessonUserCompleted.Companion;
                return new am1(y38.m24933a(Date.class), null, new KSerializer[0]);
            case 13:
                C1454s c1454s = LessonUserLiked.Companion;
                return new am1(y38.m24933a(Date.class), null, new KSerializer[0]);
            case 14:
                C1455t c1455t = LessonWord.Companion;
                return new C2978ev(sk9.f60959a);
            case 15:
                C1455t c1455t2 = LessonWord.Companion;
                return new C2978ev(sk9.f60959a);
            case 16:
                C1455t c1455t3 = LessonWord.Companion;
                return new C2978ev(TokenMeaning$$serializer.INSTANCE);
            case 17:
                C1455t c1455t4 = LessonWord.Companion;
                return new C2978ev(sk9.f60959a);
            case 18:
                C1455t c1455t5 = LessonWord.Companion;
                return new C2978ev(sk9.f60959a);
            case 19:
                C1455t c1455t6 = LessonWord.Companion;
                return new C2978ev(sk9.f60959a);
            case 20:
                C1455t c1455t7 = LessonWord.Companion;
                return new C2978ev(sk9.f60959a);
            case 21:
                C1455t c1455t8 = LessonWord.Companion;
                return new C2978ev(sk9.f60959a);
            case 22:
                C1455t c1455t9 = LessonWord.Companion;
                return new C2978ev(sk9.f60959a);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                List list = xd5.f68099a;
                return xfaVar;
            case 24:
                uh5 uh5Var = new uh5(new vqb(3));
                i12.m13611c(uh5Var);
                mad.m16721c(uh5Var, '-');
                i12.m13612f(uh5Var);
                mad.m16721c(uh5Var, '-');
                g12.m12277g(uh5Var);
                return new vh5(uh5Var.build());
            case 25:
                uh5 uh5Var2 = new uh5(new vqb(3));
                i12.m13611c(uh5Var2);
                i12.m13612f(uh5Var2);
                g12.m12277g(uh5Var2);
                return new vh5(uh5Var2.build());
            case 26:
                vqb vqbVar = new vqb(3);
                bi5 bi5Var = new bi5(vqbVar);
                AbstractC2947e0 abstractC2947e0 = (AbstractC2947e0) wh5.f66827a.getValue();
                abstractC2947e0.getClass();
                vqbVar.m23473o(((vh5) abstractC2947e0).f65394a);
                mad.m16720b(bi5Var, new vi3[]{new ry4(20)}, new ry4(21));
                oi5 oi5Var = (oi5) pi5.f56249a.getValue();
                oi5Var.getClass();
                vqbVar.m23473o(oi5Var.f54375a);
                return new ci5(bi5Var.build());
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                zf1 zf1Var = ii5.f44145a;
                return null;
            case 28:
                vqb vqbVar2 = new vqb(3);
                ni5 ni5Var = new ni5(vqbVar2);
                Padding padding = Padding.ZERO;
                padding.getClass();
                vqbVar2.m23473o(new ta0(new qv3(padding)));
                mad.m16721c(ni5Var, ':');
                vqbVar2.m23473o(new ta0(new e06(padding)));
                mad.m16720b(ni5Var, new vi3[]{new ry4(22)}, new ry4(23));
                return new oi5(ni5Var.build());
            default:
                int i2 = AbstractC2558b.f30991b;
                return xfaVar;
        }
    }
}
