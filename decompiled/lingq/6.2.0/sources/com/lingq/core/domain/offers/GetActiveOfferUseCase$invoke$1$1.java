package com.lingq.core.domain.offers;

import com.lingq.core.domain.model.offer.OfferVisibility;
import com.lingq.core.domain.model.user.SubscriptionDetails;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.Instant;
import p000.AbstractC3393o1;
import p000.AbstractC3489q9;
import p000.aj3;
import p000.c32;
import p000.g74;
import p000.g9a;
import p000.kuc;
import p000.qb1;
import p000.up6;
import p000.ux5;
import p000.vk9;
import p000.wq1;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.offers.GetActiveOfferUseCase$invoke$1$1", m4291f = "GetActiveOfferUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetActiveOfferUseCase$invoke$1$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f19869a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ SubscriptionDetails f19870b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f19871c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1516b f19872d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetActiveOfferUseCase$invoke$1$1(String str, C1516b c1516b, Continuation continuation) {
        super(3, continuation);
        this.f19871c = str;
        this.f19872d = c1516b;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetActiveOfferUseCase$invoke$1$1 getActiveOfferUseCase$invoke$1$1 = new GetActiveOfferUseCase$invoke$1$1(this.f19871c, this.f19872d, (Continuation) obj3);
        getActiveOfferUseCase$invoke$1$1.f19869a = (List) obj;
        getActiveOfferUseCase$invoke$1$1.f19870b = (SubscriptionDetails) obj2;
        return getActiveOfferUseCase$invoke$1$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        boolean zM19844a;
        Iterator it;
        int i;
        List list = this.f19869a;
        SubscriptionDetails subscriptionDetails = this.f19870b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Instant instantMo3285e = g74.f40314a.mo3285e();
        int i2 = subscriptionDetails.f19833a.f19857c;
        int size = list.size();
        String str = this.f19871c;
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(i2, "[Offers] GetActiveOffer requestedCode=", str, " userTier=", " offers=");
        sbM17741p.append(size);
        System.out.println((Object) "D/LingQ: ".concat(sbM17741p.toString()));
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            up6 up6Var = (up6) next;
            boolean zContainsKey = false;
            try {
                Instant instant = Instant.f47731c;
                Instant instant2 = kuc.m15696b(C1516b.m8192a(up6Var.f64178f)).toInstant();
                Instant instant3 = kuc.m15696b(C1516b.m8192a(up6Var.f64179g)).toInstant();
                instant2.getClass();
                instant3.getClass();
                zM19844a = new qb1(instant2, instant3).m19844a(instantMo3285e);
            } catch (Exception e) {
                int i3 = up6Var.f64173a;
                String str2 = up6Var.f64178f;
                String str3 = up6Var.f64179g;
                StringBuilder sbM22995r = ux5.m22995r(i3, "[Offers] isOfferActive parse failed for id=", " dateStart=", str2, " dateEnd=");
                sbM22995r.append(str3);
                System.out.println((Object) "E/LingQ: ".concat(sbM22995r.toString()));
                System.out.println((Object) AbstractC3393o1.m17734i("E/LingQ: ", e.getMessage()));
                e.printStackTrace();
                zM19844a = false;
            }
            OfferVisibility offerVisibility = up6Var.f64177e;
            String str4 = up6Var.f64175c;
            Integer num = up6Var.f64184l;
            boolean z = num == null || num.intValue() == i2;
            if (str != null) {
                String string = vk9.m23376L0(str).toString();
                Locale locale = Locale.ROOT;
                String lowerCase = string.toLowerCase(locale);
                lowerCase.getClass();
                if (vk9.m23391n0(lowerCase)) {
                    it = it2;
                    i = i2;
                } else {
                    SetBuilder setBuilder = new SetBuilder();
                    it = it2;
                    String lowerCase2 = str4.toLowerCase(locale);
                    lowerCase2.getClass();
                    setBuilder.add(lowerCase2);
                    String lowerCase3 = str4.toLowerCase(locale);
                    lowerCase3.getClass();
                    i = i2;
                    setBuilder.add("lq-".concat(lowerCase3));
                    String str5 = up6Var.f64186n;
                    if (str5 != null) {
                        String lowerCase4 = str5.toLowerCase(locale);
                        lowerCase4.getClass();
                        setBuilder.add(lowerCase4);
                    }
                    String lowerCase5 = up6Var.m22854b().toLowerCase(locale);
                    lowerCase5.getClass();
                    setBuilder.add(lowerCase5);
                    zContainsKey = AbstractC3489q9.m19776f(setBuilder).f47677a.containsKey(lowerCase);
                }
            } else {
                it = it2;
                i = i2;
                if (offerVisibility == OfferVisibility.PUBLIC) {
                    zContainsKey = true;
                }
            }
            if (!zM19844a || !z || !zContainsKey) {
                StringBuilder sbM22995r2 = ux5.m22995r(up6Var.f64173a, "[Offers]  skip id=", " code=", str4, " active=");
                wq1.m24101A(sbM22995r2, zM19844a, " tierOk=", z, " visibilityOk=");
                sbM22995r2.append(zContainsKey);
                sbM22995r2.append(" tier=");
                sbM22995r2.append(num);
                sbM22995r2.append(" visibility=");
                sbM22995r2.append(offerVisibility);
                System.out.println((Object) "D/LingQ: ".concat(sbM22995r2.toString()));
            }
            if (zM19844a && z && zContainsKey) {
                break;
            }
            it2 = it;
            i2 = i;
        }
        up6 up6Var2 = (up6) next;
        System.out.println((Object) "D/LingQ: ".concat("[Offers] GetActiveOffer → ".concat(up6Var2 != null ? g9a.m12431h("id=", up6Var2.f64173a, " code=", up6Var2.f64175c) : "null")));
        return up6Var2;
    }
}
