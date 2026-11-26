#!/usr/bin/env python3
"""Add verifiable numeric comparisons to existing territory reviews, never edit ratings."""
import collections
import difflib
import json
import pathlib
import re
import unicodedata
from decimal import Decimal
import yaml

ROOT=pathlib.Path.cwd()
DIMS=("impact","uniqueness","significance","experience","depth")
WEIGHTS=tuple(Decimal(str(json.loads((ROOT/"methodology/scoring.json").read_text())["dimensions"][k])) for k in DIMS)
STAMP="2026-11-26"
HEADING="#### Current YAML benchmark calibration — numerical coverage pass ("+STAMP+")"
REV=ROOT/"methodology/reviews"
REG=json.loads((ROOT/"countries/_registry.json").read_text())
CODES=sorted(REG["territories"])
REC={}
BY_ID={}
BY_CK=collections.defaultdict(list)
def norm(s):
    s=unicodedata.normalize("NFKD",str(s)).encode("ascii","ignore").decode().lower()
    return " ".join(re.findall(r"[a-z0-9]+",s))
def dec(x): return Decimal(str(x)) if x is not None else None
def fmt(x): return "null" if x is None else f"{x:.1f}"
def overall(vals):
    return None if any(v is None for v in vals) else sum(v*w for v,w in zip(vals,WEIGHTS))*10
for path in sorted((ROOT/"countries").glob("*/*/*.yaml")):
    c,k=path.relative_to(ROOT/"countries").parts[:2]
    if k not in ("cities","sights"): continue
    rec=yaml.safe_load(path.read_text())
    vals=tuple(dec(rec["scores"].get(d)) for d in DIMS)
    item={"key":(c,k,path.stem),"path":path.relative_to(ROOT).as_posix(),"name":rec["name"],"id":rec["id"],"vals":vals,"total":overall(vals),"cat":{n:dec(v) for n,v in (rec["scores"].get("categories") or {}).items()}}
    REC[item["key"]]=item
    BY_ID[item["id"]]=item
    BY_CK[c,k].append(item)
