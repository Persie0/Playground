package com.lingq.core.domain.playlist;

import com.lingq.core.data.repository.C1302r;
import com.lingq.core.database.dao.C1322j;
import com.lingq.core.domain.model.CoursePlaylistSort;
import com.lingq.core.domain.model.user.ProfileAccount;
import java.util.TreeMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.c83;
import p000.cma;
import p000.dd7;
import p000.eh9;
import p000.ei8;
import p000.gd7;
import p000.hn1;
import p000.hyc;
import p000.lj2;
import p000.n83;
import p000.p33;
import p000.ux5;
import p000.vqb;
import p000.xd7;

/* JADX INFO: renamed from: com.lingq.core.domain.playlist.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C1522e implements cma {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cma f19944a;

    /* JADX INFO: renamed from: b */
    public final xd7 f19945b;

    /* JADX INFO: renamed from: c */
    public final vqb f19946c;

    public C1522e(xd7 xd7Var, vqb vqbVar, cma cmaVar) {
        xd7Var.getClass();
        cmaVar.getClass();
        this.f19944a = cmaVar;
        this.f19945b = xd7Var;
        this.f19946c = vqbVar;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f19944a.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f19944a.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f19944a.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f19944a.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f19944a.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f19944a.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f19944a.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f19944a.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f19944a.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f19944a.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f19944a.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f19944a.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f19944a.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f19944a.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f19944a.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f19944a.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f19944a.mo4587X();
    }

    /* JADX INFO: renamed from: a */
    public final n83 m8198a(CoursePlaylistSort coursePlaylistSort, int i) {
        String str;
        coursePlaylistSort.getClass();
        cma cmaVar = this.f19944a;
        String strMo4589b2 = cmaVar.mo4589b2();
        C1302r c1302r = (C1302r) this.f19945b;
        c1302r.getClass();
        strMo4589b2.getClass();
        C1322j c1322j = c1302r.f16534c;
        c1322j.getClass();
        int i2 = dd7.f35448a[coursePlaylistSort.ordinal()];
        if (i2 != 1) {
            str = i2 != 2 ? "" : "AND LibraryCounterEntity.isTaken = 1";
        } else {
            str = "AND (LibraryDataEntity.isCompleted = 1 OR LibraryCounterEntity.progress = 100.0)";
        }
        StringBuilder sbM23000w = ux5.m23000w("\n        SELECT DISTINCT\n            LibraryDataEntity.id,\n            LibraryDataEntity.url,\n            LibraryDataEntity.description,\n            LibraryDataEntity.pos,\n            LibraryDataEntity.originalImageUrl,\n            LibraryDataEntity.imageUrl,\n            '", strMo4589b2, "' AS language,\n            LibraryDataEntity.title,\n            LibraryDataEntity.collectionTitle,\n            LibraryDataEntity.collectionId,\n            LibraryDataEntity.listenTimes,\n            LibraryDataEntity.duration,\n            LibraryDataEntity.audioUrl,\n            LibraryDataEntity.videoUrl,\n            LibraryDataEntity.originalUrl,\n            CoursesAndLessonsJoin.courseOrder AS playlistLessonOrder,\n            0 AS isCourse,\n            0 AS isCourseLesson,\n            LibraryDataEntity.price,\n            LibraryDataEntity.level,\n            LibraryCounterEntity.listenTimes AS counterListenTimes,\n            LibraryCounterEntity.audioStart AS audioStart,\n            LibraryCounterEntity.audioEnd AS audioEnd,\n            IFNULL(IFNULL(LibraryCounterEntity.isTaken, LibraryDataEntity.isTaken), 0) AS isTaken\n        FROM LibraryDataEntity\n            INNER JOIN CoursesAndLessonsJoin ON LibraryDataEntity.id = CoursesAndLessonsJoin.contentId\n            LEFT JOIN LibraryCounterEntity ON LibraryCounterEntity.id = CoursesAndLessonsJoin.contentId\n            LEFT JOIN LessonAudioDownloadEntity ON LessonAudioDownloadEntity.id = LibraryDataEntity.id\n                AND LessonAudioDownloadEntity.language = '", strMo4589b2, "'\n        WHERE CoursesAndLessonsJoin.pk = ");
        hn1.m13360j(i, i, "\n            AND LibraryDataEntity.collectionId = ", "\n            AND LibraryDataEntity.type = 'content'\n            AND LibraryCounterEntity.type = 'content'\n            ", sbM23000w);
        p33 p33Var = new p33(AbstractC3393o1.m17738m(sbM23000w, str, "\n        ORDER BY courseOrder ASC\n        "), 20);
        TreeMap treeMap = ei8.f37291h;
        p33 p33VarM11161a = hyc.m13591a(p33Var).m11161a();
        return AbstractC3224d.m15532k(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1322j.f17045K, true, new String[]{"LibraryDataEntity", "LessonAudioDownloadEntity", "LibraryCounterEntity"}, new gd7((String) p33VarM11161a.f55513b, p33VarM11161a, 0))), ((lj2) this.f19946c.f65802b).f49736a, c1302r.m7357q(cmaVar.mo4589b2()), new GetCoursePlaylistUseCase$invoke$1(4, null));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f19944a.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f19944a.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f19944a.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f19944a.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f19944a.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f19944a.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f19944a.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f19944a.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f19944a.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f19944a.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f19944a.mo4598w2();
    }
}
