package com.lingq.p055ui.home.library;

import ae.C0062b;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.HomeViewModel;
import com.lingq.p055ui.info.LessonInfoParent;
import com.lingq.shared.uimodel.library.LessonMediaSource;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.uimodel.library.LibraryShelfType;
import com.lingq.shared.uimodel.library.LibraryTab;
import com.lingq.shared.util.LessonPath;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import kh.C6678e;
import kh.C6682i;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p181ii.C6332a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p338qd.C8584v;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryFragment$onViewCreated$3$4", m19206f = "LibraryFragment.kt", m19207l = {363}, m19208m = "invokeSuspend")
public final class LibraryFragment$onViewCreated$3$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24692e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LibraryFragment f24693f;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryFragment$onViewCreated$3$4$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/home/library/g;", "nav", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryFragment$onViewCreated$3$4$1", m19206f = "LibraryFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37711 extends SuspendLambda implements InterfaceC2056p<AbstractC3813g, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24694e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LibraryFragment f24695f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37711(LibraryFragment libraryFragment, InterfaceC9968c<? super C37711> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24695f = libraryFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37711 c37711 = new C37711(this.f24695f, interfaceC9968c);
            c37711.f24694e = obj;
            return c37711;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(AbstractC3813g abstractC3813g, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37711) mo1336a(abstractC3813g, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            String str;
            String str2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            AbstractC3813g abstractC3813g = (AbstractC3813g) this.f24694e;
            boolean z10 = abstractC3813g instanceof AbstractC3813g.b;
            LibraryFragment libraryFragment = this.f24695f;
            if (z10) {
                AbstractC3813g.b bVar = (AbstractC3813g.b) abstractC3813g;
                LibraryShelf libraryShelf = bVar.f25021c;
                InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
                libraryFragment.m9939t0();
                LibraryTab libraryTab = (LibraryTab) libraryFragment.m9938s0().f24753R.get(libraryShelf.f22050c);
                String value = LibraryShelfType.MiniStories.getValue();
                String str3 = libraryShelf.f22050c;
                if (C5207g.m11106a(str3, value)) {
                    C4924a.m10447Z(C8573r0.m16725g0(libraryFragment), new C6678e(bVar.f25022d, new LessonPath.Feed(str3)));
                } else {
                    C4924a.m10447Z(C8573r0.m16725g0(libraryFragment), C8584v.m16790o(libraryShelf, libraryShelf.f22052e, libraryTab));
                }
            } else {
                String str4 = "";
                if (abstractC3813g instanceof AbstractC3813g.c) {
                    AbstractC3813g.c cVar = (AbstractC3813g.c) abstractC3813g;
                    C6332a c6332a = cVar.f25023c;
                    InterfaceC6727j<Object>[] interfaceC6727jArr2 = LibraryFragment.f24638G0;
                    libraryFragment.getClass();
                    LessonMediaSource lessonMediaSource = c6332a.f36612r;
                    LessonPath lessonPath = cVar.f25026f;
                    int i10 = c6332a.f36595a;
                    if (lessonMediaSource != null && C5207g.m11106a(c6332a.f36601g, "external")) {
                        HomeViewModel homeViewModelM9937r0 = libraryFragment.m9937r0();
                        LessonMediaSource lessonMediaSource2 = c6332a.f36612r;
                        if (lessonMediaSource2 == null || (str = lessonMediaSource2.f22000b) == null) {
                            str = "";
                        }
                        if (lessonMediaSource2 != null && (str2 = lessonMediaSource2.f22001c) != null) {
                            str4 = str2;
                        }
                        homeViewModelM9937r0.m9777m2(i10, lessonPath, str, str4);
                    } else if (C5207g.m11106a(c6332a.f36589P, Boolean.TRUE) || cVar.f25025e) {
                        HomeViewModel homeViewModelM9937r1 = libraryFragment.m9937r0();
                        Integer num = c6332a.f36607m;
                        int iIntValue = num != null ? num.intValue() : 0;
                        String str5 = c6332a.f36608n;
                        homeViewModelM9937r1.m9776l2(i10, iIntValue, str5 != null ? str5 : "", lessonPath);
                    } else {
                        int i11 = c6332a.f36595a;
                        String str6 = c6332a.f36599e;
                        String str7 = str6 == null ? "" : str6;
                        String str8 = c6332a.f36602h;
                        String str9 = str8 == null ? "" : str8;
                        String str10 = c6332a.f36581H;
                        String str11 = str10 == null ? "" : str10;
                        String str12 = c6332a.f36600f;
                        String str13 = str12 == null ? "" : str12;
                        LessonInfoParent lessonInfoParent = LessonInfoParent.Library;
                        C5207g.m11111f(lessonInfoParent, "from");
                        C4924a.m10447Z(C8573r0.m16725g0(libraryFragment), new C6682i(i11, str7, str9, str11, str13, lessonInfoParent));
                    }
                } else if (C5207g.m11106a(abstractC3813g, AbstractC3813g.e.f25031c)) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr3 = LibraryFragment.f24638G0;
                    libraryFragment.m9939t0();
                    NavController navControllerM16725g0 = C8573r0.m16725g0(libraryFragment);
                    Bundle bundle = new Bundle();
                    NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                    if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToSearch) != null) {
                        navControllerM16725g0.m3992m(R.id.actionToSearch, bundle, null);
                    }
                } else if (C5207g.m11106a(abstractC3813g, AbstractC3813g.f.f25032c)) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr4 = LibraryFragment.f24638G0;
                    libraryFragment.m9939t0();
                    NavController navControllerM16725g1 = C8573r0.m16725g0(libraryFragment);
                    Bundle bundle2 = new Bundle();
                    NavDestination navDestinationM3986g2 = navControllerM16725g1.m3986g();
                    if (navDestinationM3986g2 != null && navDestinationM3986g2.m4016i(R.id.actionToStats) != null) {
                        navControllerM16725g1.m3992m(R.id.actionToStats, bundle2, null);
                    }
                } else if (abstractC3813g instanceof AbstractC3813g.a) {
                    C6332a c6332a2 = ((AbstractC3813g.a) abstractC3813g).f25019c;
                    int i12 = c6332a2.f36595a;
                    String str14 = c6332a2.f36597c;
                    C4924a.m10447Z(C8573r0.m16725g0(libraryFragment), C8573r0.m16663B(i12, str14 != null ? str14 : "", false, false, 12));
                } else if (abstractC3813g instanceof AbstractC3813g.d) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr5 = LibraryFragment.f24638G0;
                    LibraryViewModel libraryViewModelM9938s0 = libraryFragment.m9938s0();
                    AbstractC3813g.d dVar = (AbstractC3813g.d) abstractC3813g;
                    int i13 = dVar.f25028c.f36595a;
                    C7499b.m14933c0(C8573r0.m16767w0(libraryViewModelM9938s0), libraryViewModelM9938s0.f24746K, libraryViewModelM9938s0.f24745J, C0166e.m761g("updateSave ", i13), new LibraryViewModel$updateSave$1(libraryViewModelM9938s0, i13, dVar.f25029d, null));
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryFragment$onViewCreated$3$4(LibraryFragment libraryFragment, InterfaceC9968c<? super LibraryFragment$onViewCreated$3$4> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24693f = libraryFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LibraryFragment$onViewCreated$3$4(this.f24693f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LibraryFragment$onViewCreated$3$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24692e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
            LibraryFragment libraryFragment = this.f24693f;
            LibraryViewModel libraryViewModelM9938s0 = libraryFragment.m9938s0();
            C37711 c37711 = new C37711(libraryFragment, null);
            this.f24692e = 1;
            if (C0062b.m369m0(libraryViewModelM9938s0.f24760Y, c37711, this) == coroutineSingletons) {
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