# Curated, type-specific candidate pools, ordered by intended comparability.
# Exact named peers from existing editorial reviews are always preferred.
CITY={
"capital":"MU/port-louis NC/noumea PF/papeete BR/brasilia AT/vienna MY/kuching WS/apia FK/stanley",
"historic":"SH/jamestown JP/hakodate MY/george-town KH/kampot VN/hoi-an AT/salzburg KH/koh-ker-village",
"harbor":"JP/hakodate MU/port-louis NC/noumea FK/stanley VN/rach-gia KH/kampot MY/kuala-perlis",
"resort":"VN/nha-trang TH/phuket-town MY/kuala-perlis KH/kep SI/bled VN/da-lat TH/pattaya",
"remote":"PN/adamstown NF/burnt-pine FK/stanley SH/jamestown MY/kuala-perlis KH/koh-ker-village NR/yaren",
"urban":"MY/kuching VN/da-nang JP/yokohama CA/vancouver MU/port-louis AT/vienna KH/kampot",
}
SIGHT={
"marine":"MY/sipadan-island-reefs PH/tubbataha ID/misool-marine-reserve VC/tobago-cays-marine-park JP/kerama-islands-marine-park ID/raja-ampat-archipelago SC/aldabra-atoll TH/ang-thong-national-marine-park",
"dive":"ID/cape-kri-dive-site MY/sipadan-island-reefs PH/tubbataha PF/tiputa-pass MV/hanifaru-bay-marine-protected-area ID/manta-point-nusa-penida VC/tobago-cays-marine-park",
"beach":"SC/anse-source-d-argent PF/matira-beach PH/white-beach-boracay TH/railay-beach BR/copacabana-beach VN/nha-trang-beach CC/direction-island",
"lagoon":"PF/bora-bora-lagoon VC/tobago-cays-marine-park PF/moorea-lagoon VN/ha-long-bay TH/ang-thong-national-marine-park ID/weekuri-lagoon SC/aldabra-atoll",
"island":"JP/ogasawara-islands SC/aldabra-atoll EC/galapagos-islands-world-heritage-property SH/nightingale-island FO/mykines CL/cabo-de-hornos-national-park VC/tobago-cays-marine-park",
"wildlife":"GS/st-andrews-bay FK/volunteer-point SC/cousin-island-special-reserve CL/los-pinguinos-natural-monument-magdalena-island MY/kinabatangan-wildlife-sanctuary TH/kui-buri-national-park EC/galapagos-islands-world-heritage-property CX/red-crab-migration",
"forest":"SH/peaks-national-park MU/black-river-gorges-national-park PT/laurisilva MY/kinabalu-park TH/khao-sok-national-park JP/shiretoko-national-park AT/kalkalpen-national-park",
"mountain":"AT/hohe-tauern-national-park PT/pico-mountain MY/mount-kinabalu CL/torres-del-paine-national-park CA/banff-national-park JP/mount-fuji",
"volcanic":"IT/etna US/hawaii-volcanoes-national-park ID/mount-bromo ES/teide TR/hierapolis-pamukkale ID/krakatau-volcanic-islands",
"glacial":"NO/geirangerfjord NO/naeroyfjord CA/athabasca-glacier CL/grey-glacier-torres-del-paine US/glacier-bay AR/los-glaciares-national-park CA/canadian-rocky-mountain-parks",
"coast":"IE/cliffs-of-moher JP/tojinbo-cliffs GB/durdle-door PT/ponta-sao-lourenco ID/broken-beach-nusa-penida JP/jogasaki-coast SC/anse-major-nature-trail",
"waterfall":"LA/kuang-si-waterfalls TH/erawan-waterfalls AR/iguazu-falls-argentine-circuits AT/krimml-waterfalls MY/kinabalu-park",
"cave":"SI/postojna-cave VN/son-doong-cave HR/blue-cave PT/benagil ID/rangko-cave LA/tham-phu-kham-cave ZW/chinhoyi-caves",
"lake":"SI/lake-bled TH/cheow-lan-lake KH/tonle-sap-lake ID/weekuri-lagoon PH/kayangan-lake NR/buada-lagoon",
"trail":"SC/anse-major-nature-trail PT/ponta-sao-lourenco GR/samaria JP/nakasendo-magome-tsumago-trail PE/inca-trail-to-machu-picchu AT/hohe-tauern-national-park",
"road":"NO/atlantic-road CA/icefields-parkway JP/shimanami-kaido-cycling-route AT/grossglockner-high-alpine-road VN/ha-giang-loop",
"garden":"SG/singapore-botanic-gardens MQ/jardin-de-balata MU/sir-seewoosagur-ramgoolam-botanical-garden SC/seychelles-national-botanical-garden MY/perdana-botanical-garden GB/kew-gardens",
"park":"TH/lumphini-park US/central-park AT/laxenburg-castle-park SG/merlion-park KH/siem-reap-royal-gardens",
"fort":"AT/hohensalzburg-fortress LK/galle-old-town-and-fortifications EE/kuressaare-fortress KR/suwon-hwaseong-fortress CN/xian-city-wall",
"historic":"PT/porto-historic-centre VN/hoi-an-ancient-town LK/galle-old-town-and-fortifications GS/grytviken SH/longwood-house CA/trondek-klondike",
"archaeology":"LA/plain-of-jars-archaeological-landscape GB/stonehenge CL/rano-kau-and-orongo MY/lenggong-valley-archaeological-heritage KH/angkor-archaeological-park BW/tsodilo-hills",
"rockart":"BW/tsodilo-hills NA/twyfelfontein NO/alta-rock-art CN/zuojiang-huashan-rock-art AR/cueva-de-las-manos TH/pha-taem-national-park",
"museum":"SH/museum-st-helena FK/historic-dockyard-museum BM/national-museum KH/national-museum-cambodia KR/national-museum-of-korea AT/kunsthistorisches-museum PN/pitcairn-museum",
"art":"JP/ghibli-museum SG/asian-civilisations-museum ES/guggenheim US/guggenheim-museum-new-york AT/kunsthistorisches-museum MY/sarawak-cultural-village",
"aquarium":"JP/okinawa-churaumi-aquarium BM/aquarium-museum-zoo NC/aquarium-des-lagons SG/lee-kong-chian-natural-history-museum MU/natural-history-museum-port-louis",
"religious":"JP/oura-church FK/christ-church-cathedral GL/hvalsey-church AT/st-stephens-cathedral TH/wat-phra-kaew LK/sigiriya-ancient-city-and-rock-fortress",
"memorial":"JP/hiroshima-peace-memorial-museum VN/war-remnants-museum AT/mauthausen-memorial SH/napoleons-tomb SG/kranji-war-memorial",
"tomb":"SH/napoleons-tomb JP/asuka-ishibutai-tomb ID/tomok-batak-royal-tombs CN/ming-tombs JO/petra-royal-tombs",
"market":"KH/made-in-cambodia-market TH/chatuchak-weekend-market VN/ben-thanh-market TR/grand-bazaar PF/papeete-market",
"bridge":"GB/forth-bridge US/brooklyn-bridge ES/vizcaya-bridge JP/irabu-bridge AT/highline179-suspension-bridge",
"building":"NO/oslo-opera-house DE/bayreuth-opera ES/guggenheim JP/edo-tokyo-open-air-architectural-museum VN/hanoi-opera-house SH/longwood-house",
"lighthouse":"BM/gibbs-hill-lighthouse AW/california-lighthouse FO/kallur-lighthouse NC/amedee-lighthouse PT/ponta-sao-lourenco",
"industrial":"GS/grytviken DE/zollverein GB/cornwall-mining NO/roros-heritage JP/manda-coal-mine FR/nord-mining",
"prison":"IE/kilmainham-gaol VN/con-dao-prison-complex JP/abashiri-prison-museum VN/hoa-lo-prison PL/auschwitz-birkenau",
"astronomy":"CL/atacama-astronomical-observing-tours PN/dark-sky-pitcairn ES/teide JO/wadi-rum-protected-area",
"water":"ID/weekuri-lagoon PN/st-pauls-pool NF/emily-slaughter-bays ID/rangko-cave PF/moorea-lagoon VC/tobago-cays-marine-park",
"landscape":"GB/pembrokeshire-coast PT/ponta-sao-lourenco JP/shiretoko-national-park TH/khao-sok-national-park AT/hohe-tauern-national-park",
}
CITY_PAT=[
("capital",r"\b(capital|administrative cent|seat of government)\b"),
("historic",r"\b(historic|colonial|heritage|old town|fortified)\b"),
("resort",r"\b(resort|beach town|tourism hub|beachfront)\b"),
("remote",r"\b(village|tiny|isolated|small settlement|remote|commercial settlement)\b"),
("harbor",r"\b(harbor|harbour|port|waterfront|coastal|maritime)\b")]
SIGHT_PAT=[
("astronomy",r"dark sky|dark-sky|stargaz|astronom|observator"),
("aquarium",r"aquarium|marine exhibits|captive marine"),
("rockart",r"rock art|rock-art|petroglyph|pictograph"),
("dive",r"\bdive\b|\bdiving\b|wreck|snorkel circuit|reef pass|blue hole"),
("lighthouse",r"lighthouse|light station"),
("market",r"\bmarket\b|bazaar"),
("waterfall",r"waterfall|cascade|falls\b"),
("glacial",r"glacier|iceberg|ice sheet|fjord|ice shelf|glaciated"),
("volcanic",r"volcano|volcanic crater|lava field|geothermal|sulphur|caldera"),
("cave",r"\bcave\b|cavern|grotto|lava tube"),
("tomb",r"\btomb\b|\bgrave\b|cemeter|burial"),
("memorial",r"memorial|monument to|commemorat"),
("prison",r"prison|penal|convict|gaol"),
("fort",r"\bfort\b|fortress|fortification|citadel|bastion"),
("religious",r"church|chapel|cathedral|mosque|temple|shrine|monastery|basilica"),
("garden",r"botanic|botanical|garden|arboretum"),
("museum",r"museum|collection|heritage centre|heritage center|interpretation centre"),
("art",r"gallery|cyclorama|art centre|art center|panorama|cultural centre|cultural center"),
("bridge",r"bridge"),
("industrial",r"mine\b|mining|factory|industrial|whaling station|dockyard|railway"),
("market",r"shopping|trading"),
("archaeology",r"archaeolog|prehistoric|ceremonial|marae|ruins"),
("historic",r"historic (town|centre|center|district|precinct|quarter|area)|heritage (district|precinct|landscape)|old town"),
("building",r"palace|historic house|mansion|residence|architecture|building"),
("wildlife",r"penguin|seabird|whale|dolphin|turtle|birdwatch|nesting|migration|wildlife|seal colony|sealions|sea lion|breeding"),
("water",r"tidal pool|natural pool|rock pool|bathing pool"),
("beach",r"\bbeach\b"),
("lagoon",r"\blagoon\b|\bbay\b"),
("marine",r"marine|reef|coral|underwater|snorkel"),
("island",r"atoll|archipelago|island group|islands\b|\bisland\b"),
("road",r"scenic road|drive|road corridor|cycling route"),
("coast",r"cliff|headland|coast|lookout|viewpoint|promontory|blowhole"),
("lake",r"\blake\b|reservoir|wetland"),
("forest",r"forest|rainforest|woodland|mangrove"),
("mountain",r"mountain|\bmount\b|summit|peak|ridge|volcanic cone"),
("trail",r"trail|hike|walking route|walking circuit|walk\b"),
("park",r"city park|urban park|public park|promenade|square"),
("landscape",r"national park|nature reserve|protected|conservation|landscape|valley"),
]
def classify(item, subject):
    title=norm(item["name"])
    subj=norm(subject)
    pats=CITY_PAT if item["key"][1]=="cities" else SIGHT_PAT
    for text in (title,subj):
        for label,pat in pats:
            if re.search(pat,text): return label
    return "urban" if item["key"][1]=="cities" else "landscape"
