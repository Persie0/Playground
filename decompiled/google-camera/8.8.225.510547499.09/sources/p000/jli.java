package p000;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class jli extends jla {

    /* JADX INFO: renamed from: a */
    private num f34302a;

    /* JADX INFO: renamed from: a */
    protected abstract ktz mo4714a(Context context);

    /* JADX WARN: Type inference failed for: r1v76, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    @Override // p000.jla, p000.jlb
    /* JADX INFO: renamed from: c */
    public final void mo3987c(String str, byte[] bArr, byte[] bArr2, jkz jkzVar, nur nurVar) throws nyb {
        char c;
        num numVar = this.f34302a;
        nue nueVar = null;
        try {
            nxq nxqVarM18123Q = nxq.m18123Q(nwg.f44822c, bArr, 0, bArr.length, nxf.m18011a());
            nxq.m18132ae(nxqVarM18123Q);
            nwg nwgVar = (nwg) nxqVarM18123Q;
            if (nwgVar.f44824a.equals("type.googleapis.com/fedsql.SelectionCriteria")) {
                nwr nwrVar = nwgVar.f44825b;
                nxf nxfVarM18011a = nxf.m18011a();
                nue nueVar2 = nue.f44640d;
                nww nwwVarMo17791l = nwrVar.mo17791l();
                nxq nxqVarM18138P = nueVar2.m18138P();
                try {
                    try {
                        try {
                            nzm nzmVarM18260b = nzf.f45060a.m18260b(nxqVarM18138P);
                            nzmVarM18260b.mo18252h(nxqVarM18138P, nwx.m17885p(nwwVarMo17791l), nxfVarM18011a);
                            nzmVarM18260b.mo18250f(nxqVarM18138P);
                            try {
                                nwwVarMo17791l.mo17839z(0);
                                nxq.m18132ae(nxqVarM18138P);
                                nue nueVar3 = (nue) nxqVarM18138P;
                                lpe lpeVar = num.f44669b;
                                lpeVar.m15811j(Level.INFO, (String) lpeVar.f38883b, null, "Parsed selection criteria: %s", nueVar3);
                                nueVar = nueVar3;
                            } catch (nyb e) {
                                throw e;
                            }
                        } catch (IOException e2) {
                            if (!(e2.getCause() instanceof nyb)) {
                                throw new nyb(e2);
                            }
                            throw ((nyb) e2.getCause());
                        }
                    } catch (nyb e3) {
                        if (!e3.f44994a) {
                            throw e3;
                        }
                        throw new nyb(e3);
                    }
                } catch (nzx e4) {
                    throw e4.m18328a();
                } catch (RuntimeException e5) {
                    if (!(e5.getCause() instanceof nyb)) {
                        throw e5;
                    }
                    throw ((nyb) e5.getCause());
                }
            }
        } catch (nyb e6) {
            lpe lpeVar2 = num.f44669b;
            lpeVar2.m15811j(Level.WARNING, (String) lpeVar2.f38883b, e6, "Could not parse SQL selection criteria.", new Object[0]);
        }
        if (nueVar != null) {
            try {
                int i = nueVar.f44644c;
                lku.m15670x(i > 0, "min_client_sql_version must be set to a positive value");
                if (i > 2) {
                    throw new IllegalStateException(lku.m15665s("FedSqlQueryHandler version %s does not satisfy min_client_sql_version: %s", 2, Integer.valueOf(i)));
                }
                lku.m15670x(nueVar.f44642a != null, "client_query must be set.");
                nuf nufVar = nueVar.f44642a;
                if (nufVar == null) {
                    nufVar = nuf.f44645d;
                }
                switch (nufVar.f44647a) {
                    case 0:
                        c = 2;
                        break;
                    case 1:
                        c = 3;
                        break;
                    default:
                        c = 0;
                        break;
                }
                boolean z = c != 0 && c == 3;
                lku.m15670x(z, "SQLite is the only currently supported client_query.sql_dialect");
                lku.m15670x(nufVar.f44648b != null, "client_query.database_schema must be set");
                nud nudVar = nufVar.f44648b;
                if (nudVar == null) {
                    nudVar = nud.f44637b;
                }
                lku.m15670x(nudVar.f44639a.size() == 1, "client_query.database_schema.table must contain exactly one table.");
                nud nudVar2 = nufVar.f44648b;
                if (nudVar2 == null) {
                    nudVar2 = nud.f44637b;
                }
                nug nugVar = (nug) nudVar2.f44639a.get(0);
                lku.m15670x(!nugVar.f44652a.isEmpty(), "client_query_database_schema_table[0].name must be set.");
                lku.m15670x(!nugVar.f44654c.isEmpty(), "client_query.database_schema.table[0].anonymization_userid_column_name must be set");
                lku.m15670x(!nugVar.f44655d.isEmpty(), "client_query.database_schema.table[0].create_table_sql must be set");
                lku.m15670x(!nufVar.f44649c.isEmpty(), "client_query.raw_sql must be set.");
                lpe lpeVar3 = num.f44669b;
                Object[] objArr = new Object[1];
                nuf nufVar2 = nueVar.f44642a;
                if (nufVar2 == null) {
                    nufVar2 = nuf.f44645d;
                }
                objArr[0] = nufVar2.f44649c;
                lpeVar3.m15810i("Handling SQL query: %s", objArr);
                nwg nwgVar2 = nueVar.f44643b;
                if (nwgVar2 == null) {
                    nwgVar2 = nwg.f44822c;
                }
                mo3987c(str, nwgVar2.mo17760J(), bArr2, new nuh(numVar, this, nueVar, jkzVar), nurVar);
                return;
            } catch (IllegalArgumentException | IllegalStateException | NullPointerException e7) {
                jkzVar.mo13327a(8, e7.getMessage());
                return;
            }
        }
        num.f44669b.m15809h("Not a SQL query; caller should handle query.");
        try {
            nxq nxqVarM18123Q2 = nxq.m18123Q(nwg.f44822c, bArr, 0, bArr.length, nxf.m18011a());
            nxq.m18132ae(nxqVarM18123Q2);
            nwg nwgVar3 = (nwg) nxqVarM18123Q2;
            try {
                if (!nwgVar3.f44824a.isEmpty() && !"type.googleapis.com/intelligence.brella.proto.examplestore.SelectionCriteria".equals(nwgVar3.f44824a)) {
                    throw new nyb(String.format("Incorrect type url: %s, expected: %s", nwgVar3.f44824a, "type.googleapis.com/intelligence.brella.proto.examplestore.SelectionCriteria"));
                }
                nwr nwrVar2 = nwgVar3.f44825b;
                nxf nxfVarM18011a2 = nxf.m18011a();
                nuq nuqVar = nuq.f44680h;
                nww nwwVarMo17791l2 = nwrVar2.mo17791l();
                nxq nxqVarM18138P2 = nuqVar.m18138P();
                try {
                    try {
                        nzm nzmVarM18260b2 = nzf.f45060a.m18260b(nxqVarM18138P2);
                        nzmVarM18260b2.mo18252h(nxqVarM18138P2, nwx.m17885p(nwwVarMo17791l2), nxfVarM18011a2);
                        nzmVarM18260b2.mo18250f(nxqVarM18138P2);
                        try {
                            nwwVarMo17791l2.mo17839z(0);
                            nxq.m18132ae(nxqVarM18138P2);
                            nuq nuqVar2 = (nuq) nxqVarM18138P2;
                            nzw nzwVar = nuqVar2.f44686e;
                            if (nzwVar == null) {
                                nzwVar = nzw.f45101c;
                            }
                            if (nzwVar.f45103a < 0) {
                                throw new nyb("Start date less than zero");
                            }
                            nzw nzwVar2 = nuqVar2.f44686e;
                            if ((nzwVar2 == null ? nzw.f45101c : nzwVar2).f45104b >= 0) {
                                if ((nzwVar2 == null ? nzw.f45101c : nzwVar2).f45104b <= 999999999) {
                                    nzw nzwVar3 = nuqVar2.f44687f;
                                    if ((nzwVar3 == null ? nzw.f45101c : nzwVar3).f45103a < 0) {
                                        throw new nyb("End date less than zero");
                                    }
                                    if ((nzwVar3 == null ? nzw.f45101c : nzwVar3).f45104b >= 0) {
                                        if ((nzwVar3 == null ? nzw.f45101c : nzwVar3).f45104b <= 999999999) {
                                            if (nzwVar3 == null) {
                                                nzwVar3 = nzw.f45101c;
                                            }
                                            long j = nzwVar3.f45103a;
                                            if (nzwVar2 == null) {
                                                nzwVar2 = nzw.f45101c;
                                            }
                                            if (j < nzwVar2.f45103a) {
                                                throw new nyb("End date before start date");
                                            }
                                            try {
                                                nxq nxqVarM18123Q3 = nxq.m18123Q(nwg.f44822c, bArr2, 0, bArr2.length, nxf.m18011a());
                                                nxq.m18132ae(nxqVarM18123Q3);
                                                nwg nwgVar4 = (nwg) nxqVarM18123Q3;
                                                try {
                                                    if (!nwgVar4.equals(nwg.f44822c) && !"type.googleapis.com/intelligence.brella.proto.examplestore.ResumptionPoint".equals(nwgVar4.f44824a)) {
                                                        throw new nyb(String.format("Incorrect type url: %s, expected: %s", nwgVar4.f44824a, "type.googleapis.com/intelligence.brella.proto.examplestore.ResumptionPoint"));
                                                    }
                                                    nwr nwrVar3 = nwgVar4.f44825b;
                                                    nxf nxfVarM18011a3 = nxf.m18011a();
                                                    nup nupVar = nup.f44676c;
                                                    nww nwwVarMo17791l3 = nwrVar3.mo17791l();
                                                    nxq nxqVarM18138P3 = nupVar.m18138P();
                                                    try {
                                                        try {
                                                            nzm nzmVarM18260b3 = nzf.f45060a.m18260b(nxqVarM18138P3);
                                                            nzmVarM18260b3.mo18252h(nxqVarM18138P3, nwx.m17885p(nwwVarMo17791l3), nxfVarM18011a3);
                                                            nzmVarM18260b3.mo18250f(nxqVarM18138P3);
                                                            try {
                                                                nwwVarMo17791l3.mo17839z(0);
                                                                nxq.m18132ae(nxqVarM18138P3);
                                                                nup nupVar2 = (nup) nxqVarM18138P3;
                                                                if ((nupVar2.f44678a == 1 ? ((Long) nupVar2.f44679b).longValue() : 0L) < 0) {
                                                                    throw new nyb("LastReturnedId less than zero");
                                                                }
                                                                ktz ktzVarMo4714a = mo4714a(this);
                                                                ktz.m14847i(str);
                                                                jkzVar.mo13328b(new jlk((jln) ktzVarMo4714a.f37198a, str, nuqVar2, nupVar2, ktzVarMo4714a.f37199b));
                                                                return;
                                                            } catch (nyb e8) {
                                                                throw e8;
                                                            }
                                                        } catch (nyb e9) {
                                                            if (!e9.f44994a) {
                                                                throw e9;
                                                            }
                                                            throw new nyb(e9);
                                                        } catch (IOException e10) {
                                                            if (!(e10.getCause() instanceof nyb)) {
                                                                throw new nyb(e10);
                                                            }
                                                            throw ((nyb) e10.getCause());
                                                        }
                                                    } catch (nzx e11) {
                                                        throw e11.m18328a();
                                                    } catch (RuntimeException e12) {
                                                        if (!(e12.getCause() instanceof nyb)) {
                                                            throw e12;
                                                        }
                                                        throw ((nyb) e12.getCause());
                                                    }
                                                } catch (nyb e13) {
                                                    Log.w("ExampleStoreSvc", e13.getMessage());
                                                    jkzVar.mo13327a(10, e13.getMessage());
                                                    return;
                                                }
                                            } catch (nyb e14) {
                                                Log.w("ExampleStoreSvc", "Error parsing Any proto from resumptionPoint");
                                                jkzVar.mo13327a(10, "Error parsing Any proto from resumptionPoint");
                                                return;
                                            }
                                        }
                                    }
                                    throw new nyb("Invalid end date nanos");
                                }
                            }
                            throw new nyb("Invalid start date nanos");
                        } catch (nyb e15) {
                            throw e15;
                        }
                    } catch (nyb e16) {
                        if (!e16.f44994a) {
                            throw e16;
                        }
                        throw new nyb(e16);
                    } catch (IOException e17) {
                        if (!(e17.getCause() instanceof nyb)) {
                            throw new nyb(e17);
                        }
                        throw ((nyb) e17.getCause());
                    }
                } catch (nzx e18) {
                    throw e18.m18328a();
                } catch (RuntimeException e19) {
                    if (!(e19.getCause() instanceof nyb)) {
                        throw e19;
                    }
                    throw ((nyb) e19.getCause());
                }
            } catch (nyb e20) {
                String strConcat = "Error parsing SelectionCriteria proto: ".concat(String.valueOf(e20.getMessage()));
                Log.w("ExampleStoreSvc", strConcat);
                jkzVar.mo13327a(10, strConcat);
            }
        } catch (nyb e21) {
            Log.w("ExampleStoreSvc", "Error parsing Any proto from criteria");
            jkzVar.mo13327a(10, "Error parsing Any proto from criteria");
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f34302a = new num(Executors.newSingleThreadExecutor());
    }
}
