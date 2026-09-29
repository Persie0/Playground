package com.lingq.shared.repository;

import ae.C0062b;
import androidx.work.BackoffPolicy;
import androidx.work.C1244b;
import androidx.work.NetworkType;
import bi.AbstractC1497o3;
import ci.InterfaceC2017j;
import com.lingq.entity.Notice;
import com.lingq.shared.network.requests.RequestNotice;
import com.lingq.shared.network.result.ResultNotice;
import com.lingq.shared.network.result.Results;
import com.lingq.shared.network.workers.NoticeHideWorker;
import com.lingq.shared.uimodel.notification.UserNotice;
import com.squareup.moshi.C4955q;
import dm.C5207g;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p026b5.AbstractC1317j;
import p026b5.C1309b;
import p026b5.C1315h;
import p260m8.C7499b;
import p460wh.InterfaceC9941i;
import p464wl.InterfaceC9968c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
public final class NoticeRepositoryImpl implements InterfaceC2017j {

    /* JADX INFO: renamed from: a */
    public final AbstractC1497o3 f20163a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9941i f20164b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1317j f20165c;

    /* JADX INFO: renamed from: d */
    public final C4955q f20166d;

    public NoticeRepositoryImpl(AbstractC1497o3 abstractC1497o3, InterfaceC9941i interfaceC9941i, AbstractC1317j abstractC1317j, C4955q c4955q) {
        C5207g.m11111f(abstractC1497o3, "noticeDao");
        C5207g.m11111f(interfaceC9941i, "noticeService");
        C5207g.m11111f(abstractC1317j, "workManager");
        C5207g.m11111f(c4955q, "moshi");
        this.f20163a = abstractC1497o3;
        this.f20164b = interfaceC9941i;
        this.f20165c = abstractC1317j;
        this.f20166d = c4955q;
    }