LINK=re.compile(r"\]\((?:\.\./){3}(countries/([A-Z]{2})/(cities|sights)/([^)\s]+)\.yaml)\)")
NUM=re.compile(r"^\s*(?:[—–:,]\s*)?\(?\s*(null|\d+(?:\.\d+)?)\s*/\s*(null|\d+(?:\.\d+)?)\s*/\s*(null|\d+(?:\.\d+)?)\s*/\s*(null|\d+(?:\.\d+)?)\s*/\s*(null|\d+(?:\.\d+)?)",re.I)
def numeric_links(section, complete=True):
    found={}
    for m in LINK.finditer(section):
        item=REC.get((m[2],m[3],m[4]))
        if not item: continue
        tail=section[m.end():].split("\n",1)[0]
        # allow "(Country), 1/..." and "(1 / ...)".
        tail=re.sub(r"^\s*\((?!\s*(?:null|\d))[^)]*\)\s*", "",tail)
        n=NUM.match(tail)
        if n:
            vals=tuple(None if x.lower()=="null" else dec(x) for x in n.groups())
            if vals==item["vals"] and (not complete or item["total"] is not None):
                found[item["key"]]=item
    return found
def covered(found):
    return len(found)>=4 and len({k[0] for k in found})>=3
def named_match(name,c,k):
    n=norm(name)
    if len(n)<3: return None
    options=[]
    for item in BY_CK[c,k]:
        names={norm(item["name"]),norm(item["key"][2]),norm(re.split(r"\s*\(",item["name"])[0])}
        if n in names: options.append((1.0,item))
        else:
            # A strict, unique, nearly exact name match only; no arbitrary slug guessing.
            score=max(difflib.SequenceMatcher(None,n,q).ratio() for q in names)
            if score>=.88: options.append((score,item))
    options.sort(key=lambda x:x[0],reverse=True)
    if not options or (len(options)>1 and options[0][0]-options[1][0]<.04): return None
    return options[0][1]
def named_peers(section,k):
    found={}
    for line in section.splitlines():
        for m in LINK.finditer(line):
            item=REC.get((m[2],m[3],m[4]))
            if item and item["key"][1]==k: found[item["key"]]=(item,"existing linked editorial peer")
        m=re.match(r"^\s*[-*]\s+(.+?)\s+\(([A-Z]{2})\)\s*(?::|—|–|,|$)(.*)",line)
        if m and "[" not in m[1]:
            item=named_match(m[1],m[2],k)
            if item: found[item["key"]]=(item,"existing named editorial peer")
    return found
def delta(item,peer):
    return ", ".join(f"{d[0].upper()} {a-b:+.1f}" for d,a,b in zip(DIMS,item["vals"],peer["vals"]) if a is not None and b is not None) or "no comparable assessed core field"
