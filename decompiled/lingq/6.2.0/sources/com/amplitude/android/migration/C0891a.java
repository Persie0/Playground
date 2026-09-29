package com.amplitude.android.migration;

import com.amplitude.android.storage.C0898b;
import com.amplitude.core.Storage$Constants;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.pj5;
import p000.xfa;

/* JADX INFO: renamed from: com.amplitude.android.migration.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0891a {

    /* JADX INFO: renamed from: a */
    public final C0898b f10926a;

    /* JADX INFO: renamed from: b */
    public final C0898b f10927b;

    /* JADX INFO: renamed from: c */
    public final pj5 f10928c;

    public C0891a(C0898b c0898b, C0898b c0898b2, pj5 pj5Var) {
        c0898b.getClass();
        pj5Var.getClass();
        this.f10926a = c0898b;
        this.f10927b = c0898b2;
        this.f10928c = pj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r6.m5080d(r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5077a(ContinuationImpl continuationImpl) throws Throwable {
        AndroidStorageMigration$execute$1 androidStorageMigration$execute$1;
        if (continuationImpl instanceof AndroidStorageMigration$execute$1) {
            androidStorageMigration$execute$1 = (AndroidStorageMigration$execute$1) continuationImpl;
            int i = androidStorageMigration$execute$1.f10868d;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidStorageMigration$execute$1.f10868d = i - Integer.MIN_VALUE;
            } else {
                androidStorageMigration$execute$1 = new AndroidStorageMigration$execute$1(this, continuationImpl);
            }
        } else {
            androidStorageMigration$execute$1 = new AndroidStorageMigration$execute$1(this, continuationImpl);
        }
        Object obj = androidStorageMigration$execute$1.f10866b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = androidStorageMigration$execute$1.f10868d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            androidStorageMigration$execute$1.f10865a = this;
            androidStorageMigration$execute$1.f10868d = 1;
            if (m5078b(androidStorageMigration$execute$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            this = androidStorageMigration$execute$1.f10865a;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        androidStorageMigration$execute$1.f10865a = null;
        androidStorageMigration$execute$1.f10868d = 2;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ba A[Catch: Exception -> 0x003a, TryCatch #1 {Exception -> 0x003a, blocks: (B:15:0x0035, B:52:0x00f7, B:54:0x00fd, B:61:0x012a, B:62:0x0159, B:45:0x00b4, B:47:0x00ba, B:51:0x00e2, B:63:0x018c, B:34:0x007d, B:40:0x0092, B:42:0x009e, B:44:0x00af, B:37:0x0084), top: B:70:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd A[Catch: Exception -> 0x003a, TRY_LEAVE, TryCatch #1 {Exception -> 0x003a, blocks: (B:15:0x0035, B:52:0x00f7, B:54:0x00fd, B:61:0x012a, B:62:0x0159, B:45:0x00b4, B:47:0x00ba, B:51:0x00e2, B:63:0x018c, B:34:0x007d, B:40:0x0092, B:42:0x009e, B:44:0x00af, B:37:0x0084), top: B:70:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[LOOP:0: B:52:0x00f7->B:78:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e2 -> B:52:0x00f7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x012a -> B:52:0x00f7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public final java.lang.Object m5078b(kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.android.migration.C0891a.m5078b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (r9 == r4) goto L36;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5079c(Storage$Constants storage$Constants, ContinuationImpl continuationImpl) throws Throwable {
        AndroidStorageMigration$moveSimpleValue$1 androidStorageMigration$moveSimpleValue$1;
        C0898b c0898b = this.f10927b;
        if (continuationImpl instanceof AndroidStorageMigration$moveSimpleValue$1) {
            androidStorageMigration$moveSimpleValue$1 = (AndroidStorageMigration$moveSimpleValue$1) continuationImpl;
            int i = androidStorageMigration$moveSimpleValue$1.f10883e;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidStorageMigration$moveSimpleValue$1.f10883e = i - Integer.MIN_VALUE;
            } else {
                androidStorageMigration$moveSimpleValue$1 = new AndroidStorageMigration$moveSimpleValue$1(this, continuationImpl);
            }
        } else {
            androidStorageMigration$moveSimpleValue$1 = new AndroidStorageMigration$moveSimpleValue$1(this, continuationImpl);
        }
        Object obj = androidStorageMigration$moveSimpleValue$1.f10881c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = androidStorageMigration$moveSimpleValue$1.f10883e;
        xfa xfaVar = xfa.f68157a;
        try {
            try {
                if (i2 == 0) {
                    AbstractC3193b.m15359b(obj);
                    String strM5096a = this.f10926a.m5096a(storage$Constants);
                    if (strM5096a != null) {
                        if (c0898b.m5096a(storage$Constants) == null) {
                            this.f10928c.mo16256b("Migrating " + storage$Constants + " with value " + strM5096a);
                            androidStorageMigration$moveSimpleValue$1.f10879a = this;
                            androidStorageMigration$moveSimpleValue$1.f10880b = storage$Constants;
                            androidStorageMigration$moveSimpleValue$1.f10883e = 1;
                            c0898b.m5102g(storage$Constants, strM5096a);
                        } else {
                            C0898b c0898b2 = this.f10926a;
                            androidStorageMigration$moveSimpleValue$1.f10879a = this;
                            androidStorageMigration$moveSimpleValue$1.f10880b = storage$Constants;
                            androidStorageMigration$moveSimpleValue$1.f10883e = 2;
                            c0898b2.m5099d(storage$Constants);
                            if (xfaVar == coroutineSingletons) {
                            }
                        }
                    }
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Storage$Constants storage$Constants2 = androidStorageMigration$moveSimpleValue$1.f10880b;
                    C0891a c0891a = androidStorageMigration$moveSimpleValue$1.f10879a;
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                storage$Constants = androidStorageMigration$moveSimpleValue$1.f10880b;
                this = androidStorageMigration$moveSimpleValue$1.f10879a;
                AbstractC3193b.m15359b(obj);
                C0898b c0898b3 = this.f10926a;
                androidStorageMigration$moveSimpleValue$1.f10879a = this;
                androidStorageMigration$moveSimpleValue$1.f10880b = storage$Constants;
                androidStorageMigration$moveSimpleValue$1.f10883e = 2;
                c0898b3.m5099d(storage$Constants);
                return xfaVar == coroutineSingletons ? coroutineSingletons : xfaVar;
            } catch (Exception e) {
                this.f10928c.mo16255a("can't write destination " + storage$Constants + ": " + e.getMessage());
            }
        } catch (Exception e2) {
            this.f10928c.mo16255a("can't move " + storage$Constants + ": " + e2.getMessage());
            return xfaVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[PHI: r4
      0x0071: PHI (r4v3 'this' com.amplitude.android.migration.a) = (r4v1 'this' com.amplitude.android.migration.a), (r4v4 'this' com.amplitude.android.migration.a) binds: [B:23:0x006e, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x007f A[PHI: r4
      0x007f: PHI (r4v5 'this' com.amplitude.android.migration.a) = (r4v3 'this' com.amplitude.android.migration.a), (r4v6 'this' com.amplitude.android.migration.a) binds: [B:26:0x007c, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x008d A[PHI: r4
      0x008d: PHI (r4v7 'this' com.amplitude.android.migration.a) = (r4v5 'this' com.amplitude.android.migration.a), (r4v8 'this' com.amplitude.android.migration.a) binds: [B:29:0x008a, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[PHI: r4
      0x009b: PHI (r4v9 'this' com.amplitude.android.migration.a) = (r4v7 'this' com.amplitude.android.migration.a), (r4v10 'this' com.amplitude.android.migration.a) binds: [B:32:0x0098, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9 A[PHI: r4
      0x00a9: PHI (r4v11 'this' com.amplitude.android.migration.a) = (r4v9 'this' com.amplitude.android.migration.a), (r4v13 'this' com.amplitude.android.migration.a) binds: [B:35:0x00a6, B:13:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        if (r4.m5079c(r5, r0) == r1) goto L39;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5080d(ContinuationImpl continuationImpl) throws Throwable {
        AndroidStorageMigration$moveSimpleValues$1 androidStorageMigration$moveSimpleValues$1;
        Storage$Constants storage$Constants;
        Storage$Constants storage$Constants2;
        Storage$Constants storage$Constants3;
        Storage$Constants storage$Constants4;
        Storage$Constants storage$Constants5;
        if (continuationImpl instanceof AndroidStorageMigration$moveSimpleValues$1) {
            androidStorageMigration$moveSimpleValues$1 = (AndroidStorageMigration$moveSimpleValues$1) continuationImpl;
            int i = androidStorageMigration$moveSimpleValues$1.f10887d;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidStorageMigration$moveSimpleValues$1.f10887d = i - Integer.MIN_VALUE;
            } else {
                androidStorageMigration$moveSimpleValues$1 = new AndroidStorageMigration$moveSimpleValues$1(this, continuationImpl);
            }
        } else {
            androidStorageMigration$moveSimpleValues$1 = new AndroidStorageMigration$moveSimpleValues$1(this, continuationImpl);
        }
        Object obj = androidStorageMigration$moveSimpleValues$1.f10885b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (androidStorageMigration$moveSimpleValues$1.f10887d) {
            case 0:
                AbstractC3193b.m15359b(obj);
                Storage$Constants storage$Constants6 = Storage$Constants.PREVIOUS_SESSION_ID;
                androidStorageMigration$moveSimpleValues$1.f10884a = this;
                androidStorageMigration$moveSimpleValues$1.f10887d = 1;
                if (m5079c(storage$Constants6, androidStorageMigration$moveSimpleValues$1) != coroutineSingletons) {
                    storage$Constants = Storage$Constants.LAST_EVENT_TIME;
                    androidStorageMigration$moveSimpleValues$1.f10884a = this;
                    androidStorageMigration$moveSimpleValues$1.f10887d = 2;
                    if (this.m5079c(storage$Constants, androidStorageMigration$moveSimpleValues$1) != coroutineSingletons) {
                        storage$Constants2 = Storage$Constants.LAST_EVENT_ID;
                        androidStorageMigration$moveSimpleValues$1.f10884a = this;
                        androidStorageMigration$moveSimpleValues$1.f10887d = 3;
                        if (this.m5079c(storage$Constants2, androidStorageMigration$moveSimpleValues$1) != coroutineSingletons) {
                            storage$Constants3 = Storage$Constants.OPT_OUT;
                            androidStorageMigration$moveSimpleValues$1.f10884a = this;
                            androidStorageMigration$moveSimpleValues$1.f10887d = 4;
                            if (this.m5079c(storage$Constants3, androidStorageMigration$moveSimpleValues$1) != coroutineSingletons) {
                                storage$Constants4 = Storage$Constants.Events;
                                androidStorageMigration$moveSimpleValues$1.f10884a = this;
                                androidStorageMigration$moveSimpleValues$1.f10887d = 5;
                                if (this.m5079c(storage$Constants4, androidStorageMigration$moveSimpleValues$1) != coroutineSingletons) {
                                    storage$Constants5 = Storage$Constants.APP_VERSION;
                                    androidStorageMigration$moveSimpleValues$1.f10884a = this;
                                    androidStorageMigration$moveSimpleValues$1.f10887d = 6;
                                    if (this.m5079c(storage$Constants5, androidStorageMigration$moveSimpleValues$1) != coroutineSingletons) {
                                        Storage$Constants storage$Constants7 = Storage$Constants.APP_BUILD;
                                        androidStorageMigration$moveSimpleValues$1.f10884a = null;
                                        androidStorageMigration$moveSimpleValues$1.f10887d = 7;
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 1:
                this = androidStorageMigration$moveSimpleValues$1.f10884a;
                AbstractC3193b.m15359b(obj);
                storage$Constants = Storage$Constants.LAST_EVENT_TIME;
                androidStorageMigration$moveSimpleValues$1.f10884a = this;
                androidStorageMigration$moveSimpleValues$1.f10887d = 2;
                if (this.m5079c(storage$Constants, androidStorageMigration$moveSimpleValues$1) != coroutineSingletons) {
                    storage$Constants2 = Storage$Constants.LAST_EVENT_ID;
                    androidStorageMigration$moveSimpleValues$1.f10884a = this;
                    androidStorageMigration$moveSimpleValues$1.f10887d = 3;
                    if (this.m5079c(storage$Constants2, androidStorageMigration$moveSimpleValues$1) != coroutineSingletons) {
                        storage$Constants3 = Storage$Constants.OPT_OUT;
                        androidStorageMigration$moveSimpleValues$1.f10884a = this;
                        androidStorageMigration$moveSimpleValues$1.f10887d = 4;
                        if (this.m5079c(storage$Constants3, androidStorageMigration$moveSimpleValues$1) != coroutineSingletons) {
                            storage$Constants4 = Storage$Constants.Events;
                            androidStorageMigration$moveSimpleValues$1.f10884a = this;
                            androidStorageMigration$moveSimpleValues$1.f10887d = 5;
                            if (this.m5079c(storage$Constants4, androidStorageMigration$moveSimpleValues$1) != coroutineSingletons) {
                                storage$Constants5 = Storage$Constants.APP_VERSION;
                                androidStorageMigration$moveSimpleValues$1.f10884a = this;
                                androidStorageMigration$moveSimpleValues$1.f10887d = 6;
                                if (this.m5079c(storage$Constants5, androidStorageMigration$moveSimpleValues$1) != coroutineSingletons) {
                                    Storage$Constants storage$Constants8 = Storage$Constants.APP_BUILD;
                                    androidStorageMigration$moveSimpleValues$1.f10884a = null;
                                    androidStorageMigration$moveSimpleValues$1.f10887d = 7;
                                }
                            }
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 2:
                this = androidStorageMigration$moveSimpleValues$1.f10884a;
                AbstractC3193b.m15359b(obj);
                storage$Constants2 = Storage$Constants.LAST_EVENT_ID;
                androidStorageMigration$moveSimpleValues$1.f10884a = this;
                androidStorageMigration$moveSimpleValues$1.f10887d = 3;
                if (this.m5079c(storage$Constants2, androidStorageMigration$moveSimpleValues$1) != coroutineSingletons) {
                    storage$Constants3 = Storage$Constants.OPT_OUT;
                    androidStorageMigration$moveSimpleValues$1.f10884a = this;
                    androidStorageMigration$moveSimpleValues$1.f10887d = 4;
                    if (this.m5079c(storage$Constants3, androidStorageMigration$moveSimpleValues$1) != coroutineSingletons) {
                        storage$Constants4 = Storage$Constants.Events;
                        androidStorageMigration$moveSimpleValues$1.f10884a = this;
                        androidStorageMigration$moveSimpleValues$1.f10887d = 5;
                        if (this.m5079c(storage$Constants4, androidStorageMigration$moveSimpleValues$1) != coroutineSingletons) {
                            storage$Constants5 = Storage$Constants.APP_VERSION;
                            androidStorageMigration$moveSimpleValues$1.f10884a = this;
                            androidStorageMigration$moveSimpleValues$1.f10887d = 6;
                            if (this.m5079c(storage$Constants5, androidStorageMigration$moveSimpleValues$1) != coroutineSingletons) {
                                Storage$Constants storage$Constants9 = Storage$Constants.APP_BUILD;
                                androidStorageMigration$moveSimpleValues$1.f10884a = null;
                                androidStorageMigration$moveSimpleValues$1.f10887d = 7;
                            }
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 3:
                this = androidStorageMigration$moveSimpleValues$1.f10884a;
                AbstractC3193b.m15359b(obj);
                storage$Constants3 = Storage$Constants.OPT_OUT;
                androidStorageMigration$moveSimpleValues$1.f10884a = this;
                androidStorageMigration$moveSimpleValues$1.f10887d = 4;
                if (this.m5079c(storage$Constants3, androidStorageMigration$moveSimpleValues$1) != coroutineSingletons) {
                    storage$Constants4 = Storage$Constants.Events;
                    androidStorageMigration$moveSimpleValues$1.f10884a = this;
                    androidStorageMigration$moveSimpleValues$1.f10887d = 5;
                    if (this.m5079c(storage$Constants4, androidStorageMigration$moveSimpleValues$1) != coroutineSingletons) {
                        storage$Constants5 = Storage$Constants.APP_VERSION;
                        androidStorageMigration$moveSimpleValues$1.f10884a = this;
                        androidStorageMigration$moveSimpleValues$1.f10887d = 6;
                        if (this.m5079c(storage$Constants5, androidStorageMigration$moveSimpleValues$1) != coroutineSingletons) {
                            Storage$Constants storage$Constants10 = Storage$Constants.APP_BUILD;
                            androidStorageMigration$moveSimpleValues$1.f10884a = null;
                            androidStorageMigration$moveSimpleValues$1.f10887d = 7;
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 4:
                this = androidStorageMigration$moveSimpleValues$1.f10884a;
                AbstractC3193b.m15359b(obj);
                storage$Constants4 = Storage$Constants.Events;
                androidStorageMigration$moveSimpleValues$1.f10884a = this;
                androidStorageMigration$moveSimpleValues$1.f10887d = 5;
                if (this.m5079c(storage$Constants4, androidStorageMigration$moveSimpleValues$1) != coroutineSingletons) {
                    storage$Constants5 = Storage$Constants.APP_VERSION;
                    androidStorageMigration$moveSimpleValues$1.f10884a = this;
                    androidStorageMigration$moveSimpleValues$1.f10887d = 6;
                    if (this.m5079c(storage$Constants5, androidStorageMigration$moveSimpleValues$1) != coroutineSingletons) {
                        Storage$Constants storage$Constants11 = Storage$Constants.APP_BUILD;
                        androidStorageMigration$moveSimpleValues$1.f10884a = null;
                        androidStorageMigration$moveSimpleValues$1.f10887d = 7;
                    }
                    break;
                }
                return coroutineSingletons;
            case 5:
                this = androidStorageMigration$moveSimpleValues$1.f10884a;
                AbstractC3193b.m15359b(obj);
                storage$Constants5 = Storage$Constants.APP_VERSION;
                androidStorageMigration$moveSimpleValues$1.f10884a = this;
                androidStorageMigration$moveSimpleValues$1.f10887d = 6;
                if (this.m5079c(storage$Constants5, androidStorageMigration$moveSimpleValues$1) != coroutineSingletons) {
                    Storage$Constants storage$Constants12 = Storage$Constants.APP_BUILD;
                    androidStorageMigration$moveSimpleValues$1.f10884a = null;
                    androidStorageMigration$moveSimpleValues$1.f10887d = 7;
                    break;
                }
                return coroutineSingletons;
            case 6:
                this = androidStorageMigration$moveSimpleValues$1.f10884a;
                AbstractC3193b.m15359b(obj);
                Storage$Constants storage$Constants13 = Storage$Constants.APP_BUILD;
                androidStorageMigration$moveSimpleValues$1.f10884a = null;
                androidStorageMigration$moveSimpleValues$1.f10887d = 7;
                break;
            case 7:
                AbstractC3193b.m15359b(obj);
                return xfa.f68157a;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
