package p000;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.OperationApplicationException;
import android.net.Uri;
import android.os.RemoteException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class krf implements krn {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ krg f37030a;

    /* JADX INFO: renamed from: c */
    private final krj f37032c;

    /* JADX INFO: renamed from: b */
    private final List f37031b = new ArrayList();

    /* JADX INFO: renamed from: d */
    private boolean f37033d = false;

    public krf(krg krgVar, krj krjVar) {
        this.f37030a = krgVar;
        this.f37032c = krjVar;
    }

    /* JADX INFO: renamed from: c */
    private final void m14745c(krl krlVar, krt krtVar) {
        if (krtVar.m14786d()) {
            String authority = (kxk.m15013f(krtVar.f37089e) ? this.f37032c.f37054d : this.f37032c.f37053c).getAuthority();
            authority.getClass();
            lku.m15617L(authority.equals(krlVar.mo14767h().getAuthority()), "Expected URI with authority %s, instead found %s", authority, krlVar.mo14767h());
        }
    }

    @Override // p000.krn
    /* JADX INFO: renamed from: a */
    public final synchronized void mo14746a(krl krlVar) {
        lku.m15613H(!this.f37033d);
        m14745c(krlVar, krlVar.mo14768i());
        this.f37031b.add(new krz(krlVar, true, null, null));
    }

    @Override // p000.krn
    /* JADX INFO: renamed from: b */
    public final synchronized void mo14747b(krl krlVar, krt krtVar, krp krpVar) {
        boolean z = true;
        lku.m15613H(!this.f37033d);
        if (krlVar.mo14768i() != krtVar && !krlVar.mo14770k()) {
            z = false;
        }
        lku.m15613H(z);
        m14745c(krlVar, krtVar);
        this.f37031b.add(new krz(krlVar, false, krtVar, krpVar));
    }

    @Override // p000.krn, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f37033d) {
            throw new IllegalStateException("Cannot publish a closed transaction");
        }
        this.f37033d = true;
        try {
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            for (krz krzVar : this.f37031b) {
                File fileM14784b = krzVar.f37099a.mo14768i().m14784b(this.f37032c);
                krt krtVarMo14768i = krzVar.f37099a.mo14768i();
                String str = String.format(Locale.ROOT, "%s.%s", krtVarMo14768i.f37087c, krtVarMo14768i.f37088d);
                if (!krzVar.f37100b) {
                    krt krtVar = krzVar.f37101c;
                    if (krtVar != null && krtVar != krtVarMo14768i) {
                        lku.m15614I(krtVarMo14768i.m14786d() == krtVar.m14786d(), "Can only rename a file within the same type of folder");
                        str = String.format(Locale.ROOT, "%s.%s", krtVar.f37087c, krtVar.f37088d);
                        File fileM14784b2 = krtVar.m14784b(this.f37032c);
                        if (!krtVarMo14768i.m14786d() && fileM14784b.renameTo(fileM14784b2)) {
                            ((krs) krzVar.f37099a).m14782m(new kry(fileM14784b2, krtVar, this.f37030a.f37034a));
                        }
                    }
                    krl krlVar = krzVar.f37099a;
                    if (krlVar instanceof kru) {
                        lku.m15617L(!krlVar.mo14767h().equals(Uri.EMPTY), "Cannot close file that doesn't exist in storage: % operation=%s", krzVar.f37099a, krzVar);
                        ContentProviderOperation.Builder builderNewUpdate = ContentProviderOperation.newUpdate(krzVar.f37099a.mo14767h());
                        krp krpVar = krzVar.f37102d;
                        lhz lhzVarM14774b = krpVar == null ? krp.m14774b() : krp.m14775c(krpVar);
                        lhzVarM14774b.m15370k(this.f37032c.f37055e, str);
                        lhzVarM14774b.m15369j(this.f37032c.f37057g, 0);
                        krp krpVarM15368i = lhzVarM14774b.m15368i();
                        krzVar.f37102d = krpVarM15368i;
                        arrayList.add(builderNewUpdate.withValues(krpVarM15368i.m14776a()).build());
                    }
                } else if (krtVarMo14768i.m14786d()) {
                    Uri uriMo14767h = krzVar.f37099a.mo14767h();
                    uriMo14767h.getClass();
                    arrayList.add(ContentProviderOperation.newDelete(uriMo14767h).build());
                } else if (!fileM14784b.delete()) {
                    this.f37030a.f37034a.mo13947i(String.format(Locale.ROOT, "Unable to delete file %s", fileM14784b));
                }
            }
            if (arrayList.isEmpty()) {
                this.f37030a.f37034a.mo13944f("No ContentProvider ops in publish.");
                return;
            }
            HashSet hashSet = new HashSet(new mue(arrayList, hnk.f28499l));
            lku.m15617L(hashSet.size() == 1, "Found multiple incompatible authorities %s when publishing transaction with contentproviderOps=%s", hashSet, arrayList);
            ContentProviderResult[] contentProviderResultArrApplyBatch = this.f37032c.f37052b.applyBatch((String) mkv.m16517Y(hashSet), arrayList);
            lku.m15613H(contentProviderResultArrApplyBatch.length == arrayList.size());
            for (int i = 0; i < contentProviderResultArrApplyBatch.length; i++) {
                ContentProviderResult contentProviderResult = contentProviderResultArrApplyBatch[i];
                if (!((krz) this.f37031b.get(i)).f37100b && !arrayList.get(i).isInsert()) {
                    lku.m15613H(contentProviderResult.count.intValue() == 1);
                }
            }
        } catch (OperationApplicationException | RemoteException e) {
            throw new IOException("Error inserting MediaStore record.", e);
        }
    }
}