def peer_line(item,peer,origin):
    c,k,slug=peer["key"]
    name=peer["name"].replace("[","(").replace("]",")")
    profile="/".join(fmt(x) for x in peer["vals"])
    return f"- [{name} ({c})](../../../{peer['path']}) — {profile}; {origin}. Subject minus peer: {delta(item,peer)}."
def pool_items(kind,group):
    pool=(CITY if kind=="cities" else SIGHT)[group]
    for ref in pool.split():
        c,slug=ref.split("/")
        item=REC.get((c,kind,slug))
        if item and item["total"] is not None: yield item
MANUAL={
  "aw-casibari-rock-formations": "AW/ayo-rock-formations|Closest Aruba boulder formation comparison, separate cultural context;AX/getabergen-grottstigen|Comparable bounded rocky walking route;QA/ras-abrouq-rock-formations|Similar compact geological landscape, different erosion and desert context;TW/nanya-rock-formations|Distinctive rock forms, coastal rather than inland boulders",
  "aw-san-nicolas-murals": "MY/penang-street-art-armenian-street|Comparable street-art walking route within more substantial historic streets;KR/dongpirang-mural-village|Closest public mural streets with local neighborhood character;TW/rainbow-village-taichung|Concentrated colorful painted public environment with narrower scope;HK/m-plus-museum|Greater institutional art breadth, not public street art",
  "ax-karingsund": "HK/tai-o-fishing-village|Closer living fishing settlement, more distinctive stilt houses;TW/nanfangao-fishing-harbor|More extensive working harbor and fishery context;VN/ham-ninh-fishing-village|Comparable coastal fishing-village visit, different built heritage;TH/chanthaburi-waterfront-community|Broader historic waterside architecture and local life",
  "bv-bouvet": "CL/cabo-de-hornos-national-park|Comparable remote southern ocean island landscape with conditional expeditions;GS/st-andrews-bay|Documented authorized subantarctic wildlife viewing, unlike restricted subject;FO/mykines|Managed northern seabird island visitor trail, different climate;SC/aldabra-atoll|Remote inscribed island ecology with controlled visits, different geological origin;HM/heard-mcdonald-islands|Closely comparable remote glaciated volcanism, retain null visitor fields;GS/south-sandwich-islands|Similar protected volcanic islands with no ordinary visitor scope;TF/austral-lands|Much broader inscribed subantarctic marine and terrestrial ecology",
  "cc-pulu-keeling-national-park": "SC/aldabra-atoll|Remote protected atoll with regulated visits;PH/tubbataha|Much broader documented reef conservation and specialist visits;VC/tobago-cays-marine-park|Documented marine recreation, not evidence of access to this reef;ID/raja-ampat-archipelago|World-leading reef and island diversity with broad documented visitor scope;PN/henderson-island|Remote protected island and limited ordinary access, different raised coral setting;NF/phillip-island|Another restricted offshore island with unavailable public tours",
  "ck-manuae": "SC/aldabra-atoll|Remote protected atoll with regulated visits;PH/tubbataha|Much broader documented reef conservation and specialist visits;VC/tobago-cays-marine-park|Documented marine recreation, not evidence of access to this reef;ID/raja-ampat-archipelago|World-leading reef and island diversity with broad documented visitor scope;PN/oeno-atoll|Comparable uninhabited protected atoll;CC/pulu-keeling-national-park|Remote protected coral island without general tours;PN/ducie-atoll|Remote seabird and lagoon habitat",
  "cw-historic-willemstad": "PR/san-juan-national-historic-site|More monumental Atlantic fortification component, narrower town scope;BB/historic-bridgetown-and-its-garrison|Comparable colonial Caribbean port and garrison heritage;SR/historic-inner-city-of-paramaribo|Distinctive historic wooden urban ensemble;CO/port-fortresses-and-group-of-monuments-of-cartagena|Greater concentrated port fortification and monumental urban fabric",
  "cw-mikve-israel-emanuel": "BB/nidhe-israel-synagogue-and-museum|Close historic Caribbean Jewish heritage and museum;IN/paradesi-synagogue|Comparable historic maritime diaspora synagogue;HU/dohany-synagogue|Much larger monumental synagogue and interpreted history;MV/male-friday-mosque-hukuru-miskiiy|Focused historic active religious building, different faith and architecture",
  "gf-saul-trails": "CR/monteverde-cloud-forest-biological-reserve|Comparable forest-trail biodiversity experience with more established visitor interpretation;MU/black-river-gorges-national-park|Island native forest trail system with broader park scope;MY/taman-negara-national-park|More extensive tropical forest exploration;TH/khao-yai-national-park|Broader forest park routes and wildlife encounters;GF/tresor-reserve-trails|Closer local forest trail system, narrower scope",
  "gs-south-sandwich-islands": "CL/cabo-de-hornos-national-park|Comparable remote southern ocean island landscape with conditional expeditions;GS/st-andrews-bay|Documented authorized subantarctic wildlife viewing, unlike restricted subject;FO/mykines|Managed northern seabird island visitor trail, different climate;SC/aldabra-atoll|Remote inscribed island ecology with controlled visits, different geological origin;HM/heard-mcdonald-islands|Related remote active volcanic islands and incomplete ordinary visitor scope;BV/bouvet|Isolated glaciated volcanic reserve with no established ordinary tourism;TF/austral-lands|Broader subantarctic inscribed ecosystem",
  "hk-victoria-harbour": "SG/marina-bay-waterfront|Comparable dense modern skyline and engineered waterfront, different maritime history;MC/port-hercule-waterfront|Compact prominent harbor with smaller skyline and visitor scope;FR/marseille-harbor|Historically layered urban port, different visual density;MY/kuching-waterfront|More modest city waterfront with narrower harbor-scale experience",
  "hk-lantau-island": "KR/jeju-island|Broader volcanic island and visitor landscape with different geological significance;PT/madeira-levadas|More extensive developed mountain walking network, narrower route type;JP/ogasawara-islands|More distinctive remote endemic island ecology, different settlement character;BR/ilha-grande-authorized-island-trails-and-beaches|Comparable island landscape of permitted coastal and forest trails",
  "hk-dragons-back-trail": "PT/ponta-sao-lourenco|Comparable coastal ridge trail with longer exposed geological scenery;SC/anse-major-nature-trail|Focused coastal nature trail, different tropical landforms;JP/jogasaki-coast|Longer coastal rock and walking circuit, less ridge emphasis;FO/kallur-lighthouse|Comparable coastal ridge and viewpoint, different North Atlantic cliffs",
  "io-great-chagos-bank": "SC/aldabra-atoll|Remote protected atoll with regulated visits;PH/tubbataha|Much broader documented reef conservation and specialist visits;VC/tobago-cays-marine-park|Documented marine recreation, not evidence of access to this reef;ID/raja-ampat-archipelago|World-leading reef and island diversity with broad documented visitor scope;TF/glorieuses|Smaller coral archipelago conservation scope;CC/pulu-keeling-national-park|Smaller Ramsar protected coral island;TF/bassas-da-india|Near-submerged atoll morphology with no ordinary visitor scope",
  "io-peros-banhos": "SC/aldabra-atoll|Remote protected atoll with regulated visits;PH/tubbataha|Much broader documented reef conservation and specialist visits;VC/tobago-cays-marine-park|Documented marine recreation, not evidence of access to this reef;ID/raja-ampat-archipelago|World-leading reef and island diversity with broad documented visitor scope;IO/salomon-atoll|Closest related Chagossian historic landscape and restricted reef habitat;TF/tromelin|Distinct history of forced displacement and survival, not equivalent to Chagossian history;PN/oeno-atoll|Remote coral habitat without the same historical association",
  "io-diego-garcia": "SC/aldabra-atoll|Remote protected atoll with regulated visits;PH/tubbataha|Much broader documented reef conservation and specialist visits;VC/tobago-cays-marine-park|Documented marine recreation, not evidence of access to this reef;ID/raja-ampat-archipelago|World-leading reef and island diversity with broad documented visitor scope;IO/peros-banhos|Related Chagossian community and coral landscape heritage;TF/tromelin|Different remote island survival and displacement history;PN/henderson-island|Inscribed natural heritage with restricted access",
  "mo-taipa-village": "HK/tai-o-fishing-village|Closer small coastal village scope and vernacular fabric, different activities;VN/hoi-an-ancient-town|Much larger coherent historic mercantile streetscape;JP/sakitsu-village-and-church|Compact historic village heritage with distinct religious context;TH/chanthaburi-waterfront-community|Historic local streets and commercial culture, different architecture",
  "mo-grand-prix-museum": "LV/riga-motor-museum|Close specialist motor vehicle collection and interpretation;AD/motorcycle-museum-canillo|Comparable focused vehicle museum with different subject;JP/kyoto-railway-museum|Broader transport technology collection, different mode;JP/toyota-commemorative-museum|More extensive industrial and automotive interpretation",
  "mp-mariana-trench": "SC/aldabra-atoll|Remote protected atoll with regulated visits;PH/tubbataha|Much broader documented reef conservation and specialist visits;VC/tobago-cays-marine-park|Documented marine recreation, not evidence of access to this reef;ID/raja-ampat-archipelago|World-leading reef and island diversity with broad documented visitor scope;IO/great-chagos-bank|Different largely submerged shallow reef-bank morphology;TF/austral-lands|Much broader surface ecosystems, different deep marine scope;UM/kingman-reef|Near-submerged reef habitat, no conventional deep-trench visitation;HM/heard-mcdonald-islands|Different isolated geological and marine heritage",
  "sh-long-beach": "OM/ras-al-jinz-turtle-reserve|Close controlled seasonal turtle nesting experience;CR/tortuguero-national-park|Far broader turtle habitat, wetlands and established visitor circuits;MY/turtle-islands-park-sabah|Similar regulated nesting interpretation, different island habitat;SR/matapica-turtle-beach|Comparable seasonal turtle beach, no guarantee of encounters",
  "sh-gough-inaccessible-islands": "CL/cabo-de-hornos-national-park|Comparable remote southern ocean island landscape with conditional expeditions;GS/st-andrews-bay|Documented authorized subantarctic wildlife viewing, unlike restricted subject;FO/mykines|Managed northern seabird island visitor trail, different climate;SC/aldabra-atoll|Remote inscribed island ecology with controlled visits, different geological origin;PN/henderson-island|Comparable inscribed isolated island and restricted ordinary visitor scope;GS/south-sandwich-islands|Similar remote oceanic conservation with incomplete visitor scope",
  "tf-austral-lands": "CL/cabo-de-hornos-national-park|Comparable remote southern ocean island landscape with conditional expeditions;GS/st-andrews-bay|Documented authorized subantarctic wildlife viewing, unlike restricted subject;FO/mykines|Managed northern seabird island visitor trail, different climate;SC/aldabra-atoll|Remote inscribed island ecology with controlled visits, different geological origin;SH/gough-inaccessible-islands|Comparable restricted serial oceanic property, smaller scope;HM/heard-mcdonald-islands|More concentrated volcanic and glacial landscape;GS/south-sandwich-islands|Remote volcanic island chain, narrower ecological scope",
  "tf-juan-de-nova": "SC/aldabra-atoll|Remote protected atoll with regulated visits;PH/tubbataha|Much broader documented reef conservation and specialist visits;VC/tobago-cays-marine-park|Documented marine recreation, not evidence of access to this reef;ID/raja-ampat-archipelago|World-leading reef and island diversity with broad documented visitor scope;TF/glorieuses|Broader formally protected coral archipelago;TF/europa-island|Stronger specialized wetland and nesting habitat;CC/pulu-keeling-national-park|Remote coral island with documented access limits",
  "tf-bassas-da-india": "SC/aldabra-atoll|Remote protected atoll with regulated visits;PH/tubbataha|Much broader documented reef conservation and specialist visits;VC/tobago-cays-marine-park|Documented marine recreation, not evidence of access to this reef;ID/raja-ampat-archipelago|World-leading reef and island diversity with broad documented visitor scope;UM/kingman-reef|Close nearly submerged reef form, no ordinary visits;PN/ducie-atoll|Remote coral lagoon with emergent islets and seabird habitat;IO/great-chagos-bank|Much greater largely submerged bank scale",
  "um-palmyra-atoll": "SC/aldabra-atoll|Larger inscribed protected atoll ecology with regulated visits;CC/southern-lagoon-canoe|More established guided lagoon recreation, different visitor scope;PH/tubbataha|Broader protected reef specialist experience;VC/tobago-cays-marine-park|More established marine recreational visitor network;CC/pulu-keeling-national-park|Comparable remote protected coral island, no general tours;UM/kingman-reef|Closely related protected reef, no ordinary visitor access",
  "um-kingman-reef": "SC/aldabra-atoll|Remote protected atoll with regulated visits;PH/tubbataha|Much broader documented reef conservation and specialist visits;VC/tobago-cays-marine-park|Documented marine recreation, not evidence of access to this reef;ID/raja-ampat-archipelago|World-leading reef and island diversity with broad documented visitor scope;TF/bassas-da-india|Close near-submerged atoll morphology;IO/great-chagos-bank|Larger largely submerged bank;UM/palmyra-atoll|Broader reef and forest ecosystem with permitted visits",
  "um-baker-island": "SC/aldabra-atoll|Exceptional protected island ecology with documented regulated visits;JP/ogasawara-islands|Remote endemic island ecosystems with established visits;EC/galapagos-islands-world-heritage-property|Much broader managed island experience and ecological diversity;FO/mykines|Managed seabird-island trail, not evidence of permission at the subject;UM/howland-island|Comparable equatorial island, different aviation history;UM/jarvis-island|Similar equatorial coral and seabird habitat;PN/oeno-atoll|Different remote lagoon habitat;CC/pulu-keeling-national-park|Protected remote coral island and Ramsar habitat",
  "um-howland-island": "SC/aldabra-atoll|Exceptional protected island ecology with documented regulated visits;JP/ogasawara-islands|Remote endemic island ecosystems with established visits;EC/galapagos-islands-world-heritage-property|Much broader managed island experience and ecological diversity;FO/mykines|Managed seabird-island trail, not evidence of permission at the subject;UM/baker-island|Comparable equatorial island and settlement history;UM/jarvis-island|Similar coral and seabird habitat;TF/tromelin|Distinct remote survival and archaeological history",
  "um-jarvis-island": "SC/aldabra-atoll|Exceptional protected island ecology with documented regulated visits;JP/ogasawara-islands|Remote endemic island ecosystems with established visits;EC/galapagos-islands-world-heritage-property|Much broader managed island experience and ecological diversity;FO/mykines|Managed seabird-island trail, not evidence of permission at the subject;UM/baker-island|Comparable arid equatorial coral habitat;UM/howland-island|Similar reef habitat with distinct historical associations;PN/ducie-atoll|Remote coral lagoon and breeding birds",
  "um-johnston-atoll": "SC/aldabra-atoll|Remote protected atoll with regulated visits;PH/tubbataha|Much broader documented reef conservation and specialist visits;VC/tobago-cays-marine-park|Documented marine recreation, not evidence of access to this reef;ID/raja-ampat-archipelago|World-leading reef and island diversity with broad documented visitor scope;UM/wake-atoll|Similar altered atoll ecology and restricted visitor scope;UM/midway-atoll|Different history and more prominent seabird conservation;NF/phillip-island|Restricted island restoration habitat",
  "um-wake-atoll": "SC/aldabra-atoll|Remote protected atoll with regulated visits;PH/tubbataha|Much broader documented reef conservation and specialist visits;VC/tobago-cays-marine-park|Documented marine recreation, not evidence of access to this reef;ID/raja-ampat-archipelago|World-leading reef and island diversity with broad documented visitor scope;UM/johnston-atoll|Similarly altered restricted atoll habitat;UM/palmyra-atoll|Broader documented restoration and permitted visitor scope;CC/horsburgh-island|Smaller island with documented guided heritage experience;IO/salomon-atoll|Restricted remote coral habitat",
  "um-navassa-island": "SC/aldabra-atoll|Exceptional protected island ecology with documented regulated visits;JP/ogasawara-islands|Remote endemic island ecosystems with established visits;EC/galapagos-islands-world-heritage-property|Much broader managed island experience and ecological diversity;FO/mykines|Managed seabird-island trail, not evidence of permission at the subject;PN/henderson-island|Closely related raised coral island conservation with stronger inscribed heritage;TF/europa-island|Different mangrove and turtle habitat;NF/phillip-island|Restricted offshore refuge with no ordinary tours"
}
def choose(item,section,group):
    kind=item["key"][1]; selected={}; partial={}
    for entry in MANUAL.get(item["id"].removeprefix("sight-"),"").split(";"):
        if not entry: continue
        ref,reason=entry.split("|",1)
        c,slug=ref.split("/")
        peer=REC.get((c,kind,slug))
        if not peer or peer["key"]==item["key"]: continue
        dest=selected if peer["total"] is not None else partial
        dest[peer["key"]]=(peer,"targeted editorial comparison: "+reason)
    for key,(p,reason) in named_peers(section,kind).items():
        if key==item["key"]: continue
        if p["total"] is not None: selected.setdefault(key,(p,reason))
        else: partial.setdefault(key,(p,reason+"; incomplete profile, not counted toward four complete peers"))
    # Add same-type references and favor additional geographic codes.
    candidates=list(pool_items(kind,group))
    while not covered(selected):
        available=[p for p in candidates if p["key"]!=item["key"] and p["key"] not in selected]
        if not available: break
        seen={k[0] for k in selected}
        p=next((p for p in available if p["key"][0] not in seen),available[0])
        selected[p["key"]]=(p,"supplementary "+group+"-type numerical anchor")
    if not covered(selected):
        fallback="urban" if kind=="cities" else "landscape"
        candidates=list(pool_items(kind,fallback))
        while not covered(selected):
            available=[p for p in candidates if p["key"]!=item["key"] and p["key"] not in selected]
            if not available: break
            seen={k[0] for k in selected}
            p=next((p for p in available if p["key"][0] not in seen),available[0])
            selected[p["key"]]=(p,"broader numerical anchor; closer same-type peer needed")
    return selected,partial
