package p000;

import android.content.Context;
import androidx.compose.p002ui.platform.AbstractC0394f;
import com.lingq.core.domain.model.challenge.BookChallengeBookStatus;
import com.lingq.core.network.api.result.Book;
import com.lingq.core.network.api.result.BookData;
import com.lingq.core.network.api.result.BookObject;
import com.lingq.core.network.api.result.Extra;
import com.lingq.core.network.api.result.Participant;
import com.lingq.core.network.api.result.ParticipantStat;
import com.lingq.core.network.api.result.ResultChallenge;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w4d {
    /* JADX INFO: renamed from: a */
    public static final void m23758a(e16 e16Var, qj9 qj9Var, ye1 ye1Var, int i) {
        qj9Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1985386923);
        int i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i | (tj3Var.m22124i(qj9Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            r46.m20381f(c99.m4412e(e16Var, 1.0f), null, null, null, ci8.m4703P(227775679, new iz4(21, qj9Var, (Context) tj3Var.m22128k(AbstractC0394f.f4761b)), tj3Var), tj3Var, 24576, 14);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new eq8(e16Var, i, 14, qj9Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0125  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX INFO: renamed from: b */
    public static final ef0 m23759b(ResultChallenge resultChallenge) {
        de0 de0Var;
        ?? arrayList;
        Book book;
        Integer num;
        Double d;
        de0 de0Var2;
        ?? r14;
        Object next;
        Double d2;
        resultChallenge.getClass();
        Participant participant = resultChallenge.f20667j;
        de0 de0Var3 = null;
        if (participant == null) {
            return null;
        }
        Extra extra = participant.f20569a;
        boolean z = (extra != null ? extra.f20523b : null) != null;
        double dDoubleValue = 0.0d;
        List<Book> listM23604J = EmptyList.f47638a;
        if (z) {
            List list = extra != null ? extra.f20523b : null;
            if (list != null) {
                listM23604J = list;
            }
            arrayList = new ArrayList();
            for (Book book2 : listM23604J) {
                BookObject bookObject = book2.f20498c;
                BookData bookData = book2.f20499d;
                if (bookObject == null) {
                    de0Var2 = de0Var3;
                } else {
                    Integer num2 = bookObject.f20503a;
                    if (num2 != null) {
                        int iIntValue = num2.intValue();
                        String str = bookObject.f20506d;
                        String str2 = str == null ? "" : str;
                        String str3 = bookObject.f20504b;
                        String str4 = str3 == null ? "" : str3;
                        String str5 = bookObject.f20505c;
                        if (str5 != null) {
                            r14 = str5;
                        } else if (bookData != null) {
                            str5 = bookData.f20500a;
                            r14 = str5;
                        } else {
                            r14 = de0Var3;
                        }
                        double dDoubleValue2 = (bookData == null || (d2 = bookData.f20501b) == null) ? 0.0d : d2.doubleValue();
                        ee0 ee0Var = BookChallengeBookStatus.Companion;
                        Object obj = bookData != null ? bookData.f20502c : de0Var3;
                        ee0Var.getClass();
                        Iterator it = BookChallengeBookStatus.getEntries().iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!fa4.m11650l(((BookChallengeBookStatus) next).getWireValue(), obj));
                        BookChallengeBookStatus bookChallengeBookStatus = (BookChallengeBookStatus) next;
                        if (bookChallengeBookStatus == null) {
                            bookChallengeBookStatus = BookChallengeBookStatus.Unknown;
                        }
                        de0Var2 = new de0(iIntValue, str2, str4, r14, dDoubleValue2, bookChallengeBookStatus);
                    } else {
                        de0Var2 = null;
                    }
                }
                if (de0Var2 != null) {
                    arrayList.add(de0Var2);
                }
                de0Var3 = null;
            }
        } else {
            if (extra == null || (book = extra.f20522a) == null) {
                de0Var = null;
            } else {
                ParticipantStat participantStat = participant.f20570b;
                BookObject bookObject2 = book.f20498c;
                BookData bookData2 = book.f20499d;
                if (bookObject2 == null || (num = bookObject2.f20503a) == null) {
                    de0Var = null;
                } else {
                    int iIntValue2 = num.intValue();
                    if (bookData2 == null || (d = bookData2.f20501b) == null) {
                        Double d3 = participantStat != null ? participantStat.f20577d : null;
                        if (d3 != null) {
                            dDoubleValue = d3.doubleValue();
                        }
                    } else {
                        dDoubleValue = d.doubleValue();
                    }
                    double d4 = dDoubleValue;
                    BookChallengeBookStatus bookChallengeBookStatus2 = d4 >= 100.0d ? BookChallengeBookStatus.Successful : BookChallengeBookStatus.InProgress;
                    String str6 = bookObject2.f20506d;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String str7 = bookObject2.f20504b;
                    String str8 = str7 != null ? str7 : "";
                    String str9 = bookObject2.f20505c;
                    de0Var = new de0(iIntValue2, str6, str8, str9 == null ? bookData2 != null ? bookData2.f20500a : null : str9, l70.m15943f(d4, 0.0d, 100.0d), bookChallengeBookStatus2);
                }
            }
            if (de0Var != null) {
                listM23604J = vz1.m23604J(de0Var);
            }
            arrayList = listM23604J;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : (Iterable) arrayList) {
            if (hashSet.add(Integer.valueOf(((de0) obj2).f35485a))) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (!((de0) obj3).m10306a()) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : arrayList2) {
            if (((de0) obj4).m10306a()) {
                arrayList4.add(obj4);
            }
        }
        return new ef0(u91.m22603U0(arrayList4, arrayList3), z);
    }
}
