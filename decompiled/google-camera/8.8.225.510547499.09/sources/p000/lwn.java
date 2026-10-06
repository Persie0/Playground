package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.helper.F250LogcatLogger$initialize$1", m18657c = "F250LogcatLogger.kt", m18658d = "invokeSuspend", m18659e = {})
public final class lwn extends oml implements onm {

    /* JADX INFO: renamed from: a */
    /* synthetic */ Object f39443a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C1058va f39444b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwn(C1058va c1058va, ols olsVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(2, olsVar);
        this.f39444b = c1058va;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((lwn) mo562c((lvo) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        nbw nbwVar;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        lkm.m15592s(obj);
        lvo lvoVar = (lvo) this.f39443a;
        Object obj2 = this.f39444b.f47804c;
        switch (lvoVar.f39409d) {
            case UNKNOWN_F250_LOG_REASON:
                nbwVar = (ncc) ((nbc) obj2).m17251b();
                break;
            case SUCCESS:
                nbwVar = nce.f41985b;
                break;
            case SUCCESS_PARTIAL_UPLOAD_WORK_CANCELLED:
            case SUCCESS_PARTIAL_UPLOAD_WORK_ENQUEUED:
            case SUCCESS_PARTIAL_AUTO_WORK_ENQUEUED:
            case SUCCESS_PARTIAL_UPLOAD_ATTACHMENT:
            case SUCCESS_PARTIAL_UPLOAD_RESOURCE:
            case SUCCESS_PARTIAL_AIRLOCK_FILES_DELETED:
            case SUCCESS_PARTIAL_UPLOAD_INVALID_FAILED:
            case SUCCESS_PARTIAL_UPLOAD_PAUSED:
            case SUCCESS_PARTIAL_AUTO_UPLOAD_ENQUEUED:
            case SUCCESS_PARTIAL_AUTO_EXPIRE_DELETED:
            case UPLOAD_BACKGROUND_START:
            case AUTO_BACKGROUND_START:
                nbwVar = nce.f41985b;
                break;
            case ERROR_AUTHENTICATION_RECOVERABLE:
                nbwVar = (ncc) ((nbc) obj2).m17252c();
                break;
            case ERROR_AUTHENTICATION_PERMANENT:
                nbwVar = (ncc) ((nbc) obj2).m17251b();
                break;
            case ERROR_QUERY:
                nbwVar = (ncc) ((nbc) obj2).m17251b();
                break;
            case ERROR_INSERT:
                nbwVar = (ncc) ((nbc) obj2).m17251b();
                break;
            case ERROR_UPDATE:
                nbwVar = (ncc) ((nbc) obj2).m17251b();
                break;
            case ERROR_BAD_STATUS:
                nbwVar = (ncc) ((nbc) obj2).m17251b();
                break;
            case ERROR_SAVE_ON_DEVICE:
                nbwVar = (ncc) ((nbc) obj2).m17251b();
                break;
            case ERROR_DELETE_ON_DEVICE:
                nbwVar = (ncc) ((nbc) obj2).m17251b();
                break;
            case ERROR_ENQUEUE_WORK:
                nbwVar = (ncc) ((nbc) obj2).m17251b();
                break;
            case ERROR_PARTIAL_QUERY_WORK:
                nbwVar = (ncc) ((nbc) obj2).m17251b();
                break;
            case ERROR_PARTIAL_UPLOAD_CANCELED:
                nbwVar = (ncc) ((nbc) obj2).m17251b();
                break;
            case ERROR_PARTIAL_UPLOAD_INVALID_URL:
                nbwVar = (ncc) ((nbc) obj2).m17251b();
                break;
            case ERROR_PARTIAL_UPLOAD_SERVER_ISSUE:
                nbwVar = (ncc) ((nbc) obj2).m17251b();
                break;
            case ERROR_UPLOAD_SERVER_FAILURE:
                nbwVar = (ncc) ((nbc) obj2).m17251b();
                break;
            case ERROR_UPLOAD_DATA_FAILURE:
                nbwVar = (ncc) ((nbc) obj2).m17251b();
                break;
            case ERROR_UPLOAD_UNSPECIFIED:
                nbwVar = (ncc) ((nbc) obj2).m17251b();
                break;
            case ERROR_UPLOAD_IGNORABLE:
                nbwVar = (ncc) ((nbc) obj2).m17252c();
                break;
            case ERROR_AUTO_IGNORABLE:
                nbwVar = (ncc) ((nbc) obj2).m17252c();
                break;
            case ERROR_UPLOAD_TOO_FREQUENT_ERRORS_PAUSING:
                nbwVar = (ncc) ((nbc) obj2).m17252c();
                break;
            case UNRECOGNIZED:
                nbwVar = (ncc) ((nbc) obj2).m17251b();
                break;
            default:
                throw new ojz();
        }
        ((ncc) nbwVar.mo17283h(lvoVar.f39410e)).mo17273D("%s due to %s\nat %s\nResources: %s\nAnnotachments: %s", new nqq(lvoVar.f39409d.name()), lvoVar.f39411f, lle.m15688h(lvoVar.f39406a), lvoVar.f39407b, lvoVar.f39408c);
        return oki.f46196a;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        lwn lwnVar = new lwn(this.f39444b, olsVar, null, null, null);
        lwnVar.f39443a = obj;
        return lwnVar;
    }
}