def high_note(item,peers):
    notes=[]
    for field,v in zip(DIMS,item["vals"]):
        if v is not None and v>=Decimal("9.5"):
            i=DIMS.index(field)
            pp=max(peers,key=lambda p:p["vals"][i])
            notes.append(f"{field} {fmt(v)} vs {pp['name']} {fmt(pp['vals'][i])}")
    for field,v in item["cat"].items():
        if v is not None and v>=Decimal("9.5"):
            eligible=[p for p in peers if p["cat"].get(field) is not None]
            if eligible:
                pp=max(eligible,key=lambda p:p["cat"][field])
                notes.append(f"{field} category {fmt(v)} vs {pp['name']} {fmt(pp['cat'][field])}")
            else: notes.append(f"{field} category {fmt(v)}: same-category peer still needed")
    if item["total"] is not None and item["total"]>=90:
        pp=max(peers,key=lambda p:p["total"])
        notes.append(f"overall {item['total']:.2f} vs {pp['name']} {pp['total']:.2f}")
    return notes
def review_sections(text):
    return re.split(r"(?=^#{2,3} (?:city|sight)-[a-z]{2}-[a-z0-9-]+(?:\s|$))",text,flags=re.M)
counts={}; issues=[]; unmatched=[]; arithmetic=[]; changed_paths=[]
for code in CODES:
    stats=collections.Counter()
    for kind in ("cities","sights"):
        path=REV/code/(kind+".md")
        if not path.exists(): continue
        old=path.read_text()
        sections=review_sections(old)
        new=[]
        for section in sections:
            match=re.match(r"^#{2,3} ((?:city|sight)-[a-z]{2}-[a-z0-9-]+)(?:\s|$)",section)
            if not match:
                new.append(section); continue
            sid=match[1]; item=BY_ID.get(sid)
            if not item:
                issues.append(f"{code}: review {sid} lacks active YAML"); new.append(section); continue
            stats["records"]+=1;stats[kind]+=1
            stats["ranked" if item["total"] is not None else "unranked"]+=1
            pm=re.search(r"^(?:#{3,4} Worldwide (?:peer comparisons|peers)[ \t]*$|- Worldwide (?:peer comparisons|peers) \(I/U/S/E/D\):[ \t]*$)",section,re.M)
            sm=re.search(r"^(?:#{3,4} Scoring decisions[ \t]*$|- Impact(?:\s*:|\s+(?:null|\d)))",section,re.M)
            if not pm or not sm or sm.start()<=pm.end():
                issues.append(f"{sid}: missing comparison/scoring headings");new.append(section);continue
            # Regenerate only this script\x27s prior insertions; preserve manual and original comparisons.
            prior=section.find(HEADING,pm.end(),sm.start())
            if prior>=0:
                section=section[:prior]+section[sm.start():]
                sm=re.search(r"^(?:#{3,4} Scoring decisions[ \t]*$|- Impact(?:\s*:|\s+(?:null|\d)))",section,re.M)
            block=section[pm.end():sm.start()]
            existing=numeric_links(block)
            existing.pop(item["key"],None)
            subject=re.search(r"^- (?:Precise subject|Scope):\s*(.*)",section,re.M)
            label=classify(item,subject[1] if subject else "")
            stats["high"]+=bool(high_note(item,list(existing.values()))) if existing else 0
            om=re.search(r"^- (?:Computed worldwide overall|Overall):\s*(\d+(?:\.\d+)?)(?:/100)?",section,re.M)
            if not om: om=re.search(r"(?:Computed overall|Overall):\s*(\d+(?:\.\d+)?)/100",section,re.M)
            if om and item["total"] is not None and abs(dec(om[1])-item["total"])>Decimal(".005"):
                arithmetic.append(f"{sid}: review {om[1]} vs YAML {item['total']:.2f}")
            if covered(existing):
                stats["already_covered"]+=1;new.append(section);continue
            chosen,partial=choose(item,block,label)
            if not covered(chosen):
                issues.append(f"{sid}: fewer than four complete peers across three codes");new.append(section);continue
            stats["updated"]+=1
            stats["targeted_records"]+=any("targeted editorial" in reason for _,reason in chosen.values())
            stats["existing_named_matches"]+=sum("existing" in reason for _,reason in chosen.values())
            stats["supplemented_records"]+=any("supplementary" in reason or "broader" in reason for _,reason in chosen.values())
            stats["broad_records"]+=any("broader numerical" in reason for _,reason in chosen.values())
            stats["no_named_matches"]+=not any("existing" in reason or "targeted editorial" in reason for _,reason in chosen.values())
            if not any("existing" in reason or "targeted editorial" in reason for _,reason in chosen.values()): unmatched.append(sid)
            lines=[HEADING,"","Current branch YAML, core I/U/S/E/D; numeric differences are subject minus peer. Existing qualitative rationale above is preserved. Supplementary anchors are type-based editorial reference candidates, not independent factual or qualitative reassessments.",""]
            lines.extend(peer_line(item,p,reason) for p,reason in chosen.values())
            if partial:
                lines.extend(["","Incomplete additional references (not counted toward the four complete profiles):"])
                lines.extend(peer_line(item,p,reason) for p,reason in partial.values())
            high=high_note(item,[p for p,_ in chosen.values()])
            if high:
                stats["high"]+=1
                lines.extend(["","Exceptional-score numerical challenge (retained provisional, not independently substantiated by this calculation): "+"; ".join(high)+"."])
            if item["total"] is None:
                lines.extend(["","Unranked status retained. Comparison with rated peers does not establish missing dimensions or visitor permission."])
            lines.extend(["","No numerical score or evidence-status changes made by this pass.","",""])
            newsection=section[:sm.start()]+"\n".join(lines)+section[sm.start():]
            check=numeric_links(newsection[pm.end():newsection.index(sm[0],pm.end())])
            check.pop(item["key"],None)
            if not covered(check):
                issues.append(f"{sid}: verification failed after insertion")
            new.append(newsection)
        result="".join(new)
        if result!=old:
            path.write_text(result);changed_paths.append(path.relative_to(ROOT).as_posix())
    if stats["records"]:
        counts[code]=dict(stats)
