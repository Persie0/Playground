package p000;

import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lwv implements lvg {

    /* JADX INFO: renamed from: a */
    public final mav f39467a;

    /* JADX INFO: renamed from: b */
    public final lyz f39468b;

    /* JADX INFO: renamed from: c */
    private final ksi f39469c;

    /* JADX INFO: renamed from: d */
    private final oqo f39470d;

    /* JADX INFO: renamed from: e */
    private final lyz f39471e;

    public lwv(ksi ksiVar, mav mavVar, lxd lxdVar, mat matVar, lyz lyzVar, oqo oqoVar, lyz lyzVar2, lzd lzdVar, lwz lwzVar, AmbientMode.AmbientController ambientController, lwo lwoVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        ksiVar.getClass();
        mavVar.getClass();
        lxdVar.getClass();
        matVar.getClass();
        lyzVar.getClass();
        oqoVar.getClass();
        lyzVar2.getClass();
        lzdVar.getClass();
        lwzVar.getClass();
        ambientController.getClass();
        lwoVar.getClass();
        this.f39469c = ksiVar;
        this.f39467a = mavVar;
        this.f39468b = lyzVar;
        this.f39470d = oqoVar;
        this.f39471e = lyzVar2;
    }

    @Override // p000.lvg
    /* JADX INFO: renamed from: a */
    public final our mo16092a(Set set, List list) throws IOException {
        mau mauVar = new mau(this.f39469c, new lvs(set, list), null);
        lyz lyzVar = this.f39471e;
        StringBuilder sb = new StringBuilder("SELECT * FROM ResourceEntity");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        naz nazVarListIterator = ((nad) set).listIterator();
        while (nazVarListIterator.hasNext()) {
            lme lmeVar = (lme) nazVarListIterator.next();
            if (lmeVar instanceof lvq) {
                throw null;
            }
            if (lmeVar instanceof lvr) {
                throw null;
            }
            if (lmeVar instanceof lvp) {
                throw null;
            }
            if (lmeVar instanceof lwe) {
                throw null;
            }
            if (lmeVar instanceof lvt) {
                throw null;
            }
            if (lmeVar instanceof lwf) {
                throw null;
            }
            if (lmeVar instanceof lvj) {
                arrayList.add("status_airlockFileState IN ".concat(omn.m18680T(((lvj) lmeVar).f39398b, ",", "(", ")", axf.f2642f, 24)));
            } else if (lmeVar instanceof lwi) {
                throw null;
            }
        }
        if (!arrayList2.isEmpty()) {
            sb.append(" JOIN ResourceFts ON ResourceEntity.onDeviceId == ResourceFts.docid");
            arrayList.add(omn.m18680T(arrayList2, HRLmc.nmaNZaH, "( ResourceFts MATCH ", ")", null, 56));
        }
        if (!arrayList.isEmpty()) {
            omn.m18682V(arrayList, sb, " AND ", " WHERE ", 120);
        }
        ovd ovdVar = new ovd(ova.m19084a(ook.m18783U(new api((apt) lyzVar.f39584a, new String[]{"ResourceEntity"}, new lza(lyzVar, new aqo(sb.toString())), null))), this, 1);
        oog oogVar = new oog();
        oogVar.f46349a = true;
        our ourVarM18778P = ook.m18778P(new lws(ovdVar, oogVar, this, mauVar), new lwt(this, mauVar, null));
        oqo oqoVar = this.f39470d;
        if (oqoVar.get(ory.f46473c) == null) {
            return ooc.m18737c(oqoVar, olz.f46282a) ? ourVarM18778P : new owi(ourVarM18778P, oqoVar);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Flow context cannot contain job in it. Had ");
        sb2.append(oqoVar);
        throw new IllegalArgumentException("Flow context cannot contain job in it. Had ".concat(oqoVar.toString()));
    }
}
