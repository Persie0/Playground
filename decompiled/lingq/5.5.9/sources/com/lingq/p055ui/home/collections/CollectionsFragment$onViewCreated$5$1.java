package com.lingq.p055ui.home.collections;

import ae.C0062b;
import androidx.view.C1038i0;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.p055ui.info.LessonInfoParent;
import com.lingq.shared.uimodel.library.LessonMediaSource;
import com.lingq.shared.util.LessonPath;
import com.lingq.util.C4924a;
import dm.C5207g;
import kh.C6682i;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p181ii.C6332a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$5$1", m19206f = "CollectionsFragment.kt", m19207l = {391}, m19208m = "invokeSuspend")
public final class CollectionsFragment$onViewCreated$5$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23166e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsFragment f23167f;

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$5$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/home/collections/c;", "nav", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$5$1$1", m19206f = "CollectionsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35391 extends SuspendLambda implements InterfaceC2056p<AbstractC3571c, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23168e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CollectionsFragment f23169f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35391(CollectionsFragment collectionsFragment, InterfaceC9968c<? super C35391> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23169f = collectionsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C35391 c35391 = new C35391(this.f23169f, interfaceC9968c);
            c35391.f23168e = obj;
            return c35391;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(AbstractC3571c abstractC3571c, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35391) mo1336a(abstractC3571c, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            String str;
            String str2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            AbstractC3571c abstractC3571c = (AbstractC3571c) this.f23168e;
            boolean z10 = abstractC3571c instanceof AbstractC3571c.b;
            String str3 = "";
            CollectionsFragment collectionsFragment = this.f23169f;
            if (z10) {
                C6332a c6332aMo9845a = abstractC3571c.mo9845a();
                AbstractC3571c.b bVar = (AbstractC3571c.b) abstractC3571c;
                InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsFragment.f23142F0;
                collectionsFragment.getClass();
                LessonMediaSource lessonMediaSource = c6332aMo9845a.f36612r;
                C1038i0 c1038i0 = collectionsFragment.f23145C0;
                LessonPath lessonPath = bVar.f23448f;
                int i10 = c6332aMo9845a.f36595a;
                if (lessonMediaSource != null && C5207g.m11106a(c6332aMo9845a.f36601g, "external")) {
                    HomeViewModel homeViewModel = (HomeViewModel) c1038i0.getValue();
                    LessonMediaSource lessonMediaSource2 = c6332aMo9845a.f36612r;
                    if (lessonMediaSource2 == null || (str = lessonMediaSource2.f22000b) == null) {
                        str = "";
                    }
                    if (lessonMediaSource2 != null && (str2 = lessonMediaSource2.f22001c) != null) {
                        str3 = str2;
                    }
                    homeViewModel.m9777m2(i10, lessonPath, str, str3);
                } else if (C5207g.m11106a(c6332aMo9845a.f36589P, Boolean.TRUE) || bVar.f23447e) {
                    HomeViewModel homeViewModel2 = (HomeViewModel) c1038i0.getValue();
                    Integer num = c6332aMo9845a.f36607m;
                    int iIntValue = num != null ? num.intValue() : 0;
                    String str4 = c6332aMo9845a.f36608n;
                    homeViewModel2.m9776l2(i10, iIntValue, str4 != null ? str4 : "", lessonPath);
                } else {
                    int i11 = c6332aMo9845a.f36595a;
                    String str5 = c6332aMo9845a.f36599e;
                    String str6 = str5 == null ? "" : str5;
                    String str7 = c6332aMo9845a.f36602h;
                    String str8 = str7 == null ? "" : str7;
                    String str9 = c6332aMo9845a.f36581H;
                    String str10 = str9 == null ? "" : str9;
                    String str11 = c6332aMo9845a.f36600f;
                    String str12 = str11 == null ? "" : str11;
                    LessonInfoParent lessonInfoParent = LessonInfoParent.Overview;
                    C5207g.m11111f(lessonInfoParent, "from");
                    C4924a.m10447Z(C8573r0.m16725g0(collectionsFragment), new C6682i(i11, str6, str8, str10, str12, lessonInfoParent));
                }
            } else if (abstractC3571c instanceof AbstractC3571c.a) {
                int i12 = abstractC3571c.mo9845a().f36595a;
                String str13 = abstractC3571c.mo9845a().f36597c;
                C4924a.m10447Z(C8573r0.m16725g0(collectionsFragment), C8573r0.m16663B(i12, str13 != null ? str13 : "", false, false, 12));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsFragment$onViewCreated$5$1(CollectionsFragment collectionsFragment, InterfaceC9968c<? super CollectionsFragment$onViewCreated$5$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23167f = collectionsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsFragment$onViewCreated$5$1(this.f23167f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsFragment$onViewCreated$5$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23166e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsFragment.f23142F0;
            CollectionsFragment collectionsFragment = this.f23167f;
            CollectionsViewModel collectionsViewModelM9800p0 = collectionsFragment.m9800p0();
            C35391 c35391 = new C35391(collectionsFragment, null);
            this.f23166e = 1;
            if (C0062b.m369m0(collectionsViewModelM9800p0.f23242Y, c35391, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
