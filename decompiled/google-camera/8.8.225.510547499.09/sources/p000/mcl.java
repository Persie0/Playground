package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mcl extends lij {

    /* JADX INFO: renamed from: a */
    public final oub f39954a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcl(oub oubVar) {
        super((char[]) null);
        oubVar.getClass();
        this.f39954a = oubVar;
    }

    @Override // p000.lij
    /* JADX INFO: renamed from: M */
    public final void mo15457M(oeo oeoVar) {
        ooc.m18750p(this.f39954a, new med(oeoVar.mo18421a()));
    }

    /* JADX INFO: renamed from: a */
    public final void m16311a(oeo oeoVar, oeq oeqVar) {
        oer oerVar;
        oep oepVar = oeqVar.f45772a;
        ((ncc) ((ncc) mcj.f39952a.m17252c()).mo17283h(oeqVar)).mo17271B("%s error from %s: %s", oepVar != null ? oepVar.name() : null, oeoVar.mo18422b(), oeqVar.getMessage());
        oub oubVar = this.f39954a;
        if (oepVar == null) {
            oerVar = oer.ERROR_UPLOAD_SERVER_FAILURE;
        } else {
            switch (oepVar) {
                case BAD_URL:
                    oerVar = oer.ERROR_PARTIAL_UPLOAD_INVALID_URL;
                    break;
                case f45765b:
                    oerVar = oer.ERROR_PARTIAL_UPLOAD_CANCELED;
                    break;
                case f45766c:
                    oerVar = oer.ERROR_UPLOAD_DATA_FAILURE;
                    break;
                case CONNECTION_ERROR:
                    oerVar = oer.ERROR_PARTIAL_UPLOAD_SERVER_ISSUE;
                    break;
                case SERVER_ERROR:
                    oerVar = oer.ERROR_UPLOAD_SERVER_FAILURE;
                    break;
                case UNKNOWN:
                    oerVar = oer.ERROR_UPLOAD_UNSPECIFIED;
                    break;
                default:
                    throw new ojz();
            }
        }
        ooc.m18750p(oubVar, new mec(oerVar, oeqVar));
        this.f39954a.mo19062x(null);
    }
}
