package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.database.entity.LessonBookmarkEntity;
import com.lingq.core.database.entity.LessonEntity;
import com.lingq.core.database.entity.LessonSentenceEntity;
import com.lingq.core.domain.model.lesson.LessonMetadata;
import com.lingq.core.domain.model.lesson.LessonPromotedCourse;
import com.lingq.core.domain.model.lesson.LessonReference;
import com.lingq.core.domain.model.lesson.LessonSentencesTranslation;
import com.lingq.core.domain.model.lesson.LessonSimplifiedOf;
import com.lingq.core.domain.model.lesson.LessonUserCompleted;
import com.lingq.core.domain.model.lesson.LessonUserLiked;
import com.lingq.core.network.api.result.ResultLesson;
import com.lingq.core.network.api.result.ResultLessonBookmark;
import com.lingq.core.network.api.result.ResultLessonMediaSource;
import com.lingq.core.network.api.result.ResultLessonMetadata;
import com.lingq.core.network.api.result.ResultLessonPromotedCourse;
import com.lingq.core.network.api.result.ResultLessonReference;
import com.lingq.core.network.api.result.ResultLessonSentencesTranslation;
import com.lingq.core.network.api.result.ResultLessonUserCompleted;
import com.lingq.core.network.api.result.ResultLessonUserLiked;
import com.lingq.core.network.api.result.ResultSentence;
import com.lingq.core.network.api.result.ResultSimplified;
import com.lingq.core.network.api.result.ResultTextToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class esc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f37783a = new C0282a(1866519965, false, new he1(13));

    /* JADX INFO: renamed from: b */
    public static final C0282a f37784b = new C0282a(-86029989, false, new he1(14));

    /* JADX INFO: renamed from: c */
    public static final C0282a f37785c = new C0282a(1085178682, false, new he1(15));

    /* JADX INFO: renamed from: a */
    public static final LessonBookmarkEntity m11329a(ResultLessonBookmark resultLessonBookmark, int i) {
        resultLessonBookmark.getClass();
        return new LessonBookmarkEntity(i, resultLessonBookmark.f21019d, resultLessonBookmark.f21016a, resultLessonBookmark.f21017b, resultLessonBookmark.f21018c, resultLessonBookmark.f21020e, resultLessonBookmark.f21021f);
    }

    /* JADX INFO: renamed from: b */
    public static final LessonEntity m11330b(ResultLesson resultLesson) {
        LessonMetadata lessonMetadata;
        resultLesson.getClass();
        int i = resultLesson.f20968a;
        String str = resultLesson.f20970b;
        int i2 = resultLesson.f20972c;
        String str2 = resultLesson.f20974d;
        String str3 = resultLesson.f20976e;
        String str4 = resultLesson.f20978f;
        String str5 = resultLesson.f20980g;
        String str6 = resultLesson.f20982h;
        int i3 = resultLesson.f20984i;
        String str7 = resultLesson.f20986j;
        String str8 = resultLesson.f20988k;
        String str9 = resultLesson.f20990l;
        int i4 = resultLesson.f20992m;
        int i5 = resultLesson.f20994n;
        int i6 = resultLesson.f21000q;
        double d = resultLesson.f21002r;
        double d2 = resultLesson.f21004s;
        int i7 = resultLesson.f21006t;
        String str10 = resultLesson.f21008u;
        ResultLessonUserLiked resultLessonUserLiked = resultLesson.f21015z;
        LessonUserLiked lessonUserLiked = resultLessonUserLiked == null ? null : new LessonUserLiked(resultLessonUserLiked.f21209a, resultLessonUserLiked.f21210b);
        ResultLessonUserCompleted resultLessonUserCompleted = resultLesson.f20942A;
        LessonUserCompleted lessonUserCompleted = resultLessonUserCompleted == null ? null : new LessonUserCompleted(resultLessonUserCompleted.f21206a, resultLessonUserCompleted.f21207b);
        ResultLessonSentencesTranslation resultLessonSentencesTranslation = resultLesson.f20943B;
        LessonSentencesTranslation lessonSentencesTranslation = resultLessonSentencesTranslation == null ? null : new LessonSentencesTranslation(resultLessonSentencesTranslation.f21109a, resultLessonSentencesTranslation.f21110b);
        String str11 = resultLesson.f20944C;
        ResultLessonMediaSource resultLessonMediaSource = resultLesson.f20945D;
        String str12 = resultLessonMediaSource != null ? resultLessonMediaSource.f21090a : null;
        String str13 = resultLessonMediaSource != null ? resultLessonMediaSource.f21091b : null;
        String str14 = resultLessonMediaSource != null ? resultLessonMediaSource.f21092c : null;
        String str15 = str13;
        Integer num = resultLesson.f20946E;
        Integer num2 = resultLesson.f20947F;
        LessonSentencesTranslation lessonSentencesTranslation2 = lessonSentencesTranslation;
        double d3 = resultLesson.f20948G;
        double d4 = resultLesson.f20949H;
        boolean z = resultLesson.f20950I;
        int i8 = resultLesson.f20951J;
        int i9 = resultLesson.f20952K;
        boolean z2 = resultLesson.f20953L;
        String str16 = resultLesson.f20954M;
        int i10 = resultLesson.f20955N;
        boolean z3 = resultLesson.f20956O;
        double d5 = resultLesson.f20957P;
        String str17 = resultLesson.f20958Q;
        String str18 = resultLesson.f20975d0;
        boolean z4 = resultLesson.f20959R;
        String str19 = resultLesson.f20960S;
        String str20 = resultLesson.f20961T;
        String str21 = resultLesson.f20962U;
        String str22 = resultLesson.f20963V;
        int i11 = resultLesson.f20964W;
        String str23 = resultLesson.f20966Y;
        String str24 = resultLesson.f20967Z;
        String str25 = resultLesson.f20971b0;
        String str26 = resultLesson.f20977e0;
        boolean z5 = resultLesson.f20981g0;
        boolean z6 = resultLesson.f20983h0;
        boolean z7 = resultLesson.f20985i0;
        int i12 = resultLesson.f20987j0;
        int i13 = resultLesson.f20989k0;
        String str27 = resultLesson.f20991l0;
        List list = resultLesson.f20993m0;
        String str28 = resultLesson.f20969a0;
        boolean z8 = resultLesson.f20995n0;
        String str29 = resultLesson.f20973c0;
        String str30 = resultLesson.f20979f0;
        ResultLessonReference resultLessonReference = resultLesson.f20997o0;
        LessonReference lessonReferenceM11333e = resultLessonReference != null ? m11333e(resultLessonReference) : null;
        ResultLessonReference resultLessonReference2 = resultLesson.f20999p0;
        LessonReference lessonReferenceM11333e2 = resultLessonReference2 != null ? m11333e(resultLessonReference2) : null;
        String str31 = resultLesson.f21001q0;
        ResultSimplified resultSimplified = resultLesson.f21003r0;
        LessonSimplifiedOf lessonSimplifiedOfM11334f = resultSimplified != null ? m11334f(resultSimplified) : null;
        ResultSimplified resultSimplified2 = resultLesson.f21005s0;
        LessonSimplifiedOf lessonSimplifiedOfM11334f2 = resultSimplified2 != null ? m11334f(resultSimplified2) : null;
        ResultLessonMetadata resultLessonMetadata = resultLesson.f21007t0;
        if (resultLessonMetadata != null) {
            lessonMetadata = new LessonMetadata(resultLessonMetadata.f21093a, resultLessonMetadata.f21094b, resultLessonMetadata.f21095c);
        } else {
            lessonMetadata = null;
        }
        return new LessonEntity(i, str, i2, str2, str3, str4, str5, str6, i3, str7, str8, str9, i4, i5, i6, d, d2, i7, str10, lessonUserLiked, lessonUserCompleted, lessonSentencesTranslation2, str11, str12, str15, str14, num, num2, lessonReferenceM11333e, lessonReferenceM11333e2, d3, d4, z, i8, i9, z2, str16, i10, z3, d5, str17, z4, str19, str20, str21, str22, i11, str23, str24, str28, str25, str29, str18, str26, str30, z5, z6, z7, i12, i13, str27, list, Boolean.FALSE, 0.0d, null, null, Boolean.valueOf(z8), m11332d(resultLesson.f21011v0), str31, lessonSimplifiedOfM11334f, lessonSimplifiedOfM11334f2, lessonMetadata, resultLesson.f21009u0, 25165826, 262144, 28696);
    }

    /* JADX INFO: renamed from: c */
    public static final LessonSentenceEntity m11331c(ResultSentence resultSentence, int i, int i2, boolean z) {
        resultSentence.getClass();
        List list = resultSentence.f21489a;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(huc.m13483a((ResultTextToken) it.next()));
        }
        String str = resultSentence.f21490b;
        String str2 = resultSentence.f21491c;
        List list2 = resultSentence.f21493e;
        return new LessonSentenceEntity(i, arrayList, str, str2, i2, list2 != null ? u91.m22587E0(list2) : null, z, resultSentence.f21494f, resultSentence.f21495g);
    }

    /* JADX INFO: renamed from: d */
    public static final LessonPromotedCourse m11332d(ResultLessonPromotedCourse resultLessonPromotedCourse) {
        if (resultLessonPromotedCourse == null) {
            return null;
        }
        return new LessonPromotedCourse(resultLessonPromotedCourse.f21096a, resultLessonPromotedCourse.f21097b, resultLessonPromotedCourse.f21098c);
    }

    /* JADX INFO: renamed from: e */
    public static final LessonReference m11333e(ResultLessonReference resultLessonReference) {
        resultLessonReference.getClass();
        return new LessonReference(resultLessonReference.f21099a, resultLessonReference.f21100b, resultLessonReference.f21101c, resultLessonReference.f21102d, resultLessonReference.f21103e, resultLessonReference.f21104f, resultLessonReference.f21105g, resultLessonReference.f21106h, resultLessonReference.f21107i, (String) null, (String) null, 1536);
    }

    /* JADX INFO: renamed from: f */
    public static final LessonSimplifiedOf m11334f(ResultSimplified resultSimplified) {
        resultSimplified.getClass();
        return new LessonSimplifiedOf(resultSimplified.f21510a, resultSimplified.f21512c, resultSimplified.f21511b);
    }

    /* JADX INFO: renamed from: g */
    public static final r45 m11335g(ResultLesson resultLesson) {
        resultLesson.getClass();
        int i = resultLesson.f20968a;
        String str = resultLesson.f20970b;
        int i2 = resultLesson.f20972c;
        String str2 = resultLesson.f20974d;
        String str3 = resultLesson.f20976e;
        String str4 = resultLesson.f20978f;
        String str5 = resultLesson.f20980g;
        String str6 = resultLesson.f20982h;
        int i3 = resultLesson.f20984i;
        String str7 = resultLesson.f20986j;
        String str8 = resultLesson.f20988k;
        String str9 = resultLesson.f20990l;
        int i4 = resultLesson.f20992m;
        int i5 = resultLesson.f20994n;
        int i6 = resultLesson.f21000q;
        double d = resultLesson.f21002r;
        double d2 = resultLesson.f21004s;
        int i7 = resultLesson.f21006t;
        String str10 = resultLesson.f21008u;
        ResultLessonUserLiked resultLessonUserLiked = resultLesson.f21015z;
        LessonMetadata lessonMetadata = null;
        LessonUserLiked lessonUserLiked = resultLessonUserLiked == null ? null : new LessonUserLiked(resultLessonUserLiked.f21209a, resultLessonUserLiked.f21210b);
        ResultLessonUserCompleted resultLessonUserCompleted = resultLesson.f20942A;
        LessonUserCompleted lessonUserCompleted = resultLessonUserCompleted == null ? null : new LessonUserCompleted(resultLessonUserCompleted.f21206a, resultLessonUserCompleted.f21207b);
        ResultLessonSentencesTranslation resultLessonSentencesTranslation = resultLesson.f20943B;
        LessonSentencesTranslation lessonSentencesTranslation = resultLessonSentencesTranslation == null ? null : new LessonSentencesTranslation(resultLessonSentencesTranslation.f21109a, resultLessonSentencesTranslation.f21110b);
        String str11 = resultLesson.f20944C;
        ResultLessonMediaSource resultLessonMediaSource = resultLesson.f20945D;
        String str12 = resultLessonMediaSource != null ? resultLessonMediaSource.f21090a : null;
        String str13 = resultLessonMediaSource != null ? resultLessonMediaSource.f21091b : null;
        String str14 = resultLessonMediaSource != null ? resultLessonMediaSource.f21092c : null;
        String str15 = str13;
        Integer num = resultLesson.f20946E;
        Integer num2 = resultLesson.f20947F;
        LessonSentencesTranslation lessonSentencesTranslation2 = lessonSentencesTranslation;
        double d3 = resultLesson.f20948G;
        double d4 = resultLesson.f20949H;
        boolean z = resultLesson.f20950I;
        int i8 = resultLesson.f20951J;
        int i9 = resultLesson.f20952K;
        boolean z2 = resultLesson.f20953L;
        String str16 = resultLesson.f20954M;
        int i10 = resultLesson.f20955N;
        boolean z3 = resultLesson.f20956O;
        double d5 = resultLesson.f20957P;
        String str17 = resultLesson.f20958Q;
        String str18 = resultLesson.f20975d0;
        boolean z4 = resultLesson.f20959R;
        String str19 = resultLesson.f20960S;
        String str20 = resultLesson.f20961T;
        String str21 = resultLesson.f20962U;
        String str22 = resultLesson.f20963V;
        int i11 = resultLesson.f20964W;
        String str23 = resultLesson.f20966Y;
        String str24 = resultLesson.f20967Z;
        String str25 = resultLesson.f20971b0;
        String str26 = resultLesson.f20977e0;
        boolean z5 = resultLesson.f20981g0;
        boolean z6 = resultLesson.f20983h0;
        boolean z7 = resultLesson.f20985i0;
        int i12 = resultLesson.f20987j0;
        int i13 = resultLesson.f20989k0;
        String str27 = resultLesson.f20991l0;
        List list = resultLesson.f20993m0;
        String str28 = resultLesson.f20969a0;
        boolean z8 = resultLesson.f20995n0;
        String str29 = resultLesson.f20973c0;
        String str30 = resultLesson.f20979f0;
        ResultLessonReference resultLessonReference = resultLesson.f20997o0;
        LessonReference lessonReferenceM11333e = resultLessonReference != null ? m11333e(resultLessonReference) : null;
        ResultLessonReference resultLessonReference2 = resultLesson.f20999p0;
        LessonReference lessonReferenceM11333e2 = resultLessonReference2 != null ? m11333e(resultLessonReference2) : null;
        String str31 = resultLesson.f21001q0;
        ResultSimplified resultSimplified = resultLesson.f21003r0;
        LessonSimplifiedOf lessonSimplifiedOfM11334f = resultSimplified != null ? m11334f(resultSimplified) : null;
        ResultSimplified resultSimplified2 = resultLesson.f21005s0;
        LessonSimplifiedOf lessonSimplifiedOfM11334f2 = resultSimplified2 != null ? m11334f(resultSimplified2) : null;
        ResultLessonMetadata resultLessonMetadata = resultLesson.f21007t0;
        if (resultLessonMetadata != null) {
            lessonMetadata = new LessonMetadata(resultLessonMetadata.f21093a, resultLessonMetadata.f21094b, resultLessonMetadata.f21095c);
        }
        return new r45(i, str, i2, str2, str3, str4, str5, str6, i3, str7, str8, str9, i4, i5, i6, d, d2, i7, str10, lessonUserLiked, lessonUserCompleted, lessonSentencesTranslation2, str11, str12, str15, str14, num, num2, lessonReferenceM11333e, lessonReferenceM11333e2, d3, d4, z, i8, i9, z2, str16, i10, z3, d5, str17, z4, str19, str20, str21, str22, i11, str23, str24, str28, str25, str29, str18, str26, str30, z5, z6, z7, i12, i13, str27, list, Boolean.valueOf(z8), m11332d(resultLesson.f21011v0), str31, lessonSimplifiedOfM11334f, lessonSimplifiedOfM11334f2, lessonMetadata, resultLesson.f21009u0);
    }
}
