package com.lingq.shared.repository;

import ae.C0062b;
import bi.AbstractC1568y4;
import ci.InterfaceC2021n;
import com.lingq.entity.Referral;
import com.lingq.shared.network.result.ReferralUser;
import com.lingq.shared.network.result.ResultReferralStats;
import com.lingq.shared.network.result.ResultUserReferral;
import com.lingq.shared.network.result.Results;
import com.lingq.shared.uimodel.UserReferral;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p076di.InterfaceC5180b;
import p260m8.C7499b;
import p460wh.InterfaceC9945m;
import p464wl.InterfaceC9968c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
public final class ReferralRepositoryImpl implements InterfaceC2021n {

    /* JADX INFO: renamed from: a */
    public final AbstractC1568y4 f20466a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9945m f20467b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5180b f20468c;

    public ReferralRepositoryImpl(AbstractC1568y4 abstractC1568y4, InterfaceC9945m interfaceC9945m, InterfaceC5180b interfaceC5180b) {
        C5207g.m11111f(abstractC1568y4, "referralDao");
        C5207g.m11111f(interfaceC9945m, "referralService");
        C5207g.m11111f(interfaceC5180b, "profileStore");
        this.f20466a = abstractC1568y4;
        this.f20467b = interfaceC9945m;
        this.f20468c = interfaceC5180b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // ci.InterfaceC2021n
    /* JADX INFO: renamed from: a */
    public final Object mo6153a(InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        ReferralRepositoryImpl$networkGetReferrals$1 referralRepositoryImpl$networkGetReferrals$1;
        ReferralRepositoryImpl referralRepositoryImpl;
        if (interfaceC9968c instanceof ReferralRepositoryImpl$networkGetReferrals$1) {
            referralRepositoryImpl$networkGetReferrals$1 = (ReferralRepositoryImpl$networkGetReferrals$1) interfaceC9968c;
            int i10 = referralRepositoryImpl$networkGetReferrals$1.f20477g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                referralRepositoryImpl$networkGetReferrals$1.f20477g = i10 - Integer.MIN_VALUE;
            } else {
                referralRepositoryImpl$networkGetReferrals$1 = new ReferralRepositoryImpl$networkGetReferrals$1(this, interfaceC9968c);
            }
        } else {
            referralRepositoryImpl$networkGetReferrals$1 = new ReferralRepositoryImpl$networkGetReferrals$1(this, interfaceC9968c);
        }
        Object objM18520b = referralRepositoryImpl$networkGetReferrals$1.f20475e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = referralRepositoryImpl$networkGetReferrals$1.f20477g;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    referralRepositoryImpl = referralRepositoryImpl$networkGetReferrals$1.f20474d;
                    C7499b.m14977z0(objM18520b);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(objM18520b);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(objM18520b);
            InterfaceC9945m interfaceC9945m = this.f20467b;
            Integer num = new Integer(1);
            Integer num2 = new Integer(5);
            referralRepositoryImpl$networkGetReferrals$1.f20474d = this;
            referralRepositoryImpl$networkGetReferrals$1.f20477g = 1;
            objM18520b = interfaceC9945m.m18520b(num, num2, referralRepositoryImpl$networkGetReferrals$1);
            if (objM18520b == coroutineSingletons) {
                return coroutineSingletons;
            }
            referralRepositoryImpl = this;
            Collection collection = ((Results) objM18520b).f19136d;
            if (collection != null) {
                ArrayList arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                Iterator it = collection.iterator();
                while (true) {
                    String str = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    ResultUserReferral resultUserReferral = (ResultUserReferral) it.next();
                    C5207g.m11111f(resultUserReferral, "<this>");
                    Integer num3 = resultUserReferral.f19036f;
                    int iIntValue = num3 != null ? num3.intValue() : 0;
                    ReferralUser referralUser = resultUserReferral.f19041k;
                    if (referralUser != null) {
                        str = referralUser.f18273f;
                    }
                    arrayList.add(new Referral(resultUserReferral.f19042l, iIntValue, str, resultUserReferral.f19031a));
                }
                AbstractC1568y4 abstractC1568y4 = referralRepositoryImpl.f20466a;
                referralRepositoryImpl$networkGetReferrals$1.f20474d = null;
                referralRepositoryImpl$networkGetReferrals$1.f20477g = 2;
                objM18520b = abstractC1568y4.mo599i0(arrayList, referralRepositoryImpl$networkGetReferrals$1);
                if (objM18520b == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2021n
    /* JADX INFO: renamed from: b */
    public final InterfaceC7116c<List<UserReferral>> mo6154b() {
        return C0062b.m273H0(this.f20466a.mo5240k0());
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009b A[Catch: Exception -> 0x00b2, TryCatch #0 {Exception -> 0x00b2, blocks: (B:16:0x0038, B:22:0x004b, B:40:0x0093, B:42:0x009b, B:43:0x00a0, B:25:0x0053, B:32:0x006f, B:34:0x0077, B:36:0x0080, B:28:0x005c), top: B:52:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2021n
    /* JADX INFO: renamed from: c */
    public final Object mo6155c(InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        ReferralRepositoryImpl$networkGetReferralStats$1 referralRepositoryImpl$networkGetReferralStats$1;
        ReferralRepositoryImpl referralRepositoryImpl;
        ReferralRepositoryImpl referralRepositoryImpl2;
        ResultReferralStats resultReferralStats;
        InterfaceC5180b interfaceC5180b;
        Integer num;
        if (interfaceC9968c instanceof ReferralRepositoryImpl$networkGetReferralStats$1) {
            referralRepositoryImpl$networkGetReferralStats$1 = (ReferralRepositoryImpl$networkGetReferralStats$1) interfaceC9968c;
            int i10 = referralRepositoryImpl$networkGetReferralStats$1.f20473h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                referralRepositoryImpl$networkGetReferralStats$1.f20473h = i10 - Integer.MIN_VALUE;
            } else {
                referralRepositoryImpl$networkGetReferralStats$1 = new ReferralRepositoryImpl$networkGetReferralStats$1(this, interfaceC9968c);
            }
        } else {
            referralRepositoryImpl$networkGetReferralStats$1 = new ReferralRepositoryImpl$networkGetReferralStats$1(this, interfaceC9968c);
        }
        Object objM18519a = referralRepositoryImpl$networkGetReferralStats$1.f20471f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = referralRepositoryImpl$networkGetReferralStats$1.f20473h;
        int iIntValue = 0;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    referralRepositoryImpl = referralRepositoryImpl$networkGetReferralStats$1.f20469d;
                    C7499b.m14977z0(objM18519a);
                } else if (i11 == 2) {
                    resultReferralStats = referralRepositoryImpl$networkGetReferralStats$1.f20470e;
                    referralRepositoryImpl2 = referralRepositoryImpl$networkGetReferralStats$1.f20469d;
                    C7499b.m14977z0(objM18519a);
                    interfaceC5180b = referralRepositoryImpl2.f20468c;
                    num = resultReferralStats.f18914c;
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    referralRepositoryImpl$networkGetReferralStats$1.f20469d = null;
                    referralRepositoryImpl$networkGetReferralStats$1.f20470e = null;
                    referralRepositoryImpl$networkGetReferralStats$1.f20473h = 3;
                    if (interfaceC5180b.mo9612a(iIntValue, referralRepositoryImpl$networkGetReferralStats$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(objM18519a);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(objM18519a);
            InterfaceC9945m interfaceC9945m = this.f20467b;
            referralRepositoryImpl$networkGetReferralStats$1.f20469d = this;
            referralRepositoryImpl$networkGetReferralStats$1.f20473h = 1;
            objM18519a = interfaceC9945m.m18519a(referralRepositoryImpl$networkGetReferralStats$1);
            if (objM18519a == coroutineSingletons) {
                return coroutineSingletons;
            }
            referralRepositoryImpl = this;
            ResultReferralStats resultReferralStats2 = (ResultReferralStats) objM18519a;
            InterfaceC5180b interfaceC5180b2 = referralRepositoryImpl.f20468c;
            Integer num2 = resultReferralStats2.f18912a;
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            referralRepositoryImpl$networkGetReferralStats$1.f20469d = referralRepositoryImpl;
            referralRepositoryImpl$networkGetReferralStats$1.f20470e = resultReferralStats2;
            referralRepositoryImpl$networkGetReferralStats$1.f20473h = 2;
            if (interfaceC5180b2.mo9622k(iIntValue2, referralRepositoryImpl$networkGetReferralStats$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            referralRepositoryImpl2 = referralRepositoryImpl;
            resultReferralStats = resultReferralStats2;
            interfaceC5180b = referralRepositoryImpl2.f20468c;
            num = resultReferralStats.f18914c;
            if (num != null) {
                iIntValue = num.intValue();
            }
            referralRepositoryImpl$networkGetReferralStats$1.f20469d = null;
            referralRepositoryImpl$networkGetReferralStats$1.f20470e = null;
            referralRepositoryImpl$networkGetReferralStats$1.f20473h = 3;
            if (interfaceC5180b.mo9612a(iIntValue, referralRepositoryImpl$networkGetReferralStats$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
