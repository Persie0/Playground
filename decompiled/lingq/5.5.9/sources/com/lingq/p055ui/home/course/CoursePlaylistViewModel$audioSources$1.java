package com.lingq.p055ui.home.course;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.player.AbstractC3299d;
import com.lingq.player.PlayerContentController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.C6697c;
import ki.C6698d;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\u008a@"}, m13365d2 = {"", "Lki/c;", "data", "Lki/d;", "downloads", "Lcom/lingq/player/PlayerContentController$PlayerContentItem;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$audioSources$1", m19206f = "CoursePlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class CoursePlaylistViewModel$audioSources$1 extends SuspendLambda implements InterfaceC2057q<List<? extends C6697c>, List<? extends C6698d>, InterfaceC9968c<? super List<? extends PlayerContentController.PlayerContentItem>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ List f23878e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ List f23879f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ CoursePlaylistViewModel f23880g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoursePlaylistViewModel$audioSources$1(CoursePlaylistViewModel coursePlaylistViewModel, InterfaceC9968c<? super CoursePlaylistViewModel$audioSources$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f23880g = coursePlaylistViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(List<? extends C6697c> list, List<? extends C6698d> list2, InterfaceC9968c<? super List<? extends PlayerContentController.PlayerContentItem>> interfaceC9968c) {
        CoursePlaylistViewModel$audioSources$1 coursePlaylistViewModel$audioSources$1 = new CoursePlaylistViewModel$audioSources$1(this.f23880g, interfaceC9968c);
        coursePlaylistViewModel$audioSources$1.f23878e = list;
        coursePlaylistViewModel$audioSources$1.f23879f = list2;
        return coursePlaylistViewModel$audioSources$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoursePlaylistViewModel coursePlaylistViewModel;
        Object next;
        C6698d c6698d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        List list = this.f23878e;
        List list2 = this.f23879f;
        ArrayList<C6697c> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            coursePlaylistViewModel = this.f23880g;
            if (!zHasNext) {
                break;
            }
            Object next2 = it.next();
            if (!coursePlaylistViewModel.m9887o2(((C6697c) next2).f37856a)) {
                arrayList.add(next2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
        for (C6697c c6697c : arrayList) {
            String str = c6697c.f37869n;
            String str2 = str != null ? str : "";
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                c6698d = (C6698d) next;
            } while (!(c6698d != null && c6697c.f37856a == c6698d.f37875a));
            C6698d c6698d2 = (C6698d) next;
            Boolean boolValueOf = c6698d2 != null ? Boolean.valueOf(c6698d2.f37876b) : null;
            int i10 = c6697c.f37856a;
            String str3 = c6697c.f37863h;
            String str4 = c6697c.f37864i;
            String str5 = str4 == null ? "" : str4;
            int i11 = c6697c.f37868m * 1000;
            String str6 = c6697c.f37861f;
            arrayList2.add(new PlayerContentController.PlayerContentItem(i10, str2, str3, str5, i11, str6 != null ? str6 : "", boolValueOf != null ? boolValueOf.booleanValue() : false, c6697c.f37865j, coursePlaylistViewModel.mo498E1(), (c6697c.f37870o == null || c6697c.f37869n != null) ? AbstractC3299d.a.f17754a : AbstractC3299d.c.f17756a));
        }
        return arrayList2;
    }
}
