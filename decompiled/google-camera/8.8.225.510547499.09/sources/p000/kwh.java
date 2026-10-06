package p000;

import com.google.android.libraries.lens.lenslite.dynamicloading.DLLinkResultListener;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwh implements DLLinkResultListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nxf f37508a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ kvv f37509b;

    public kwh(nxf nxfVar, kvv kvvVar) {
        this.f37508a = nxfVar;
        this.f37509b = kvvVar;
    }

    @Override // com.google.android.libraries.lens.lenslite.dynamicloading.DLLinkResultListener
    public final void onResultUpdate(List list, ByteBuffer byteBuffer) {
        npa npaVarM14935a = kvu.m14935a();
        npaVarM14935a.m17579b(list);
        npaVarM14935a.m17581d(kwi.m14943a(byteBuffer, this.f37508a));
        npaVarM14935a.m17580c(kvw.f37460b);
        this.f37509b.mo8061a(npaVarM14935a.m17578a());
    }

    @Override // com.google.android.libraries.lens.lenslite.dynamicloading.DLLinkResultListener
    public final void onResultUpdate(List list, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws nyb {
        kvw kvwVar;
        npa npaVarM14935a = kvu.m14935a();
        npaVarM14935a.m17579b(list);
        npaVarM14935a.m17581d(kwi.m14943a(byteBuffer, this.f37508a));
        nxf nxfVar = this.f37508a;
        try {
            kvw kvwVar2 = kvw.f37460b;
            nww nwwVarM17877J = nww.m17877J(byteBuffer2);
            nxq nxqVarM18138P = kvwVar2.m18138P();
            try {
                try {
                    try {
                        nzm nzmVarM18260b = nzf.f45060a.m18260b(nxqVarM18138P);
                        nzmVarM18260b.mo18252h(nxqVarM18138P, nwx.m17885p(nwwVarM17877J), nxfVar);
                        nzmVarM18260b.mo18250f(nxqVarM18138P);
                        nxq.m18132ae(nxqVarM18138P);
                        nxq.m18132ae(nxqVarM18138P);
                        kvwVar = (kvw) nxqVarM18138P;
                    } catch (IOException e) {
                        if (e.getCause() instanceof nyb) {
                            throw ((nyb) e.getCause());
                        }
                        throw new nyb(e);
                    }
                } catch (nyb e2) {
                    if (e2.f44994a) {
                        throw new nyb(e2);
                    }
                    throw e2;
                }
            } catch (nzx e3) {
                throw e3.m18328a();
            } catch (RuntimeException e4) {
                if (e4.getCause() instanceof nyb) {
                    throw ((nyb) e4.getCause());
                }
                throw e4;
            }
        } catch (Exception e5) {
            kvwVar = kvw.f37460b;
        }
        npaVarM14935a.m17580c(kvwVar);
        this.f37509b.mo8061a(npaVarM14935a.m17578a());
    }
}