# Strict coverage on every active record in scope (including missing reviews).
review_ids=set()
for code in counts:
    for path in (REV/code).glob("*.md"):
        if path.name not in ("cities.md","sights.md"): continue
        review_ids.update(re.findall(r"^#{2,3} ((?:city|sight)-[a-z]{2}-[a-z0-9-]+)(?:\s|$)",path.read_text(),re.M))
for item in REC.values():
    if item["key"][0] in CODES and item["id"] not in review_ids:
        issues.append(f"{item['id']}: missing active review")
report={"territory_codes_in_registry":len(CODES),"populated_territories":len(counts),"unpopulated_codes":sorted(set(CODES)-set(counts)),"records":sum(v["records"] for v in counts.values()),"updated":sum(v.get("updated",0) for v in counts.values()),"already_covered":sum(v.get("already_covered",0) for v in counts.values()),"ranked":sum(v.get("ranked",0) for v in counts.values()),"unranked":sum(v.get("unranked",0) for v in counts.values()),"supplemented_records":sum(v.get("supplemented_records",0) for v in counts.values()),"broader_records":sum(v.get("broad_records",0) for v in counts.values()),"no_named_matches":sum(v.get("no_named_matches",0) for v in counts.values()),"targeted_records":sum(v.get("targeted_records",0) for v in counts.values()),"changed_files":len(changed_paths),"counts":counts,"issues":issues,"arithmetic_discrepancies":arithmetic,"no_named_match_ids":unmatched}
if issues:
    print(json.dumps({k:v for k,v in report.items() if k not in ("counts","no_named_match_ids","arithmetic_discrepancies","issues")}))
    print("Coverage issues:",len(issues))
    for issue in issues: print("COVERAGE_ISSUE:",issue)
    pathlib.Path("/tmp/territory-benchmark-report.json").write_text(json.dumps(report,indent=2))
    raise SystemExit(1)