    @Override // ci.InterfaceC2017j
    /* JADX INFO: renamed from: a */
    public final Object mo6086a(RequestNotice requestNotice, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18490b = this.f20164b.m18490b(requestNotice, interfaceC9968c);
        return objM18490b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18490b : C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.InterfaceC2017j
    /* JADX INFO: renamed from: b */
    public final Object mo6087b(String str, List<Integer> list, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        NoticeRepositoryImpl$hideNotices$1 noticeRepositoryImpl$hideNotices$1;
        NoticeRepositoryImpl noticeRepositoryImpl;
        List<Integer> list2 = list;
        if (interfaceC9968c instanceof NoticeRepositoryImpl$hideNotices$1) {
            noticeRepositoryImpl$hideNotices$1 = (NoticeRepositoryImpl$hideNotices$1) interfaceC9968c;
            int i10 = noticeRepositoryImpl$hideNotices$1.f20171h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                noticeRepositoryImpl$hideNotices$1.f20171h = i10 - Integer.MIN_VALUE;
            } else {
                noticeRepositoryImpl$hideNotices$1 = new NoticeRepositoryImpl$hideNotices$1(this, interfaceC9968c);
            }
        } else {
            noticeRepositoryImpl$hideNotices$1 = new NoticeRepositoryImpl$hideNotices$1(this, interfaceC9968c);
        }
        Object obj = noticeRepositoryImpl$hideNotices$1.f20169f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = noticeRepositoryImpl$hideNotices$1.f20171h;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            noticeRepositoryImpl$hideNotices$1.f20167d = this;
            noticeRepositoryImpl$hideNotices$1.f20168e = list2;
            noticeRepositoryImpl$hideNotices$1.f20171h = 1;
            if (this.f20163a.mo5162l0(str, list2, noticeRepositoryImpl$hideNotices$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            noticeRepositoryImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = noticeRepositoryImpl$hideNotices$1.f20168e;
            noticeRepositoryImpl = noticeRepositoryImpl$hideNotices$1.f20167d;
            C7499b.m14977z0(obj);
        }
        RequestNotice requestNotice = new RequestNotice();
        requestNotice.f18134a = list2;
        noticeRepositoryImpl.getClass();
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType2, "networkType");
        C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
        C1315h.a aVar = (C1315h.a) new C1315h.a(NoticeHideWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar.f8071c.f37533j = c1309b;
        Pair[] pairArr = {new Pair("data", noticeRepositoryImpl.f20166d.m10563a(RequestNotice.class).m10535e(requestNotice))};
        C1244b.a aVar2 = new C1244b.a();
        Pair pair = pairArr[0];
        aVar2.m4709b(pair.f38013b, (String) pair.f38012a);
        aVar.f8071c.f37528e = aVar2.m4708a();
        noticeRepositoryImpl.f20165c.m4877b(aVar.m4879a());
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2017j
    /* JADX INFO: renamed from: c */
    public final InterfaceC7116c<List<UserNotice>> mo6088c(String str) {
        String str2;
        C5207g.m11111f(str, "language");
        try {
            str2 = new SimpleDateFormat("yyyy-MM-dd'T'H:m:s").format(Calendar.getInstance().getTime());
            C5207g.m11110e(str2, "{\n        val calendar =…rmat(calendar.time)\n    }");
        } catch (Exception unused) {
            str2 = "";
        }
        return C0062b.m273H0(this.f20163a.mo5161k0(str, str2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ci.InterfaceC2017j
    /* JADX INFO: renamed from: d */
    public final Object mo6089d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        NoticeRepositoryImpl$networkGetNotices$1 noticeRepositoryImpl$networkGetNotices$1;
        String str2;
        Object objM18489a;
        NoticeRepositoryImpl noticeRepositoryImpl;
        if (interfaceC9968c instanceof NoticeRepositoryImpl$networkGetNotices$1) {
            noticeRepositoryImpl$networkGetNotices$1 = (NoticeRepositoryImpl$networkGetNotices$1) interfaceC9968c;
            int i10 = noticeRepositoryImpl$networkGetNotices$1.f20176h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                noticeRepositoryImpl$networkGetNotices$1.f20176h = i10 - Integer.MIN_VALUE;
            } else {
                noticeRepositoryImpl$networkGetNotices$1 = new NoticeRepositoryImpl$networkGetNotices$1(this, interfaceC9968c);
            }
        } else {
            noticeRepositoryImpl$networkGetNotices$1 = new NoticeRepositoryImpl$networkGetNotices$1(this, interfaceC9968c);
        }
        Object objMo599i0 = noticeRepositoryImpl$networkGetNotices$1.f20174f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = noticeRepositoryImpl$networkGetNotices$1.f20176h;
        if (i11 != 0) {
            if (i11 == 1) {
                String str3 = noticeRepositoryImpl$networkGetNotices$1.f20173e;
                NoticeRepositoryImpl noticeRepositoryImpl2 = noticeRepositoryImpl$networkGetNotices$1.f20172d;
                C7499b.m14977z0(objMo599i0);
                noticeRepositoryImpl = noticeRepositoryImpl2;
                objM18489a = objMo599i0;
                str2 = str3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo599i0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo599i0);
        noticeRepositoryImpl$networkGetNotices$1.f20172d = this;
        str2 = str;
        noticeRepositoryImpl$networkGetNotices$1.f20173e = str2;
        noticeRepositoryImpl$networkGetNotices$1.f20176h = 1;
        objM18489a = this.f20164b.m18489a(noticeRepositoryImpl$networkGetNotices$1);
        if (objM18489a == coroutineSingletons) {
            return coroutineSingletons;
        }
        noticeRepositoryImpl = this;
        Collection<ResultNotice> collection = ((Results) objM18489a).f19136d;
        if (collection != null) {
            ArrayList arrayList = new ArrayList(C9325m.m17681z(collection, 10));
            for (ResultNotice resultNotice : collection) {
                C5207g.m11111f(resultNotice, "<this>");
                C5207g.m11111f(str2, "language");
                arrayList.add(new Notice(resultNotice.f18788a, str2, resultNotice.f18789b, resultNotice.f18790c, resultNotice.f18791d, resultNotice.f18792e, false));
            }
            AbstractC1497o3 abstractC1497o3 = noticeRepositoryImpl.f20163a;
            noticeRepositoryImpl$networkGetNotices$1.f20172d = null;
            noticeRepositoryImpl$networkGetNotices$1.f20173e = null;
            noticeRepositoryImpl$networkGetNotices$1.f20176h = 2;
            objMo599i0 = abstractC1497o3.mo599i0(arrayList, noticeRepositoryImpl$networkGetNotices$1);
            if (objMo599i0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }
}
