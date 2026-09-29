package p000;

import android.content.Context;
import com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion;
import com.facebook.appevents.iap.InAppPurchaseUtils$IAPProductType;
import com.facebook.appevents.integrity.C0925a;
import com.facebook.internal.FeatureManager$Feature;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class n24 {

    /* JADX INFO: renamed from: a */
    public static final n24 f52216a = new n24();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f52217b = new AtomicBoolean(false);

    /* JADX WARN: Code duplicated, block: B:30:0x0048 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #4 {, blocks: (B:21:0x0035, B:30:0x0048, B:28:0x0043, B:25:0x003f), top: B:73:0x0035, outer: #3, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0090 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #3 {all -> 0x002b, blocks: (B:8:0x000f, B:12:0x0019, B:14:0x0022, B:39:0x0055, B:41:0x0059, B:44:0x005f, B:46:0x0067, B:55:0x007c, B:57:0x0080, B:53:0x0077, B:58:0x0090, B:17:0x002e, B:19:0x0032, B:20:0x0034, B:34:0x004f, B:35:0x0050, B:38:0x0054, B:50:0x0073, B:21:0x0035, B:30:0x0048, B:28:0x0043), top: B:72:0x000f, outer: #2, inners: #1, #4 }] */
    /* JADX INFO: renamed from: b */
    public static final synchronized void m17185b(Context context, InAppPurchaseUtils$BillingClientVersion inAppPurchaseUtils$BillingClientVersion) {
        u24 u24VarM21819a;
        Set set = lp1.f49971a;
        if (set.contains(n24.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f52217b;
            if (atomicBoolean.get()) {
                return;
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            if (inAppPurchaseUtils$BillingClientVersion != InAppPurchaseUtils$BillingClientVersion.V2_V4) {
                if (inAppPurchaseUtils$BillingClientVersion == InAppPurchaseUtils$BillingClientVersion.V5_V7) {
                    t24 t24Var = u24.f63274G;
                    synchronized (t24Var) {
                        u24VarM21819a = null;
                        if (!set.contains(u24.class)) {
                            try {
                                u24VarM21819a = u24.f63276I;
                            } catch (Throwable th) {
                                lp1.m16420a(u24.class, th);
                            }
                            if (u24VarM21819a == null) {
                                u24VarM21819a = t24Var.m21819a(context);
                            }
                        } else if (u24VarM21819a == null) {
                            u24VarM21819a = t24Var.m21819a(context);
                        }
                    }
                    ref$ObjectRef.f47718a = u24VarM21819a;
                }
                throw th;
            }
            ref$ObjectRef.f47718a = s24.f60178l.m93o(context);
            if (ref$ObjectRef.f47718a == null) {
                atomicBoolean.set(true);
                return;
            }
            if (p13.m18852b(FeatureManager$Feature.AndroidIAPSubscriptionAutoLogging)) {
                C0925a c0925a = C0925a.f11404a;
                boolean z = false;
                if (!set.contains(C0925a.class)) {
                    try {
                        z = C0925a.f11405b;
                    } catch (Throwable th2) {
                        lp1.m16420a(C0925a.class, th2);
                    }
                }
                if (!z || inAppPurchaseUtils$BillingClientVersion == InAppPurchaseUtils$BillingClientVersion.V2_V4) {
                    ((o24) ref$ObjectRef.f47718a).mo17770a(InAppPurchaseUtils$IAPProductType.INAPP, new yg1(ref$ObjectRef, inAppPurchaseUtils$BillingClientVersion, context, 3));
                } else {
                    ((o24) ref$ObjectRef.f47718a).mo17770a(InAppPurchaseUtils$IAPProductType.INAPP, new RunnableC3470pr(19, inAppPurchaseUtils$BillingClientVersion, context));
                }
            } else {
                ((o24) ref$ObjectRef.f47718a).mo17770a(InAppPurchaseUtils$IAPProductType.INAPP, new RunnableC3470pr(19, inAppPurchaseUtils$BillingClientVersion, context));
            }
        } catch (Throwable th3) {
            lp1.m16420a(n24.class, th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final void m17186a(InAppPurchaseUtils$BillingClientVersion inAppPurchaseUtils$BillingClientVersion, String str) {
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3;
        ConcurrentHashMap concurrentHashMap4;
        ConcurrentHashMap concurrentHashMap5;
        Set set = lp1.f49971a;
        if (set.contains(this)) {
            return;
        }
        try {
            boolean zM24241i = x24.m24241i();
            if (zM24241i) {
                x24.m24242k();
            }
            if (inAppPurchaseUtils$BillingClientVersion == InAppPurchaseUtils$BillingClientVersion.V2_V4) {
                a3d a3dVar = s24.f60178l;
                x24.m24240g(a3d.m77n(), a3d.m78p(), false, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                x24.m24240g(a3d.m79q(), a3d.m78p(), true, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                a3d.m77n().clear();
                a3d.m79q().clear();
            } else {
                t24 t24Var = u24.f63274G;
                ConcurrentHashMap concurrentHashMap6 = null;
                if (set.contains(u24.class)) {
                    concurrentHashMap = null;
                    if (lp1.f49971a.contains(u24.class)) {
                        concurrentHashMap2 = null;
                        x24.m24240g(concurrentHashMap, concurrentHashMap2, false, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                        if (lp1.f49971a.contains(u24.class)) {
                            concurrentHashMap3 = null;
                            if (lp1.f49971a.contains(u24.class)) {
                                concurrentHashMap4 = null;
                                x24.m24240g(concurrentHashMap3, concurrentHashMap4, true, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                                if (lp1.f49971a.contains(u24.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        try {
                                            concurrentHashMap6 = u24.f63278K;
                                        } catch (Throwable th) {
                                            lp1.m16420a(u24.class, th);
                                        }
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    try {
                                        concurrentHashMap5 = u24.f63277J;
                                    } catch (Throwable th2) {
                                        lp1.m16420a(u24.class, th2);
                                        concurrentHashMap5 = null;
                                    }
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                try {
                                    concurrentHashMap4 = u24.f63279L;
                                } catch (Throwable th3) {
                                    lp1.m16420a(u24.class, th3);
                                    concurrentHashMap4 = null;
                                }
                                x24.m24240g(concurrentHashMap3, concurrentHashMap4, true, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                                if (lp1.f49971a.contains(u24.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = u24.f63277J;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        } else {
                            try {
                                concurrentHashMap3 = u24.f63278K;
                            } catch (Throwable th4) {
                                lp1.m16420a(u24.class, th4);
                                concurrentHashMap3 = null;
                            }
                            if (lp1.f49971a.contains(u24.class)) {
                                concurrentHashMap4 = null;
                                x24.m24240g(concurrentHashMap3, concurrentHashMap4, true, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                                if (lp1.f49971a.contains(u24.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = u24.f63277J;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                concurrentHashMap4 = u24.f63279L;
                                x24.m24240g(concurrentHashMap3, concurrentHashMap4, true, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                                if (lp1.f49971a.contains(u24.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = u24.f63277J;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        }
                    } else {
                        try {
                            concurrentHashMap2 = u24.f63279L;
                        } catch (Throwable th5) {
                            lp1.m16420a(u24.class, th5);
                            concurrentHashMap2 = null;
                        }
                        x24.m24240g(concurrentHashMap, concurrentHashMap2, false, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                        if (lp1.f49971a.contains(u24.class)) {
                            concurrentHashMap3 = null;
                            if (lp1.f49971a.contains(u24.class)) {
                                concurrentHashMap4 = null;
                                x24.m24240g(concurrentHashMap3, concurrentHashMap4, true, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                                if (lp1.f49971a.contains(u24.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = u24.f63277J;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                concurrentHashMap4 = u24.f63279L;
                                x24.m24240g(concurrentHashMap3, concurrentHashMap4, true, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                                if (lp1.f49971a.contains(u24.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = u24.f63277J;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        } else {
                            concurrentHashMap3 = u24.f63278K;
                            if (lp1.f49971a.contains(u24.class)) {
                                concurrentHashMap4 = null;
                                x24.m24240g(concurrentHashMap3, concurrentHashMap4, true, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                                if (lp1.f49971a.contains(u24.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = u24.f63277J;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                concurrentHashMap4 = u24.f63279L;
                                x24.m24240g(concurrentHashMap3, concurrentHashMap4, true, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                                if (lp1.f49971a.contains(u24.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = u24.f63277J;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        }
                    }
                } else {
                    try {
                        concurrentHashMap = u24.f63277J;
                    } catch (Throwable th6) {
                        lp1.m16420a(u24.class, th6);
                        concurrentHashMap = null;
                    }
                    if (lp1.f49971a.contains(u24.class)) {
                        concurrentHashMap2 = null;
                        x24.m24240g(concurrentHashMap, concurrentHashMap2, false, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                        if (lp1.f49971a.contains(u24.class)) {
                            concurrentHashMap3 = null;
                            if (lp1.f49971a.contains(u24.class)) {
                                concurrentHashMap4 = null;
                                x24.m24240g(concurrentHashMap3, concurrentHashMap4, true, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                                if (lp1.f49971a.contains(u24.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = u24.f63277J;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                concurrentHashMap4 = u24.f63279L;
                                x24.m24240g(concurrentHashMap3, concurrentHashMap4, true, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                                if (lp1.f49971a.contains(u24.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = u24.f63277J;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        } else {
                            concurrentHashMap3 = u24.f63278K;
                            if (lp1.f49971a.contains(u24.class)) {
                                concurrentHashMap4 = null;
                                x24.m24240g(concurrentHashMap3, concurrentHashMap4, true, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                                if (lp1.f49971a.contains(u24.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = u24.f63277J;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                concurrentHashMap4 = u24.f63279L;
                                x24.m24240g(concurrentHashMap3, concurrentHashMap4, true, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                                if (lp1.f49971a.contains(u24.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = u24.f63277J;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        }
                    } else {
                        concurrentHashMap2 = u24.f63279L;
                        x24.m24240g(concurrentHashMap, concurrentHashMap2, false, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                        if (lp1.f49971a.contains(u24.class)) {
                            concurrentHashMap3 = null;
                            if (lp1.f49971a.contains(u24.class)) {
                                concurrentHashMap4 = null;
                                x24.m24240g(concurrentHashMap3, concurrentHashMap4, true, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                                if (lp1.f49971a.contains(u24.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = u24.f63277J;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                concurrentHashMap4 = u24.f63279L;
                                x24.m24240g(concurrentHashMap3, concurrentHashMap4, true, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                                if (lp1.f49971a.contains(u24.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = u24.f63277J;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        } else {
                            concurrentHashMap3 = u24.f63278K;
                            if (lp1.f49971a.contains(u24.class)) {
                                concurrentHashMap4 = null;
                                x24.m24240g(concurrentHashMap3, concurrentHashMap4, true, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                                if (lp1.f49971a.contains(u24.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = u24.f63277J;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                concurrentHashMap4 = u24.f63279L;
                                x24.m24240g(concurrentHashMap3, concurrentHashMap4, true, str, inAppPurchaseUtils$BillingClientVersion, zM24241i);
                                if (lp1.f49971a.contains(u24.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = u24.f63277J;
                                    concurrentHashMap5.clear();
                                    if (!lp1.f49971a.contains(u24.class)) {
                                        concurrentHashMap6 = u24.f63278K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        }
                    }
                }
            }
            if (zM24241i) {
                x24.m24243l();
            }
        } catch (Throwable th7) {
            lp1.m16420a(this, th7);
        }
    }
}
