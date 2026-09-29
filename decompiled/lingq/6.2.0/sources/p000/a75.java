package p000;

import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment;
import com.lingq.feature.reader.vocabulary.C2610a;
import com.lingq.feature.reader.vocabulary.model.VocabularyType;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a75 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f319a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonVocabularyFragment f320b;

    public /* synthetic */ a75(LessonVocabularyFragment lessonVocabularyFragment, int i) {
        this.f319a = i;
        this.f320b = lessonVocabularyFragment;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f319a;
        final int i2 = 0;
        final int i3 = 2;
        final int i4 = 1;
        xfa xfaVar = xfa.f68157a;
        final LessonVocabularyFragment lessonVocabularyFragment = this.f320b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                bh4[] bh4VarArr = LessonVocabularyFragment.f29676G0;
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    fy9.m12246a(false, null, ci8.m4703P(-220084622, new a75(lessonVocabularyFragment, i4), tj3Var), tj3Var, 384);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                bh4[] bh4VarArr2 = LessonVocabularyFragment.f29676G0;
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    t66 t66VarM2513c = AbstractC0711a.m2513c(lessonVocabularyFragment.m9356S0().f31670p, tj3Var2);
                    t66 t66VarM2513c2 = AbstractC0711a.m2513c(lessonVocabularyFragment.m9356S0().f31675u, tj3Var2);
                    t66 t66VarM2513c3 = AbstractC0711a.m2513c(lessonVocabularyFragment.m9356S0().f31677w, tj3Var2);
                    vs3 vs3Var = (vs3) AbstractC0711a.m2513c(lessonVocabularyFragment.m9356S0().f31655C, tj3Var2).getValue();
                    List list = (List) t66VarM2513c.getValue();
                    boolean zBooleanValue = ((Boolean) t66VarM2513c2.getValue()).booleanValue();
                    int iOrdinal = ((VocabularyType) t66VarM2513c3.getValue()).ordinal();
                    boolean zM22124i = tj3Var2.m22124i(lessonVocabularyFragment);
                    Object objM22097O = tj3Var2.m22097O();
                    p84 p84Var = we1.f66679a;
                    if (zM22124i || objM22097O == p84Var) {
                        objM22097O = new vi3() { // from class: z65
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                int i5 = i4;
                                xfa xfaVar2 = xfa.f68157a;
                                LessonVocabularyFragment lessonVocabularyFragment2 = lessonVocabularyFragment;
                                switch (i5) {
                                    case 0:
                                        w65 w65Var = (w65) obj3;
                                        bh4[] bh4VarArr3 = LessonVocabularyFragment.f29676G0;
                                        w65Var.getClass();
                                        lessonVocabularyFragment2.m9356S0().m9529W2(w65Var);
                                        break;
                                    case 1:
                                        int iIntValue3 = ((Integer) obj3).intValue();
                                        bh4[] bh4VarArr4 = LessonVocabularyFragment.f29676G0;
                                        lessonVocabularyFragment2.m9356S0().f31676v.m15571i(((VocabularyType[]) VocabularyType.getEntries().toArray(new VocabularyType[0]))[iIntValue3]);
                                        break;
                                    case 2:
                                        w65 w65Var2 = (w65) obj3;
                                        bh4[] bh4VarArr5 = LessonVocabularyFragment.f29676G0;
                                        w65Var2.getClass();
                                        if (w65Var2 instanceof LessonCard) {
                                            C2610a c2610aM9356S0 = lessonVocabularyFragment2.m9356S0();
                                            String str = ((LessonCard) w65Var2).f19178a;
                                            TokenType tokenType = TokenType.CardType;
                                            str.getClass();
                                            tokenType.getClass();
                                            c2610aM9356S0.f31678x.mo4677k(new Pair(str, tokenType));
                                        } else if (w65Var2 instanceof LessonWord) {
                                            C2610a c2610aM9356S1 = lessonVocabularyFragment2.m9356S0();
                                            String str2 = ((LessonWord) w65Var2).f19314a;
                                            TokenType tokenType2 = TokenType.WordType;
                                            str2.getClass();
                                            tokenType2.getClass();
                                            c2610aM9356S1.f31678x.mo4677k(new Pair(str2, tokenType2));
                                        }
                                        break;
                                    default:
                                        LessonWord lessonWord = (LessonWord) obj3;
                                        bh4[] bh4VarArr6 = LessonVocabularyFragment.f29676G0;
                                        lessonWord.getClass();
                                        lessonVocabularyFragment2.m9356S0().m9528V2(CardStatus.New.getValue(), lessonWord.f19314a);
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var2.m22131l0(objM22097O);
                    }
                    vi3 vi3Var = (vi3) objM22097O;
                    boolean zM22124i2 = tj3Var2.m22124i(lessonVocabularyFragment);
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22124i2 || objM22097O2 == p84Var) {
                        objM22097O2 = new vi3() { // from class: z65
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                int i5 = i3;
                                xfa xfaVar2 = xfa.f68157a;
                                LessonVocabularyFragment lessonVocabularyFragment2 = lessonVocabularyFragment;
                                switch (i5) {
                                    case 0:
                                        w65 w65Var = (w65) obj3;
                                        bh4[] bh4VarArr3 = LessonVocabularyFragment.f29676G0;
                                        w65Var.getClass();
                                        lessonVocabularyFragment2.m9356S0().m9529W2(w65Var);
                                        break;
                                    case 1:
                                        int iIntValue3 = ((Integer) obj3).intValue();
                                        bh4[] bh4VarArr4 = LessonVocabularyFragment.f29676G0;
                                        lessonVocabularyFragment2.m9356S0().f31676v.m15571i(((VocabularyType[]) VocabularyType.getEntries().toArray(new VocabularyType[0]))[iIntValue3]);
                                        break;
                                    case 2:
                                        w65 w65Var2 = (w65) obj3;
                                        bh4[] bh4VarArr5 = LessonVocabularyFragment.f29676G0;
                                        w65Var2.getClass();
                                        if (w65Var2 instanceof LessonCard) {
                                            C2610a c2610aM9356S0 = lessonVocabularyFragment2.m9356S0();
                                            String str = ((LessonCard) w65Var2).f19178a;
                                            TokenType tokenType = TokenType.CardType;
                                            str.getClass();
                                            tokenType.getClass();
                                            c2610aM9356S0.f31678x.mo4677k(new Pair(str, tokenType));
                                        } else if (w65Var2 instanceof LessonWord) {
                                            C2610a c2610aM9356S1 = lessonVocabularyFragment2.m9356S0();
                                            String str2 = ((LessonWord) w65Var2).f19314a;
                                            TokenType tokenType2 = TokenType.WordType;
                                            str2.getClass();
                                            tokenType2.getClass();
                                            c2610aM9356S1.f31678x.mo4677k(new Pair(str2, tokenType2));
                                        }
                                        break;
                                    default:
                                        LessonWord lessonWord = (LessonWord) obj3;
                                        bh4[] bh4VarArr6 = LessonVocabularyFragment.f29676G0;
                                        lessonWord.getClass();
                                        lessonVocabularyFragment2.m9356S0().m9528V2(CardStatus.New.getValue(), lessonWord.f19314a);
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    vi3 vi3Var2 = (vi3) objM22097O2;
                    boolean zM22124i3 = tj3Var2.m22124i(lessonVocabularyFragment);
                    Object objM22097O3 = tj3Var2.m22097O();
                    if (zM22124i3 || objM22097O3 == p84Var) {
                        objM22097O3 = new a75(lessonVocabularyFragment, i3);
                        tj3Var2.m22131l0(objM22097O3);
                    }
                    zi3 zi3Var = (zi3) objM22097O3;
                    boolean zM22124i4 = tj3Var2.m22124i(lessonVocabularyFragment);
                    Object objM22097O4 = tj3Var2.m22097O();
                    final int i5 = 3;
                    if (zM22124i4 || objM22097O4 == p84Var) {
                        objM22097O4 = new vi3() { // from class: z65
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                int i6 = i5;
                                xfa xfaVar2 = xfa.f68157a;
                                LessonVocabularyFragment lessonVocabularyFragment2 = lessonVocabularyFragment;
                                switch (i6) {
                                    case 0:
                                        w65 w65Var = (w65) obj3;
                                        bh4[] bh4VarArr3 = LessonVocabularyFragment.f29676G0;
                                        w65Var.getClass();
                                        lessonVocabularyFragment2.m9356S0().m9529W2(w65Var);
                                        break;
                                    case 1:
                                        int iIntValue3 = ((Integer) obj3).intValue();
                                        bh4[] bh4VarArr4 = LessonVocabularyFragment.f29676G0;
                                        lessonVocabularyFragment2.m9356S0().f31676v.m15571i(((VocabularyType[]) VocabularyType.getEntries().toArray(new VocabularyType[0]))[iIntValue3]);
                                        break;
                                    case 2:
                                        w65 w65Var2 = (w65) obj3;
                                        bh4[] bh4VarArr5 = LessonVocabularyFragment.f29676G0;
                                        w65Var2.getClass();
                                        if (w65Var2 instanceof LessonCard) {
                                            C2610a c2610aM9356S0 = lessonVocabularyFragment2.m9356S0();
                                            String str = ((LessonCard) w65Var2).f19178a;
                                            TokenType tokenType = TokenType.CardType;
                                            str.getClass();
                                            tokenType.getClass();
                                            c2610aM9356S0.f31678x.mo4677k(new Pair(str, tokenType));
                                        } else if (w65Var2 instanceof LessonWord) {
                                            C2610a c2610aM9356S1 = lessonVocabularyFragment2.m9356S0();
                                            String str2 = ((LessonWord) w65Var2).f19314a;
                                            TokenType tokenType2 = TokenType.WordType;
                                            str2.getClass();
                                            tokenType2.getClass();
                                            c2610aM9356S1.f31678x.mo4677k(new Pair(str2, tokenType2));
                                        }
                                        break;
                                    default:
                                        LessonWord lessonWord = (LessonWord) obj3;
                                        bh4[] bh4VarArr6 = LessonVocabularyFragment.f29676G0;
                                        lessonWord.getClass();
                                        lessonVocabularyFragment2.m9356S0().m9528V2(CardStatus.New.getValue(), lessonWord.f19314a);
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var2.m22131l0(objM22097O4);
                    }
                    vi3 vi3Var3 = (vi3) objM22097O4;
                    boolean zM22124i5 = tj3Var2.m22124i(lessonVocabularyFragment);
                    Object objM22097O5 = tj3Var2.m22097O();
                    if (zM22124i5 || objM22097O5 == p84Var) {
                        objM22097O5 = new a75(lessonVocabularyFragment, i5);
                        tj3Var2.m22131l0(objM22097O5);
                    }
                    zi3 zi3Var2 = (zi3) objM22097O5;
                    boolean zM22124i6 = tj3Var2.m22124i(lessonVocabularyFragment);
                    Object objM22097O6 = tj3Var2.m22097O();
                    if (zM22124i6 || objM22097O6 == p84Var) {
                        objM22097O6 = new vi3() { // from class: z65
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                int i6 = i2;
                                xfa xfaVar2 = xfa.f68157a;
                                LessonVocabularyFragment lessonVocabularyFragment2 = lessonVocabularyFragment;
                                switch (i6) {
                                    case 0:
                                        w65 w65Var = (w65) obj3;
                                        bh4[] bh4VarArr3 = LessonVocabularyFragment.f29676G0;
                                        w65Var.getClass();
                                        lessonVocabularyFragment2.m9356S0().m9529W2(w65Var);
                                        break;
                                    case 1:
                                        int iIntValue3 = ((Integer) obj3).intValue();
                                        bh4[] bh4VarArr4 = LessonVocabularyFragment.f29676G0;
                                        lessonVocabularyFragment2.m9356S0().f31676v.m15571i(((VocabularyType[]) VocabularyType.getEntries().toArray(new VocabularyType[0]))[iIntValue3]);
                                        break;
                                    case 2:
                                        w65 w65Var2 = (w65) obj3;
                                        bh4[] bh4VarArr5 = LessonVocabularyFragment.f29676G0;
                                        w65Var2.getClass();
                                        if (w65Var2 instanceof LessonCard) {
                                            C2610a c2610aM9356S0 = lessonVocabularyFragment2.m9356S0();
                                            String str = ((LessonCard) w65Var2).f19178a;
                                            TokenType tokenType = TokenType.CardType;
                                            str.getClass();
                                            tokenType.getClass();
                                            c2610aM9356S0.f31678x.mo4677k(new Pair(str, tokenType));
                                        } else if (w65Var2 instanceof LessonWord) {
                                            C2610a c2610aM9356S1 = lessonVocabularyFragment2.m9356S0();
                                            String str2 = ((LessonWord) w65Var2).f19314a;
                                            TokenType tokenType2 = TokenType.WordType;
                                            str2.getClass();
                                            tokenType2.getClass();
                                            c2610aM9356S1.f31678x.mo4677k(new Pair(str2, tokenType2));
                                        }
                                        break;
                                    default:
                                        LessonWord lessonWord = (LessonWord) obj3;
                                        bh4[] bh4VarArr6 = LessonVocabularyFragment.f29676G0;
                                        lessonWord.getClass();
                                        lessonVocabularyFragment2.m9356S0().m9528V2(CardStatus.New.getValue(), lessonWord.f19314a);
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var2.m22131l0(objM22097O6);
                    }
                    mjd.m16863a(iOrdinal, list, zBooleanValue, vs3Var, vi3Var, vi3Var2, zi3Var, vi3Var3, zi3Var2, (vi3) objM22097O6, tj3Var2, 0);
                }
                break;
            case 2:
                String str = (String) obj;
                String str2 = (String) obj2;
                bh4[] bh4VarArr3 = LessonVocabularyFragment.f29676G0;
                str.getClass();
                str2.getClass();
                if (str2.equals(WordStatus.Known.getValue()) || str2.equals(WordStatus.Ignored.getValue())) {
                    lessonVocabularyFragment.m9356S0().m9531Y2(str, str2);
                }
                break;
            default:
                String str3 = (String) obj;
                TokenStatus tokenStatus = (TokenStatus) obj2;
                bh4[] bh4VarArr4 = LessonVocabularyFragment.f29676G0;
                str3.getClass();
                tokenStatus.getClass();
                lessonVocabularyFragment.m9356S0().m9530X2(str3, tokenStatus);
                break;
        }
        return xfaVar;
    }
}