lines=["# Territory benchmark numerical coverage — "+STAMP,"","This pass resolves existing named editorial peers to current YAML and supplements missing comparisons with curated type-based anchors. It verifies numerical coverage, not independent material claims, peer appropriateness for every specialist record, or rating correctness. No YAML values, categories, nulls, evidence statuses, or older decisions changed.","","| Code | Settlements | Sights | Ranked | Unranked | Previously covered | Added | Type supplements | No resolved or targeted peer |","| --- | ---: | ---: | ---: | ---: | ---: | ---: | ---: | ---: |"]
for code,v in counts.items():
    lines.append("| "+code+" | "+" | ".join(str(v.get(k,0)) for k in ("cities","sights","ranked","unranked","already_covered","updated","supplemented_records","no_named_matches"))+" |")
lines.extend(["",f"Total: {report['records']} active reviews; {report['updated']} supplemented, {report['already_covered']} already numerically covered. Each active record has four distinct complete peer profiles across at least three geographic codes, checked against the same branch YAML. Incomplete peers are not counted.","","Unpopulated registry codes: "+", ".join(report["unpopulated_codes"])+". No new destinations invented.","","## Outstanding editorial checks","","Records with neither a resolved existing named peer nor targeted editorial comparison (supplementary anchors need closer manual review): "+str(report["no_named_matches"])+"."])
lines.extend("- "+sid for sid in unmatched)
lines.extend(["","Review total discrepancies against current YAML (not silently changed): "+str(len(arithmetic))+"."])
lines.extend("- "+x for x in arithmetic)
lines.append("")
(REvReport:=REV/"territory-benchmark-coverage-2026-11-26.md").write_text("\n".join(lines))
pathlib.Path("/tmp/territory-benchmark-report.json").write_text(json.dumps(report,indent=2))
print(json.dumps({k:v for k,v in report.items() if k not in ("counts","no_named_match_ids","arithmetic_discrepancies","issues")},sort_keys=True))
print("Review arithmetic discrepancies:",len(arithmetic))
